package a08;

import java.io.*;
import java.util.*;

public class a08그래프48_p1707이분그래프 {

	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	static int[] check;
	static boolean isEven;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		for(int t = 0;t<k;t++) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr = new ArrayList[v+1];
			for(int i = 1;i<=v;i++) {
				arr[i] = new ArrayList<Integer>();
			}
			visited = new boolean[v+1];
			check = new int[v+1];
			isEven = true;
						
			for(int i = 0;i<e;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[a].add(b);
				arr[b].add(a);
			}
			
			for(int i = 1;i<=v;i++) {
				if(isEven) {
					dfs(i);
				}else {
					break;
				}
			}
			if(isEven) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	private static void dfs(int node) {
		visited[node] = true;
		for(int i : arr[node]) {
			if(!visited[i]) {
				check[i] = (check[node] + 1) % 2;
				dfs(i);
			}else if(check[i] == check[node]) {
				isEven = false;
			}
		}
		
	}

	

}
