package BellmanFord;

import java.util.ArrayList;

public class BellmanFordAlgorithm {
	public static class Edge {
		int src;
		int dst;
		int wgt;

		public Edge(int s, int d, int w) {
			this.src = s;
			this.dst = d;
			this.wgt = w;
		}
	}

	public static void createdgraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0, 1, 2));
		graph[1].add(new Edge(1, 2, 4));
		graph[1].add(new Edge(1, 2, -4));
		graph[2].add(new Edge(2, 3, 2));
		graph[2].add(new Edge(3, 4, 4));
		graph[2].add(new Edge(4, 1, -1));

	}

	public static void bellman(ArrayList<Edge> graph[], int V, int src) {
		int d[] = new int[V];
		for (int i = 0; i < V; i++) {
			if (i != src) {
				d[i] = Integer.MAX_VALUE;
			}

		}
		for (int k = 0; k < V - 1; k++) {
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < graph[i].size(); j++) {
					Edge e = graph[i].get(j);
					int u = e.src;
					int v = e.dst;
					if (d[u] != Integer.MAX_VALUE && d[u] + e.wgt < d[v]) {
						d[v] = d[u] + e.wgt;
					}
				}
			}
		}
		for (int i = 0; i < V; i++) {
			System.out.println(d[i] + " ");
		}
		System.out.println();
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int V = 5;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createdgraph(graph);
		bellman(graph, V, 0);

	}

}
