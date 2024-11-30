package a05;

import java.io.*;
import java.util.*;

public class a5탐색28_p1167트리의지름 {
	static int n;
	static ArrayList<Edge>[] arr;
	static boolean _visited[];
	static int _distance[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n+1];
		for(int i =1;i<=n;i++) {
			arr[i] = new ArrayList<Edge>();
		}
		for(int i =0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			while(true) {
				int E = Integer.parseInt(st.nextToken());
				if(E ==-1) break;
				int V = Integer.parseInt(st.nextToken());
				arr[S].add(new Edge(E, V));
			}
		}
		_distance = new int[n+1];
		_visited = new boolean[n+1];
		BFS(1);
		int Max = 1;
		for(int i =2; i<= n;i++) {
			if(_distance[Max] < _distance[i]) {
				Max = i;
			}
		}
		_distance = new int[n+1];
		_visited = new boolean[n+1];
		BFS(Max);
		Arrays.sort(_distance);
		System.out.println(_distance[n]);
		
	}
	
	private static void BFS(int index){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(index);
		_visited[index] = true;
		while(!queue.isEmpty()) {
			int now_node = queue.poll();
			for(Edge i : arr[now_node]) {
				int e = i.e;
				int v = i.value;
				if(!_visited[e]) {
					_visited[e] = true;
					queue.add(e);
					_distance[e] = _distance[now_node]+v; 
				}
			}
		}
		
	}

	static class Edge{
		int e;
		int value;
		public Edge(int e, int value) {
			this.e =e;
			this.value = value;
		}
		
	}
}