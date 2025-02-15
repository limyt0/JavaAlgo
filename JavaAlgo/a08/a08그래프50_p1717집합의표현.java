package a08;

import java.util.*;

public class a08그래프50_p1717집합의표현 {
	static int[] parent;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		parent = new int[n+1];
		
		for(int i =1;i<=n;i++) {
			parent[i] = i;
		}
		
		for(int i = 0;i<m;i++) {
			int question = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(question == 0) {
				union(a,b);
			}else {
				if(checkSame(a,b)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
	}
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) {
			parent[b] = a;
		}
	}
	private static int find(int a) {
		if(a== parent[a]) {
			return a;
		}else {
			return parent[a] = find(parent[a]); 
		}
	}
	private static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		if(a == b) {
			return true;
		}
		return false;
	}

	

}
