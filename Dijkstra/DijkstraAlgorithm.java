package Dijkstra;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
	public static class Edge {
		int src;
		int dst;
		int wt;

		public Edge(int s, int d, int w) {
			this.src = s;
			this.dst = d;
			this.wt = w;
		}
	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		graph[0].add(new Edge(0, 1, 2));
		graph[0].add(new Edge(0, 2, 4));
		graph[1].add(new Edge(1, 2, 1));
		graph[2].add(new Edge(2, 4, 3));
		graph[3].add(new Edge(3, 5, 1));
		graph[4].add(new Edge(4, 3, 2));
		graph[4].add(new Edge(4, 5, 5));

	}

	public static class Pair implements Comparable<Pair> {
		int node;
		int dst;

		public Pair(int n, int d) {
			this.node = n;
			this.dst = d;
		}

		@Override
		public int compareTo(Pair p2) {
			return this.dst - p2.dst;
		}

	}

	public static void dijkstra(ArrayList<Edge> graph[], int V, int src) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		int d[] = new int[V];
		for (int i = 0; i < V; i++) {
			if (i != src) {
				d[i] = Integer.MAX_VALUE;
			}
		}
		boolean vis[] = new boolean[V];
		pq.add(new Pair(src, d[src]));
		while (!pq.isEmpty()) {
			Pair curr = pq.remove();
			if (!vis[curr.node]) {
				vis[curr.node] = true;
				for (int i = 0; i < graph[curr.node].size(); i++) {
					Edge e = graph[curr.node].get(i);
					int u = e.src;
					int v = e.dst;
					if (d[u] + e.wt < d[v]) {
						d[v] = d[u] + e.wt;
						pq.add(new Pair(v, d[v]));
					}
				}
			}
		}
		for (int i = 0; i < V; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int V = 6;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);

		dijkstra(graph, V, 0);
	}

}