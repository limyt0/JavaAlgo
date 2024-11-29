package a05;

import java.io.*;
import java.util.*;

public class a5탐색27_p2178미로탐색 {
	static int n;
	static int m;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		for(int i =1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j = 1;j<=m;j++) {
				arr[i][j] = Integer.parseInt(line.substring(j-1, j));
			}
		}
		bfs(1,1);
		System.out.println(arr[n][m]);
		
	}
	private static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{i,j});
		visited[i][j] = true;
		while(!queue.isEmpty()) {		    
			int[] now = queue.poll();
		    for(int k = 0;k<4;k++) {
		    	int x = now[0] + dx[k]; 
		    	int y = now[1] + dy[k];		    	
		    	if(x>0 && x<=n && y>0 && y<=m) {
		    		if(arr[x][y] !=0 && !visited[x][y]) {
		    			arr[x][y] = arr[now[0]][now[1]] + 1;
		    			visited[x][y] = true; 
		    			queue.add(new int[] {x,y});
		    		}
		    	}
		    }
		}
		
	}

	
	
}
