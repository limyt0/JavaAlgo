package a07;

import java.io.*;
import java.util.*;

public class a07정수론44_p1033_칵테일 {

	static ArrayList<Cnodes>[] arr; 
	static boolean visited[];
	static int n;
	static long biglcm;
	static long d[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		visited = new boolean[n];
		arr = new ArrayList[n];
		biglcm = 1;
		d = new long[n];
		for(int i = 0;i<n;i++) {
			arr[i] = new ArrayList<Cnodes>();
		}
		for(int i =0;i<n-1;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			arr[a].add(new Cnodes(b, p, q));
			arr[b].add(new Cnodes(a, q, p));
			biglcm *= (p * q / gcd(p, q));
		}
		d[0] = biglcm;
		dfs(0);
		long mgcd = d[0];
		for(int i = 1;i<n;i++) {
			mgcd = gcd(mgcd, d[i]);
		}
		for(int i = 0;i<n;i++) {
			System.out.print(d[i]/ mgcd+ " ");
		}
		
		//System.out.println("result"+lcm);
	}
	private static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
		
	}
	
	
	
	private static void dfs(int node) {
		visited[node] = true;
		for(int i = 0;i<arr[node].size();i++) {
			int b = arr[node].get(i).b;
			int p = arr[node].get(i).p;
			int q = arr[node].get(i).q;
			//System.out.println(b+", "+p+", " + q);
			if(!visited[b]) {
				d[b] = (d[node] * q) / p; 
				dfs(b);
			}
		}
	
//		for(Cnodes i : arr[node]) {
//			int next = i.b;
//			if(!visited[next]) {
//				d[next] = d[node] * i.q / i.p;
//				dfs(next);
//			}
//		}
	}




	
	
	
}

class Cnodes{
	public int b;
    public int p;
	public int q;
	public Cnodes(int b, int p, int q){
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
