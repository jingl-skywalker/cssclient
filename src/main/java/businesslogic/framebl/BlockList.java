package businesslogic.framebl;

import java.util.ArrayList;

public class BlockList {
	
	private ArrayList<Block> blist;
	
	public BlockList() {
		blist=new ArrayList<Block>();
	}
	public boolean add(Block b)
	{
		return blist.add(b);
	}
	public boolean remove(Block b)
	{
		return blist.remove(b);
	}
	public boolean modify()
	{
		return false;
	}
}
