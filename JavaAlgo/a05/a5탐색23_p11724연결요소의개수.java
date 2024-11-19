package a05;

import java.io.*;
import java.util.*;

public class a5탐색23_p11724연결요소의개수 {

	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n+1];
		visited = new boolean[n+1];
		for(int i =1;i<=n;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int u =  Integer.parseInt(st.nextToken());
			int v =  Integer.parseInt(st.nextToken());
			arr[u].add(v);
			arr[v].add(u);		
		}
		
		int cnt = 0;
		for(int i = 1;i<=n;i++) {
			if(!visited[i]) {
				cnt++;
				dfs(i);
			}
		}
		System.out.println(cnt);
		
	}
	private static void dfs(int u) {
		if(visited[u]) {
			return;
		}
		visited[u] = true;
		for(int i = 0;i< arr[u].size(); i++ ) {
			int v = arr[u].get(i);
			if(!visited[v]) {
				dfs(v);				
			}
			
		}
	}



	
	
}
