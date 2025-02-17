package a08;

import java.util.*;

public class a08그래프52_p1043거짓말 {
	static int[] parent;
	static ArrayList<Integer>[] arr;
	static int[] tple;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		parent = new int[n+1];
		arr = new ArrayList[m];
		tple = new int[t+1];
		for(int i = 1;i<=n;i++) {
			parent[i]= i;	
		}
		for(int i = 1;i<=t;i++) {
			tple[i] = sc.nextInt();
		}
				
		for(int i=0;i<m;i++) {
			int p = sc.nextInt();
			arr[i] = new ArrayList<Integer>();
			for(int j = 0;j<p;j++) {
				int next = sc.nextInt();
				arr[i].add(next);
			}
		}
		
		for(int i=0;i<m;i++) {
			int index = arr[i].get(0);
			for(int j: arr[i]){
				union(index,j);
			}
		}
		
		int result = 0;
		for(int i=0;i<m;i++) {
			boolean isPossible = true;
			int index = arr[i].get(0);
			for(int check: tple) {
				if(find(index) == find(check)) {
					isPossible = false;
					break;
				}
			}
			if(isPossible) {
				result++;
			}
		}
		System.out.println(result);
		
	}
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a !=b) {
			parent[b] = a;
		}
	}
	private static int find(int a) {
		if(parent[a] == a) {
			return a;
		}else {
			return parent[a] = find(parent[a]);
		}
	}

}
