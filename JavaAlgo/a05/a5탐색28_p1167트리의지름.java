package a05;

import java.io.*;
import java.util.*;

public class a5탐색28_p1167트리의지름 {

	static int v;
	static ArrayList<Edge>[] arr;
	static boolean[] visited;
	static int[] distance;
	public static void main(String[] args) throws IOException   {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		v = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[v+1];
		visited = new boolean[v+1];
		distance = new int[v+1];
		
		for(int i =1;i<=v;i++) {
			arr[i] = new ArrayList<Edge>();
		}
		
		for(int i=0;i<v;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			while(true) {
				int e = Integer.parseInt(st.nextToken());
				if(e == -1) {
					break;
				}
				int dist = Integer.parseInt(st.nextToken());
				arr[s].add(new Edge(e, dist));
			}
		}
		
		bfs(1);
		
		int max = 1;
		for(int i = 2;i<=v;i++) {
			if(distance[max] < distance[i]) {
				max = i;
			}
		}
		visited = new boolean[v+1];
	    distance = new int[v+1];
		bfs(max);
		Arrays.sort(distance);
		
		System.out.println(distance[v]);
	}
	
	private static void bfs(int num) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[num] = true;
		queue.add(num);
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(int i = 0; i < arr[now].size();i++) {
				int e = arr[now].get(i).e;
				int dist = arr[now].get(i).dist;
				if(!visited[e]) {
					visited[e] = true;
					queue.add(e);
					distance[e] = distance[now]+ dist;
				}
			}
		}
		
	}

	static class Edge {
		int e;
		int dist;
		public Edge(int e, int dist) {
			this.e = e;
			this.dist = dist;
		}
	}
	
}