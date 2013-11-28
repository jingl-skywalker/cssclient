package businesslogic.framebl;

import vo.framevo.BlockVO;
import vo.framevo.FrameVO;

public class Frame {
	private String description;
	private BlockList bList;
	private int total;
	private boolean isPublic;

	public Frame() {
	}

	public Frame(String description, int total) {
		this.description = description;
		this.total = total;
	}

	public Frame(FrameVO fvo) {

	}

	public boolean modifyBlock(BlockVO bvo) {
		return false;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public boolean setPublic()
	{
		this.isPublic=true;
		return true;
	}
}
