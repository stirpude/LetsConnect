
import java.util.*;

public class Bfs {
	
	static void traversal(Node node) {
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(node);
		
		while(!q.isEmpty()) {
			
			node = q.remove();
			System.out.println(node.data + " ");
			if(node.left != null)
			{
				q.add(node.left);
				System.out.println(node.data + "i am in left ");
			}
			if(node.right !=null) {
				q.add(node.right);
				System.out.println(node.data + "i am in right");
				
			}
			
		}
	}

}
