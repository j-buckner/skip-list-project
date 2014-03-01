import java.util.*;

public class SkipList {
	
	private SkipListNode head;
	private SkipListNode tail;
	
	public SkipList(){
		head = new SkipListNode(Double.POSITIVE_INFINITY*(-1));
		tail = new SkipListNode(Double.POSITIVE_INFINITY);
	}
	
}
