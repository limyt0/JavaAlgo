//수정 필요
package a07;

import java.io.*;
import java.util.*;

public class a07정수론44_p1033_칵테일 {
	//static int n;//재료 수
	static ArrayList<cNode>[] alist;//인접리스트
	static long lcm; //최소공배수
	static long[] d;//각 노드 저장 배열
	static boolean[] visited;//방문여부 저장 배열
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		alist = new ArrayList[n];
		visited = new boolean[n];
		d = new long[n];
		lcm = 1;
		for(int i=0;i<n;i++) {
			alist[i] = new ArrayList<cNode>();			
		}
		
		for(int i = 0;i<n-1;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			alist[a].add(new cNode(b,p,q));
			alist[b].add(new cNode(a, p, q));			
			lcm *= (p*q / gcd(p,q)); 
		}
		d[0] = lcm;
		DFS(0);
		long mgcd = d[0];
		for(int i = 1;i<n;i++) {
			mgcd = gcd(mgcd, d[i]);
		}
		
		StringBuilder sb = new StringBuilder("");
		for(int i =0;i<n;i++) {
			long result = (d[i] / mgcd);
			//System.out.println(sb);
			//sb.append(d[i]+"/"+mgcd+"="+ result + "\n");
		}
		//System.out.println(sb);
	}
	private static void DFS(int node) {
		visited[node] = true;
		for( cNode i:alist[node]) {
			int next = i.getB();
			if(!visited[next]) {
				d[next] = d[node] * i.getQ() / i.getP();
				DFS(next);
			}
		}
	}
	private static long gcd(long a, long b) {
		if(b ==0)
			return a;
		else
			return gcd(b, a % b);
	}
	
	
	
	
}
 class cNode{
	int b;
	int p;
	int q;
	public cNode(int b, int p, int q) {
		super();
		this.b = b;
		this.p = p;
		this.q = q;			
	}
	public int getB() {
		return b;			
	}
	public int getP() {
		return p;
	}
	public int getQ() {
		return q;
	}
}
