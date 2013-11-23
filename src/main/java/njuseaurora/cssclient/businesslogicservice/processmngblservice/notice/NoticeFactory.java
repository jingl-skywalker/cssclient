/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.processmngblservice.notice;

import njuseaurora.cssclient.businesslogic.procssmngbl.noticebl.NoticeController;

/**
 *
 * @author Administrator
 */
public class NoticeFactory {

    public NoticeBLService bl;

    public NoticeBLService createNoticeBL() {
        return new NoticeController();
    }
}
