package a08;

import java.util.*;

public class a08그래프49_p2251물의양구하기 {
	static int[] s = {0,0,1,1,2,2};
	static int[] r = {1,2,0,2,0,1};
	static int[] limit;
	static boolean[][] visited;
	static boolean[] answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		limit = new int[3];
		limit[0] = sc.nextInt();
		limit[1] = sc.nextInt();
		limit[2] = sc.nextInt();
		visited = new boolean[limit[0]+1][limit[1]+1];
		answer = new boolean[limit[2]+1];
		bfs();
		for(int i = 0;i<answer.length;i++) {
			if(answer[i]) {
				System.out.print(i+" ");
			}
		}
	}

	private static void bfs() {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {0,0});
		visited[0][0] = true;
		answer[limit[2]] = true;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int a = now[0];
			int b = now[1];
			int c = limit[2] - a - b;
			for(int i = 0;i<6;i++) {
				int[] next = {a,b,c};
				next[r[i]] += next[s[i]];
				next[s[i]] = 0;
				if(limit[r[i]] < next[r[i]]) {
					next[s[i]] = next[r[i]] - limit[r[i]];
					next[r[i]] = limit[r[i]];
				}
				if(!visited[next[0]][next[1]]) {
					visited[next[0]][next[1]] = true;
					queue.add(new int[] {next[0], next[1]});
					if(next[0] == 0) {
						answer[next[2]] = true;
					}
				}
			}
		}
	}
	
}