package a08;

import java.io.*;
import java.util.*;

public class a08그래프58_p1854K번째최단경로찾기 {
	static final int INF = 100000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] w = new int[1001][1001];
		
		PriorityQueue<Integer>[] distQueue = new PriorityQueue[n+1];
		Comparator<Integer> cp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 < o2 ? 1: -1;
			}
		};
		for(int i =0;i<n+1;i++) {
			distQueue[i] = new PriorityQueue<Integer>(k, cp);
		}
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			w[a][b] = c;
		}
		PriorityQueue<Node58> pq = new PriorityQueue<>();
		pq.add(new Node58(1,0));
		distQueue[1].add(0);
		while(!pq.isEmpty()) {
			Node58 u = pq.poll();
			for(int adjNode = 1;adjNode <=n;adjNode++) {
				if(w[u.node][adjNode] !=0) {
					if(distQueue[adjNode].size()<k) {
						distQueue[adjNode].add(u.cost+w[u.node][adjNode]);
						pq.add(new Node58(adjNode, u.cost+w[u.node][adjNode]));
					}
				}else if(distQueue[adjNode].peek() > u.cost + w[u.cost][adjNode]) {
					distQueue[adjNode].poll();
					distQueue[adjNode].add(u.cost + w[u.cost][adjNode]);
					pq.add(new Node58(adjNode, u.cost+w[u.cost][adjNode]));
				}
			}
		}
		for(int i = 1;i<=n;i++) {
			if(distQueue[i].size() == k) {
				bw.write(distQueue[i].peek());
			}else {
				bw.write(-1+ "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}


class Node58 implements Comparable<Node58>{
	int node;
	int cost;
	public Node58(int node, int cost) {
		this.node = node;
		this.cost = cost;
	}
	@Override
	public int compareTo(Node58 o) {
		
		return this.cost < o.cost ? -1:1;
	}
}