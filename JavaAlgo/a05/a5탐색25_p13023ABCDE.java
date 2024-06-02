package a05;

import java.io.*;
import java.util.*;

public class a5탐색25_p13023ABCDE {
	static boolean _visited[];
	static ArrayList<Integer>[] _a;
	static int _n;
	static int _m;
	static boolean _arrive;
	public static void main(String[] args) throws IOException {
		_arrive = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		_n = Integer.parseInt(st.nextToken());
		_m = Integer.parseInt(st.nextToken());
		_a = new ArrayList[_n];
		_visited = new boolean[_n];
		for(int i =0;i<_n;i++) {
			_a[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0;i<_m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			_a[s].add(e);
			_a[e].add(s);
		}
		for(int i =0;i<_n;i++) {
			DFS(i, 1);
			if(_arrive) break;
		}
		if(_arrive) System.out.println("1");
		else System.out.println("0");
	}
	
	private static void DFS(int now, int depth) {
		if(depth == 5 || _arrive) {
			_arrive = true;
			return;
		}
		_visited[now] = true;
		for(int i: _a[now]) {
			if(!_visited[i]) {
				DFS(i, depth+1);
				
			}
			
		}
		_visited[now] =false;
	}
}
