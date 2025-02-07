package a08;

import java.util.*;

public class a08그래프46_p18352특정거리의도시찾기 {
	static ArrayList<Integer>[] arr;
	static int[] visited;
	static List<Integer> answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		
		arr= new ArrayList[n+1];
		
		for(int i = 0;i<=n;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a].add(b);
		}
		visited = new int[n+1];
		for(int i = 0;i<=n;i++) {
			visited[i] = -1;
		}
		bfs(x);
		answer = new ArrayList<Integer>();
		for(int i=0;i<=n;i++) {
			if(visited[i] == k) {
				answer.add(i);
			}
		}
		if(answer.isEmpty()) {
			System.out.println("-1");
		}else {
			Collections.sort(answer);
			for(int an : answer) {
				System.out.println(an);
			}
		}
		
		
	}
	private static void bfs(int index) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(index);
		visited[index]++;
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(int node : arr[now]) {
				if(visited[node] == -1) {
					visited[node] = visited[now] +1;
					queue.add(node);
				}
			}
		}
	}
	
	
	
	   
	

	
	
}
