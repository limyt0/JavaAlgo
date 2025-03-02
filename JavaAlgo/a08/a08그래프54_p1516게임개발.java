package a08;

import java.io.*;
import java.util.*;

public class a08그래프54_p1516게임개발 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<=n;i++) {
			arr.add(new ArrayList<>());
		}
		int[] selfbuild = new int[n+1];
		int[] indegree = new int[n+1];
		
		for(int i =1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			selfbuild[i] = Integer.parseInt(st.nextToken());
			while(true) {
				int temp = Integer.parseInt(st.nextToken());
				if(temp == -1) {
					break;
				}
				arr.get(temp).add(i);
				indegree[i]++;
			}
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 1;i<=n;i++) {
			if(indegree[i] == 0) {
				queue.offer(i);
			}
		}
		int[] result = new int[n+1];
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(int next: arr.get(now)) {
				indegree[next]--;
				result[next] = Math.max(result[next], result[now]+ selfbuild[now]);
				if(indegree[next] == 0) {
					queue.offer(next);
				}
			}
		}
		for(int i = 1;i<=n;i++) {
			System.out.println(result[i]+selfbuild[i]);
		}
	}

}
