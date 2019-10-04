
import java.util.*;

public class Bfs {
	
	static void traversal(Node node) {
		if(node==null)
			return;
		System.out.println(node.data);
		traversal(node.left);
		//System.out.println("Hi"+node.data);
		traversal(node.right);
	}

}
