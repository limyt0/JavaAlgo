package a05;

import java.io.*;
import java.util.*;

public class a5탐색27_p2178미로탐색 {
	static int[] _dx = {0,1,0,-1};
	static int[] _dy = {1,0,-1,0};
	static boolean[][] _visited;
	static int[][] _a;
	static int _n, _m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		_n = Integer.parseInt(st.nextToken());
		_m = Integer.parseInt(st.nextToken());
		_a = new int[_n][_m];
		_visited = new boolean[_n][_m];
		for(int i = 0; i<_n;i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j = 0; j<_m;j++) {
				_a[i][j] = Integer.parseInt(line.substring(j, j+1));
			}			
		}
		BFS(0,0);
		System.out.println(_a[_n-1][_m-1]);
	}
	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		_visited[i][j] = true;
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			for(int k = 0;k<4;k++) {
				int x = now[0]+_dx[k];
				int y = now[1]+_dy[k];
				if(x>=0 && y>=0 && x<_n && y<_m) {
					if(_a[x][y] !=0 && !_visited[x][y]) {
						_visited[x][y] = true;
						_a[x][y] = _a[now[0]][now[1]]+1;
						queue.add(new int[] {x,y});
					}
				}
			}
		}
	}
}
