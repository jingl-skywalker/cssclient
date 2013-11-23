/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.noticebl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import njuseaurora.cssclient.businesslogicservice.processmngblservice.notice.NoticeBLService;
import njuseaurora.cssclient.vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public class NoticeUIDriver {

    ArrayList<NoticeVO> notices;
    JTextArea contentArea = new JTextArea("just for test the notice annoucement");
    boolean isJWSelected = true;
    boolean isTeacherSelected = true;
    boolean isStudentSelected = true;
    JTextField nameField = new JTextField("notice name for test");
    int validNoticeNum = 1;
    NoticeBLService nbls;

    public NoticeUIDriver() {
    }

    public NoticeUIDriver(NoticeBLService nbls) {
        this.nbls = nbls;
    }

    public void createNoticePressed() {
        //every thiing will happen in the level ui
    }

    public void lookNoticePressed() {
        nbls.getNoice(validNoticeNum);
    }

    public void sendNoticePressed() {
        String name = nameField.getText();
        String Content = contentArea.getText();
        Date date = new Date();
        NoticeVO nvo = new NoticeVO(name, Content, date, isJWSelected, isJWSelected, isJWSelected);
        nbls.send(nvo);
    }

    public void getAllNotice() {
        notices = new ArrayList<NoticeVO>();
        NoticeList nlist = nbls.getNoticeList();
        Iterator<Notice> itr = nlist.getIterator();
        while (itr.hasNext()) {
            notices.add(new NoticeVO(itr.next()));
        }
    }
}
