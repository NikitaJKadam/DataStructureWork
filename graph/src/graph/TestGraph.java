package graph;

public class TestGraph {

	public static void main(String[] args) {
		Graph g=new Graph(7);
		g.display();
		g.bfs(0);
		System.out.println();
		g.dfs(1, new int[7]);

	}

}
