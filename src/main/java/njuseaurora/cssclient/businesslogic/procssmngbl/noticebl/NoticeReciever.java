/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.noticebl;

import njuseaurora.cssclient.businesslogicservice.processmngblservice.notice.NoticeReceiverService;
import njuseaurora.cssclient.businesslogicservice.processmngblservice.notice.ROLE;

/**
 *
 * @author Administrator
 */
public class NoticeReciever implements NoticeReceiverService{
    private NoticeController controller;
    ROLE role;

    public NoticeReciever( ROLE role) {
        controller=new NoticeController();
        this.role = role;
    }
    
    public NoticeList getNoticeList()
    {
        return controller.getNoticeList(role);
    }
    
}
