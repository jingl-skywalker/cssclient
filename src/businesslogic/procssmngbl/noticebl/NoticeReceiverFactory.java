package businesslogic.procssmngbl.noticebl;

import businesslogicservice.processmngblservice.notice.NoticeReceiverService;
import businesslogicservice.processmngblservice.notice.ROLE;

public class NoticeReceiverFactory {
	public NoticeReceiverFactory() {
	}
	NoticeReceiverService createReceiver(ROLE role)
	{
		return new NoticeReciever(role);
	}
	
}
