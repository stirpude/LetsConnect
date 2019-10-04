package linear;

public class ListNode {
	
	private int data;
	private ListNode next;
	public int val;
	
	public ListNode(int data,ListNode next) {
		
		this.data = data;
		this.next = next;
		
	}
	
	public int getData() {
		
		return data;
		
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public void setData(int data) {
		
		this.data =data;
		
	}
	
public void setNext(ListNode next) {
		
		this.next = next;
		
	}

}
