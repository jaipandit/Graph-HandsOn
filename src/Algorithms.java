import java.util.Iterator;
import java.util.Stack;

public class Algorithms {
	
	public static Stack<Integer> topologicalSort(Graph graph) {
		Stack<Integer> result = new Stack<Integer>();
		boolean[] visited = new boolean[graph.adj.length];
		for(int i=0;i<graph.adj.length;i++) {
			if(!visited[i]) {
				topologicalHelper(i, visited, result, graph);
			}
		}
		return result;
	}
	
	private static void topologicalHelper(int nodeToVisit, 
			boolean[] visitedRecords, 
			Stack<Integer> result,
			Graph graph) {
		// 1. Visited the node.
		visitedRecords[nodeToVisit] = true;
		Iterator<Integer> childNodes = graph.adj[nodeToVisit].iterator();
		
		// 2. DFS it, i.e visit all child.
		while(childNodes.hasNext()) {
			int child = childNodes.next();
			if(!visitedRecords[child]) {
				topologicalHelper(child, visitedRecords, result, graph);
			}
		}
		
		//3. Now its a new sink node. because all sinks ahead of it are visited now.
		result.push(nodeToVisit);
	}

}
