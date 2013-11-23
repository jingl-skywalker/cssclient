/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.noticebl;

import java.util.Date;

import njuseaurora.cssclient.businesslogicservice.processmngblservice.notice.ROLE;
import njuseaurora.cssclient.po.processmngpo.NoticePO;
import njuseaurora.cssclient.vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public class Notice {

    private ROLE role;
    private static int index = 0;
    private String content;
    private Date time;
    private int num;
    private String name;

    public Notice() {
        index++;
        this.num = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Notice(String content, Date time) {
        this();
        this.content = content;
        this.time = time;
    }

    public Notice(NoticeVO nvo) {
        this(nvo.getContent(), nvo.getTime());
    }

    public Notice(NoticePO npo) {
        this(npo.getContent(), npo.getTime());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getNum() {
        return this.num;
    }

    public ROLE getRole() {
        return this.role;
    }

    public boolean send() {
        NoticePO npo = new NoticePO(this);

        return false;
    }

    public boolean send(ROLE role) {
        return false;
    }
}
