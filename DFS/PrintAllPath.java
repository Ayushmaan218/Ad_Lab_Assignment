package DFS;

import java.util.*;

public class PrintAllPath {
	public static class Edge {
		int src;
		int dst;

		public Edge(int s, int d) {
			this.src = s;
			this.dst = d;
		}
	}

	public static void createdgraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		graph[1].add(new Edge(1, 3));
		graph[1].add(new Edge(1, 0));
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 5));
		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 5));
		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));
		graph[6].add(new Edge(6, 5));
	}

	public static void printAllPath(ArrayList<Edge> graph[], int curr, int dst, boolean vis[], String path) {
		if (curr == dst) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (vis[e.dst] == false) {
				vis[curr] = true;
				printAllPath(graph, e.dst, dst, vis, path + e.dst);
				vis[curr] = false;
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createdgraph(graph);
		boolean vis[] = new boolean[v];
		int src = 0;
		int dst = 5;
		printAllPath(graph, src, dst, vis, "0");
		System.out.println();

	}

}
