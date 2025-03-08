package a08;

import java.io.*;
import java.util.*;

public class a08그래프57_p1916최소비용구하기 {
	static ArrayList<Node>[] list;
	static boolean[] visited;
	static int[] dist;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		list = new ArrayList[N+1]; 
		for(int i = 0;i<=N;i++) {
			list[i] = new ArrayList<Node>();
		}
		visited = new boolean[N+1];
		dist = new int[N+1];
		Arrays.fill(dist,  Integer.MAX_VALUE);
		for(int i =0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			list[s].add(new Node(e, cost));
		}
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		bw.write(dijkstra(start, end)+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
	private static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		dist[start] = 0;
		while(!pq.isEmpty()) {
			Node nowNode = pq.poll();
			int now = nowNode.tartgetNode;
			if(!visited[now]) {
				visited[now] = true;
				for(Node n: list[now]) {
					int tn = n.tartgetNode;
					if(!visited[tn] && dist[tn] > dist[now]+ n.value) {
						dist[tn] = dist[now] + n.value;
						pq.add(new Node(tn, dist[tn]));
					}
				}
			}
		}
		return dist[end];
	}
}

class Node implements Comparable<Node>{
	int tartgetNode;
	int value;
	public Node(int targetNode, int value){
		this.tartgetNode = targetNode;
		this.value = value;
	}
	@Override
	public int compareTo(Node o) {
		
		return value - o.value;
	}
}