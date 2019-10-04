import java.io.*;
import java.lang.*;



public class ListNode {

		
		public static ListNode create(int n)
	      {
		    ListNode list = null;
		    for(int k=1; k <= 5; k++) {
		        list = new ListNode();
		    }
	  	    return list;
	      }
		
		public static void print(ListNode list)
	      {
		    while (list != null) {
		        System.out.print(list.getValue()+" ");
		        list = list.getNext();
		    }
		    System.out.println();
	      }
	}

create Method{
	
}
