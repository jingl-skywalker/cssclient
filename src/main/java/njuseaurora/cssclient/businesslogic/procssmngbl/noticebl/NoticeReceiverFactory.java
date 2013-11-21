package njuseaurora.cssclient.businesslogic.procssmngbl.noticebl;

import njuseaurora.cssclient.businesslogicservice.processmngblservice.notice.NoticeReceiverService;
import njuseaurora.cssclient.businesslogicservice.processmngblservice.notice.ROLE;

public class NoticeReceiverFactory {
	public NoticeReceiverFactory() {
	}
	NoticeReceiverService createReceiver(ROLE role)
	{
		return new NoticeReciever(role);
	}
	
}
