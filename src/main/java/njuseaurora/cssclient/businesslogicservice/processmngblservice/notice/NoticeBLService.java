/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.processmngblservice.notice;

import njuseaurora.cssclient.businesslogic.procssmngbl.noticebl.NoticeList;
import njuseaurora.cssclient.vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public interface NoticeBLService {

    public boolean send(NoticeVO nvo, ROLE role);

    public boolean send(NoticeVO nvo);

    public NoticeList getNoticeList();

    public NoticeList getNoticeList(ROLE role);

    public NoticeVO getNoice(int inde);
}
