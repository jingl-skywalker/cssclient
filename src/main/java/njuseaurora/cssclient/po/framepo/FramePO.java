/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.po.framepo;

import java.util.ArrayList;
import njuseaurora.cssclient.businesslogic.framebl.Block;
import njuseaurora.cssclient.businesslogic.framebl.EduFrame;

/**
 *
 * @author Administrator
 */
public class FramePO {

    private int total;
    private String base;
    private ArrayList<BlockPO> blocks = new ArrayList<BlockPO>();
    private Block[] blist;
    private boolean isPublic = false;

    public FramePO(int total, String base) {
        this.total = total;
        this.base = base;
    }

    public FramePO(EduFrame f) {
        this(f.getTotal(), f.getDescription());

    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void addBlock(BlockPO blockPO) {
        getBlocks().add(blockPO);
    }

    public void setPublic() {
        this.setIsPublic(true);
    }

    public ArrayList<BlockPO> getBlocks() {
        //   return blist.toBlockArray();
        return this.blocks;
    }

    public void setBlocks(ArrayList<BlockPO> blocks) {
        this.blocks = blocks;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
    public BlockPO getBlockPO(int i)
    {
        return this.blocks.get(i);
    }
    public int getBlockSum()
    {
        return this.blocks.size();
    }
}
