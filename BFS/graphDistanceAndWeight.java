package BFS;

import java.util.*;

public class graphDistanceAndWeight {
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
		graph[0].add(new Edge(0, 2, 2));
		graph[1].add(new Edge(1, 2, 10));
		graph[1].add(new Edge(1, 3, 0));
		graph[2].add(new Edge(2, 0, 2));
		graph[2].add(new Edge(2, 1, 10));
		graph[2].add(new Edge(2, 3, -1));
		graph[3].add(new Edge(3, 1, 0));
		graph[3].add(new Edge(3, 2, -1));

	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int v = 4;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createdgraph(graph);
		for (int i = 0; i < graph[2].size(); i++) {
			Edge e = graph[2].get(i);
			System.out.println("distance " + e.dst + " ");
			System.out.println("weight " + e.wgt + " ");
			System.out.println();
		}
		System.out.println();

	}

}
