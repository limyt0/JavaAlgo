package algom2023;

import java.io.*;
import java.util.*;

public class a5탐색_p1260DFS와BFS {
	static int _n;
	static int _m;
	static int _start;
	static boolean visited[];
	static ArrayList<Integer>[] _a;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		_n = Integer.parseInt(st.nextToken());
		
		_m = Integer.parseInt(st.nextToken());
		_start = Integer.parseInt(st.nextToken());
		_a = new ArrayList[_n+1];
		for(int i = 1; i<=_n;i++) {
			_a[i]= new ArrayList<Integer>();
		}
		for(int i =0;i<_m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			_a[s].add(e);
			_a[e].add(s);
		}
		
		for(int i =1;i<=_n;i++) {
			Collections.sort(_a[i]);
		}
		visited = new boolean[_n+1];
		DFS(_start);
		System.out.println();
		visited = new boolean[_n+1];
		BFS(_start);
		System.out.println();
	}
	
	private static void DFS(int Node) {
		System.out.print(Node+" ");
		visited[Node] = true;
		for(int i:_a[Node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}	
	}
	private static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node] = true;
		
		while(!queue.isEmpty()) {
			int now_node = queue.poll();
			System.out.print(now_node+ " ");
			for(int i :_a[now_node]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
