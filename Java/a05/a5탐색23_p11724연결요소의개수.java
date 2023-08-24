package a05;

import java.io.*;
import java.util.*;

public class a5탐색23_p11724연결요소의개수 {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		A = new ArrayList[n+1];
		for(int i=1; i<n+1;i++) {
			A[i] = new ArrayList<Integer>();		
		}
		for(int i=0; i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			A[start].add(end);
			A[end].add(start);
		}
		int count = 0;
		for (int i =1; i<n+1;i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	private static void DFS(int index) {
		if(visited[index]) {
			return;
		}
		visited[index] = true;
//		for(int i: A[index]) {
//			if(!visited[i]) {
//				DFS(i);
//			}
//		}
		for(int i = 0; i< A[index].size();i++) {
			if(!visited[ A[index].get(i) ]) {
				DFS(A[index].get(i));
			}
		}
		
//		for (int i = 0; i < A[index].size(); i++) {
//		    int element = A[index].get(i);
//		    if (!visited[element]) {
//		    	DFS(element);
//		    }
//		}
	}
	
	
}
