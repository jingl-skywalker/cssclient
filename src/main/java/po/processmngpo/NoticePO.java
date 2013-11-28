/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.processmngpo;

import java.util.Date;

import businesslogic.procssmngbl.noticebl.Notice;

/**
 *
 * @author Administrator
 */
public class NoticePO {
	private int num;
    private String content;
    private Date time;

    public NoticePO(int num,String content,Date time)
    {
    	this.num=num;
    	this.content=content;
    	this.time=time;
    }
    
    public NoticePO(Notice notice)
    {
    	this(notice.getNum(),notice.getContent(), notice.getTime());
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
    
}
