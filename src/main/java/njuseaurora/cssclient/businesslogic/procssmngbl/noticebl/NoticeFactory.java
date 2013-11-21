package njuseaurora.cssclient.businesslogic.procssmngbl.noticebl;

import njuseaurora.cssclient.businesslogicservice.processmngblservice.notice.NoticeBLService;

public class NoticeFactory {
	public NoticeFactory() {
		// TODO Auto-generated constructor stub
	}
	public NoticeBLService createNoticeBL()
	{
		return new NoticeController();
	}
}
