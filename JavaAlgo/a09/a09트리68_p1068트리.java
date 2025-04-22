package a09;

import java.util.*;

public class a09트리68_p1068트리 {
	static int N;
	static ArrayList<Integer> tree[];
	static boolean visited[];
	static int answer;
	static int deleteNode;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		tree = new ArrayList[N];
		visited = new boolean[N];
		int root = 0;
		answer = 0;
		for(int i = 0;i<N;i++) {
			tree[i] = new ArrayList<Integer>();
		}
		for(int i = 0;i<N;i++) {
			int p = sc.nextInt();
			if(p != -1) {
				tree[i].add(p);
				tree[p].add(i);
			}else {
				root = i;
			}			
		}
		deleteNode = sc.nextInt();
		if(deleteNode == root) {
			System.out.println(0);
		}else {
			dfs(root);
			System.out.println(answer);
		}

		
	}
	private static void dfs(int num) {
		visited[num] = true;
		int cNode = 0;
		for(int t: tree[num]) {
			if(!visited[t] && t != deleteNode) {
				cNode++;
				dfs(t);
			}
		}
		if(cNode==0) {
			answer++;
		}
	}
	
}
