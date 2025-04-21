package a09;

import java.util.*;

public class a09트리67_p11725트리의부모찾기 {
	static int N;
	static ArrayList<Integer> tree[];
	static boolean[] visited;
	static int answer[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		visited = new boolean[N+1];
		answer = new int[N+1];
		tree = new ArrayList[N+1];
		for(int i = 0;i<=N;i++) {
			tree[i] = new ArrayList<Integer>();
		}
		for(int i=1;i<=N-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			tree[a].add(b);
			tree[b].add(a);
		}
		dfs(1);
		for(int i = 2;i<=N;i++) {
			System.out.println(answer[i]);
		}
	}
	private static void dfs(int num) {
		visited[num] = true;
		for(int t : tree[num] ) {
			if(!visited[t]) {
				answer[t] = num;
				dfs(t);
			}
		}
		
	}

}
