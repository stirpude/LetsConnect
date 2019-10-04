

public class BreadthFirstSearch {
	
	
	
		
		/*private Node[] nodes;
		private static int EDGE_DISTANCE = 6;
		
		public Graph(int size){}
		private class Node{}
		private Node getNode(int id) {}
		public void addEdge(int first ,int second) {}
		
		public int[] shortestReach(int startId) {
			LinkedList<Integer> queue = new LinkedList<Integer>();
			
			queue.add(startId);
			//boolean[] visited =new boolean[nodes.length];
			int[] distances = new int[nodes.length];
			Arrays.fill(distances,-1);
			distances[startId]=0;
			
			while(!queue.isEmpty()) {
				int node = queue.poll();
				for(int neighbor : nodes[node].neighbors) {
					
					if(distances[neighbor]==-1) {
						distances[neighbor] = distances[node] + EDGE_DISTANCE;
						
						queue.add(neighbor);
					}
					
				}
			}
			
			return distances;
			
			
			
			
		}*/
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Node tree = sample_tree();
			Bfs.traversal(tree);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}
	
	
	private static Node sample_tree() {
		
		Node root = new Node ("A",
				new Node("B",
						new Node("C"), new Node ("D")),
				new Node ("E",
						new Node ("F"), new Node ("G",
								new Node("H"),null)));
		
		return root;
		
	}

}
