package a08;

import java.io.*;
import java.util.*;

public class a08그래프47_p1324효율적인해킹 {
	static int n, m;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	static int[] answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n+1];
		for(int i = 1;i<=n;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i = 1;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
		}
		answer = new int[n+1];
		for(int i =1;i<=n;i++) {
			visited = new boolean[n+1];
			bfs(i);
		}
		int maxVal = 0;
		for(int i =1;i<=n;i++) {
			maxVal = Math.max(maxVal, answer[i]);
		}

		for(int i =1;i<=n;i++) {
			if(maxVal == answer[i]) {
				bw.write(i+ " ");
			}
		}
		bw.flush();
		bw.close();
	}

	private static void bfs(int index) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(index);
		visited[index] = true;
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(int node : arr[now]) {
				if(!visited[node]) {
					visited[node] = true;
					answer[node]++;
					queue.add(node);
				}
			}
		}
	}
	
	
	
	
}
