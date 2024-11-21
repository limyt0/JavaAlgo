package a05;

import java.io.*;
import java.util.*;

public class a5탐색25_p13023ABCDE {
	static ArrayList<Integer>[] arr;
	static int n;
	static boolean visited[];
	static boolean arrived;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n];
		visited = new boolean[n];
		for(int i = 0;i<n;i++) {			
			arr[i] = new ArrayList<Integer>();
		}
		
		
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}
		
		for(int i = 0;i<n;i++) {
			
			dfs(i, 1);
			if(arrived) break;
		}
		if(arrived) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
	
	private static void dfs(int num, int cnt) {
		if(cnt == 5) {
			arrived = true;
			return;
		}
		//cnt++;
		
		visited[num] = true;
		for(int i =0;i<arr[num].size();i++) {
		    int fnum = arr[num].get(i);
			if(!visited[fnum]) {
				dfs(fnum, cnt+1);
			}
		}
		visited[num] = false;
	}
	

}
