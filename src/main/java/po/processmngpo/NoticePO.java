/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.processmngpo;

import java.util.Date;

import businesslogic.procssmngbl.noticebl.Notice;
import businesslogic.procssmngbl.statebl.TimeFormatImpl;
import businesslogicservice.processmngblservice.notice.ROLE;
import businesslogicservice.processmngblservice.state.TimeFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class NoticePO {

    private String LEFT = "[";
    private String RIGHT = "]";
    private String NEWLINE = "^";
    private String SEP = "$";
    private ROLE role;
    private String title;
    private int num;
    private String content;
    private Date time;
    private String dateString;

    public NoticePO(String storeString) {
        String[] strings=storeString.split(SEP);
        //this.role = (ROLE)Integer.parseInt(strings[4]);
        this.role= ROLE.getRole(strings[4]);
        this.title = strings[1];
        this.num = Integer.parseInt(strings[0]);
        this.content = strings[2];
        this.time =getDate(strings[3]) ;
    }

    public NoticePO(ROLE role, String title, int num, String content, Date time) {
        this.role = role;
        this.title = title;
        this.num = num;
        this.content = content;
        this.time = time;
        initDateString();
    }

    public NoticePO(Notice notice) {
        this(notice.getRole(), notice.getName(), notice.getNum(), notice.getName(), notice.getTime());
    }

    public String getContent() {
        return content;
    }
    public Date getDate(String s)
    {
        TimeFormat tf=new TimeFormatImpl();
        Date date=tf.getTime(s);
        return date;
        
    }
    public void initDateString() {
        TimeFormat tf = new TimeFormatImpl();
        dateString=tf.getFormattedTimeString(time);
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

    public String toStoreString() {
        StringBuffer sbf = new StringBuffer();

        sbf.append(num);
        sbf.append(SEP);
        sbf.append(title);
        sbf.append(SEP);
        sbf.append(LEFT);
        sbf.append(content);
        sbf.append(RIGHT);
        sbf.append(dateString);
        sbf.append(SEP);
        sbf.append(role);
        return sbf.toString();
    }
}
