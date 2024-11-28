package a05;

import java.io.*;
import java.util.*;

public class a5탐색26_p1260DFS와BFS {
	static ArrayList<Integer>[] arr; 
	static boolean[] visited;
	static int n;
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n+1];
		for(int i =1;i<=n;i++) {
			arr[i] = new ArrayList<Integer>();			
		}
		
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}
		visited = new boolean[n+1];
		dfs(v, 0);
		System.out.println("");
		visited = new boolean[n+1];
		bfs(v);
		
		
	}
	private static void bfs(int num) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(num);
		visited[num] = true;
		
		while(!queue.isEmpty()) {
			num = queue.poll();
			System.out.print(num+" ");
			for(int i =0;i< arr[num].size();i++) {
				int next = arr[num].get(i);
				if(!visited[next]) {
					queue.add(next);
					visited[next] = true;
				}
			}
		}
		
		
	}
	private static void dfs(int num, int cnt) {
		if(cnt == n) 
		{
			return;
		}
		visited[num] = true;
		System.out.print(num+" ");
		for(int i=0;i< arr[num].size(); i++) {
			int next = arr[num].get(i);
			if(!visited[next]) {
				dfs(next, cnt+1);
			}
		}			
	}
	
	
	
	
}
