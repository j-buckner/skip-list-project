
public class SkipListNode {
	private double value;
	private SkipListNode left;
	private SkipListNode right;
	private SkipListNode up;
	private SkipListNode down;
	
	public SkipListNode(double val, SkipListNode left, SkipListNode right, SkipListNode up, SkipListNode down){
		this.left = left;
		this.right = right;
		this.up = up;
		this.down = down;
		
		value = val;
	}
	
	public SkipListNode(double val){
		value = val;
	}
	
	public SkipListNode getDirection(String direction){
		if(direction.equals("left")){
			return this.left;
		}else if(direction.equals("right")){
			return this.right;
		}else if(direction.equals("up")){
			return this.up;
		}else if(direction.equals("down")){
			return this.down;
		}
		
		return null;
	}
	
	public void setDirection(String direction, SkipListNode newNode){
		if(direction.equals("left")){
			left = newNode;
		}else if(direction.equals("right")){
			right = newNode;
		}else if(direction.equals("up")){
			up = newNode;
		}else if(direction.equals("down")){
			down = newNode;
		}
	}
	
	public int getVal(){
		return this.value;
	}
	
	public void setVal(int val){
		this.value = val;
	}
	
}
