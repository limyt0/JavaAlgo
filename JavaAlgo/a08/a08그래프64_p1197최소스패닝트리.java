package a08;

import java.io.*;
import java.util.*;

public class a08그래프64_p1197최소스패닝트리 {
	static int[] parent;
	static PriorityQueue<pEdge> queue;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		queue = new PriorityQueue<>();
		parent = new int[V+1];
		for(int i=0;i<V;i++) {
			parent[i] = i;
		}
		for(int i = 0;i<E;i++) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			int c= Integer.parseInt(st.nextToken());
			queue.add(new pEdge(a, b, c));
		}
		
		int useEdge = 0;
		int result = 0;
		
		while(useEdge < V - 1) {
			pEdge now = queue.poll();
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result = result + now.v;
				useEdge++;
			}
		}
		System.out.println(result);
	}
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b) {
			parent[b] = a;
		}
		
	}
	private static int find(int a) {
		if(a == parent[a]) {
			return a;
		}else {
			
			return parent[a] = find(parent[a]);
		}
	}
}

class pEdge implements Comparable<pEdge>{
	int s;
	int e;
	int v;
	pEdge(int s, int e, int v){
		
		this.s = s;
		this.e = e;
		this.v = v;
	}
	@Override
	public int compareTo(pEdge o) {
		return this.v - o.v;
	}
}