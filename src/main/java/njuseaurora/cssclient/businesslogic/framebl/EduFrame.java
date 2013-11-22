package njuseaurora.cssclient.businesslogic.framebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import njuseaurora.cssclient.dataservice.datafactory.DataFactory;
import njuseaurora.cssclient.dataservice.framedataservice.FrameDataService;
import njuseaurora.cssclient.po.framepo.BlockPO;
import njuseaurora.cssclient.po.framepo.FramePO;
import njuseaurora.cssclient.vo.framevo.FrameVO;

public class EduFrame {

    FrameDataService fds;
    DataFactory dataFactory;
    private String description;
    private BlockList bList;
    private int total;
    private boolean isPublic;

    public EduFrame() {
        bList = new BlockList();
        try {
            dataFactory = (DataFactory) Naming.lookup("datafactory");
            fds = dataFactory.getFrameData();
        } catch (NotBoundException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public EduFrame(String description, int total) {
        this.description = description;
        this.total = total;
    }



    public BlockList getBlocks() {
        return bList;
    }

    public boolean addBlock(Block block) {
        this.bList.add(block);
        return true;
    }

    public boolean modifyBlock(int num, Block block) {
        return false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean setPublic() {
        this.isPublic = true;
        this.save();
        return true;
    }

    public FrameVO find() {
        FramePO fpo = null;
        try {
            fpo = fds.find();
        } catch (RemoteException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        FrameVO fvo = new FrameVO(fpo);
        return fvo;
    }

    private boolean save() {
        FramePO fpo = new FramePO(total, description);
        int size = bList.getSum();
        for (int i = 0; i < size; i++) {
            fpo.addBlock(new BlockPO(bList.getBlock(i)));
        }
        try {
            fds.update(fpo);
        } catch (RemoteException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
