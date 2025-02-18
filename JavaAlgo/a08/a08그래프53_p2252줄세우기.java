package a08;

import java.util.*;

public class a08그래프53_p2252줄세우기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<=n;i++) {
			arr.add(new ArrayList<>());
		}
		int indegree[] = new int[n+1];
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.get(a).add(b);
			indegree[b]++;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 1; i<=n;i++) {
			if(indegree[i] == 0) {
				queue.offer(i);
			}
		}
		while(!queue.isEmpty()) {
			int now = queue.poll();
			System.out.print(now + " ");
			for(int next: arr.get(now)) {
				indegree[next]--;
				if(indegree[next] == 0) {
					queue.offer(next);
				}
			}
		}
	}

}
