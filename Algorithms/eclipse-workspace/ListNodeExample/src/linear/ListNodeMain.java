package linear;

public class ListNodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode start = new ListNode(5,new ListNode (6,new ListNode(7,null)));
		
		System.out.println(start.getData());
		System.out.println(start.getNext().getData());
		System.out.println(start.getNext().getNext().getData());
		//System.out.println(start.getNext().getNext().getNext().getData());
		
		

	}

}
