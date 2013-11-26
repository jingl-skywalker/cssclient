/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.procssmngbl.noticebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import businesslogicservice.processmngblservice.notice.NoticeBLService;
import businesslogicservice.processmngblservice.notice.ROLE;
import dataservice.datafactory.DataFactory;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import po.processmngpo.NoticePO;
import vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public class NoticeController implements NoticeBLService {
    DataFactory dataFactory;
    NoticeDataService noticeDataService;
    NoticeList nList;
    ArrayList<NoticePO> npos;

    public NoticeController() {
        initNoticeList();
    }

    private void initNoticeList() {
        try {
            dataFactory= (DataFactory) Naming.lookup("datafactory");
            npos = noticeDataService.find();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException ex) {
            Logger.getLogger(NoticeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(NoticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        nList = new NoticeList(npos);
    }

    @Override
    public boolean send(NoticeVO nvo, ROLE role) {

        Notice notice = new Notice(nvo);
        NoticePO noticepo=new NoticePO(notice);
        try {
            noticeDataService.insert(noticepo);
        } catch (RemoteException ex) {
            Logger.getLogger(NoticeController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return nList.add(nvo) && notice.send(role);

    }

    @Override
    public boolean send(NoticeVO nvo) {
        Notice notice = new Notice(nvo);
        return nList.add(nvo) && notice.send();
    }

    @Override
    public NoticeList getNoticeList() {
        return nList;
    }

    @Override
    public NoticeList getNoticeList(ROLE role) {
        NoticeList roleList = new NoticeList();
        Iterator<Notice> iterator = nList.getIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getRole().equals(role)) {
                roleList.add(iterator.next());
            }
        }
        return roleList;
    }

    @Override
    public NoticeVO getNoice(int num) {
        return new NoticeVO(nList.getX(num));
    }
}
