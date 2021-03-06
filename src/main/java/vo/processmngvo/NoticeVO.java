/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.processmngvo;

import java.util.Date;

import businesslogicservice.processmngblservice.notice.ROLE;

/**
 *
 * @author Administrator
 */
public class NoticeVO {
    static int count=0;
    private int num;
    private String title;
    private String content;
    private Date time;
    private boolean R1;
    private boolean R2;
    private boolean R3;
    private ROLE role;

    public NoticeVO(String title,String content, Date time) {
        num=(++count);
        this.title=title;
        this.content = content;
        this.time = time;
    }

    public NoticeVO(String title, String content, Date time, boolean R1, boolean R2, boolean R3) {
        this(title,content,time);
        this.R1 = R1;
        this.R2 = R2;
        this.R3 = R3;
    }
    
    private void  initRole()
    {
        if(this.R1&&this.R2&&this.R3)
        {
            this.role= ROLE.ALL;
        }else if(this.R1)
        {
            this.role=ROLE.INSJW;
        }else if(this.R2)
        {
            this.role=ROLE.TEACHER;
        }else if(this.R3)
        {
            this.role=ROLE.STUDENT;
        }
    }
    public String getContent() {
        return content;
    }

    public Date getTime() {
        return time;
    }
    
}
