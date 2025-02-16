package a08;

import java.util.*;

public class a08그래프51_p1976여행가자 {
	static int[] parent;
	static int[][] arr;
	static int[] list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[n+1][n+1];
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		list = new int[m+1];
		
		for(int i =1;i<=m;i++) {
			list[i] = sc.nextInt();
		}
		
		parent = new int[n+1];

		for(int i = 1;i<=n;i++) {
			parent[i] = i;
		}
		
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(arr[i][j] == 1) union(i,j);
			}					
		}
		boolean result = true;
		int index = find(list[1]);
		for(int i = 2; i<=m;i++) {
			if(index != find(list[i])) {
				result = false;
				break;
			}			
		}
		
		if(result) {
			System.out.println("YES");			
		}else {
			System.out.println("NO");
			
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
		if(a == parent[a]) {
			return a;
		}else {
			return parent[a] = find(parent[a]);			
		}
	}
	
}
