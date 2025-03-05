package a08;

import java.io.*;
import java.util.*;

public class a08그래프56_p1753최단경로 {
	
	static int V,E,K;
	static ArrayList<Edge>[] list;
	static int[] distance;
	static boolean[] visited;
	static PriorityQueue<Edge> q = new PriorityQueue<Edge>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		K = Integer.parseInt(st.nextToken());
		list = new ArrayList[V+1];
		
		for(int i =1;i<=V;i++) {
			list[i] = new ArrayList<Edge>();
		}
		distance = new int[V+1];
		for(int i = 0;i<=V;i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		visited = new boolean[V+1];
		for(int i =0;i<E;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			list[u].add(new Edge(v,w));
		}
		q.add(new Edge(K, 0));
		distance[K] = 0;
		while(!q.isEmpty()) {
			Edge current = q.poll();
			int c_vertex = current.vertex;
			if(visited[c_vertex]) continue;
			visited[c_vertex] = true;
			for(int i = 0;i<list[c_vertex].size();i++) {
				Edge tmp = list[c_vertex].get(i);
				int next = tmp.vertex;
				int value = tmp.value;
				if(distance[next] > distance[c_vertex] + value) {
					distance[next] = distance[c_vertex] + value;
					q.add(new Edge(next, distance[next]));
				}
			}
		}
		for(int i =1;i<=V;i++) {
			if(visited[i]) {
				System.out.println(distance[i]);
			}else {
				System.out.println("INF");
			}
		}
		
		
	}
}

class Edge implements Comparable<Edge>{
	int vertex, value;
	Edge(int vertex, int value){
		this.vertex = vertex;
		this.value = value;
	}
	public int compareTo(Edge e) {
		if(this.value > e.value) return 1;
		else return -1;
	}
}