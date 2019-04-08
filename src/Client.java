import java.util.Stack;

public class Client {
	
	public static void main(String[] arg) {
		Graph g = new Graph(7);
		g.add(0,1);
		g.add(1, 2);
		g.add(2, 3);
		g.add(0, 3);
		g.add(0, 4);
		g.add(4, 3);
		
		Stack<Integer> result = Algorithms.topologicalSort(g);
		Utils.printStack(result);
	}

}
