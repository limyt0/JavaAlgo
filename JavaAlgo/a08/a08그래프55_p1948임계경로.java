package a08;

import java.io.*;
import java.util.*;

public class a08그래프55_p1948임계경로 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<ArrayList<dNode>> arr = new ArrayList<ArrayList<dNode>>();
		ArrayList<ArrayList<dNode>> reversA = new ArrayList<ArrayList<dNode>>();
		int[] indegree = new int[n+1];
		for(int i = 0; i<=n;i++) {
			arr.add(new ArrayList<>());
			reversA.add(new ArrayList<>());
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			arr.get(s).add(new dNode(e,v));
			reversA.get(e).add(new dNode(s,v));
			indegree[e]++;
		}
		st = new StringTokenizer(br.readLine());
		int startDosi = Integer.parseInt(st.nextToken());
		int endDosi = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(startDosi);
		int[] result = new int[n+1];
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(dNode next: arr.get(now)) {
				indegree[next.targetNode]--;
				result[next.targetNode] = Math.max(result[next.targetNode], result[now]+next.value);
				if(indegree[next.targetNode] == 0) {
					queue.offer(next.targetNode);
				}
			}
		}
		
		int resultCnt = 0;
		boolean visited[] = new boolean[n+1];
		queue = new LinkedList<Integer>();
		queue.offer(endDosi);
		visited[endDosi]= true;
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(dNode next: reversA.get(now)) {
				if(result[next.targetNode]+next.value == result[now]) {
					resultCnt++;
				}
				if(visited[next.targetNode] == false) {
					visited[next.targetNode] = true;
					queue.offer(next.targetNode);
				}
			}
		}
		System.out.println(result[endDosi]);
		System.out.println(resultCnt);
	}

}

class dNode{
	int targetNode;
	int value;
	dNode(int targetNode, int value){
		this.targetNode = targetNode;
		this.value = value;
	}
}