/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.noticebl;

import java.util.ArrayList;
import java.util.Iterator;

import njuseaurora.cssclient.po.processmngpo.NoticePO;
import njuseaurora.cssclient.vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public class NoticeList {
    private ArrayList<Notice> list;
    
   
    public NoticeList()
    {
    	list=new ArrayList<Notice>();
    }
    public NoticeList(ArrayList<NoticePO> npos){
    	for(NoticePO npo:npos)
    	{
    		list.add(new Notice(npo));
    	}
    }
    public NoticeList getNoticeList(){
        return this;
    }
    public boolean add(NoticeVO nvo)
    {
    	Notice n=new Notice(nvo);
    	return  list.add(n);
    }
    public boolean add(Notice n)
    {
    	return  list.add(n);
    }
    public Iterator<Notice> getIterator()
    {
    	return list.iterator();
    }
    public Notice getX(int index)
    {
    	return list.get(index);
    }
}
