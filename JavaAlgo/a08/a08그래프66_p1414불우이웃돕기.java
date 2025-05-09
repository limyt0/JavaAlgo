package a08;

import java.io.*;
import java.util.*;

public class a08그래프66_p1414불우이웃돕기 {
	static int[] parent;
	static int N, sum;
	static PriorityQueue<lEdge> queue;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		queue = new PriorityQueue<>();
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			char[] tempc = st.nextToken().toCharArray();
			for(int j = 0;j<N;j++) {
				int temp = 0;
				if(tempc[j]>= 'a' && tempc[j]<='z') {
					temp = tempc[j] - 'a' + 1;
				}else if(tempc[j] >= 'A' && tempc[j] <='Z') {
					temp = tempc[j] - 'A' +1;
				}
				sum = sum + temp;
				if(i !=j && temp !=0) queue.add(new lEdge(i,j,temp));
			}
		}
		parent = new int[N];
		for(int i = 0;i<parent.length;i++) {
			parent[i] = i;
		}
		int useEdge = 0;
		int result = 0;
		while(!queue.isEmpty()) {
			lEdge now = queue.poll();
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result = result  + now.v;
				useEdge++;
			}
		}
		if(useEdge == N-1) System.out.println(sum - result);
		else System.out.println(-1);
	}
	static int find(int a) {
		if(a == parent[a]) return a;
		else return parent[a] = find(parent[a]);
	}
	static void union(int a, int b) {
		a= find(a); b= find(b);
		if(a !=b) parent[b] = a;
	}
	

}

class lEdge implements Comparable<lEdge>{
	int s, e,v;
	lEdge(int s, int e, int v){
		this.s= s;
		this.e = e;
		this.v = v;
	}
	@Override
	public int compareTo(lEdge o) {
		
		return this.v - o.v;
	}
	
}