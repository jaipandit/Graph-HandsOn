import java.util.LinkedList;

public class Graph {
	
	public final LinkedList<Integer>[] adj;
	
	public Graph(int v){
		adj = new LinkedList[v]; 
		for(int i=0;i<adj.length;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void add(int u, int v) {
		adj[u].add(v);
	}
	
}
