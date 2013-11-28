package businesslogic.procssmngbl.noticebl;

import businesslogicservice.processmngblservice.notice.NoticeBLService;

public class NoticeFactory {
	public NoticeFactory() {
		// TODO Auto-generated constructor stub
	}
	public NoticeBLService createNoticeBL()
	{
		return new NoticeController();
	}
}
