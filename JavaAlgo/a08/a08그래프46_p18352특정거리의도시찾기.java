package a08;

import java.io.*;
import java.util.*;

public class a08그래프46_p18352특정거리의도시찾기 {
	//static int[][] marray;//단방향 저장 array
	static ArrayList<Integer>[] mlist;//단반향 저장 array
	static boolean[] visited;
	static int n,m,k,x;
	static ArrayList<Integer> nlist; //k길이를 갖는 도시들을 저장하는 array
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m =Integer.parseInt(st.nextToken());
		k =Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		//marray = new int[2][m] ;
		visited = new boolean[m];
		mlist = new ArrayList[n+1];
		
		for(int i = 0;i<=n;i++) {
			mlist[i] = new ArrayList<Integer>();
		}
		
		for(int i = 1; i<=m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
		    mlist[s].add(e);
		}
		nlist = new ArrayList<Integer>();
	   lowdist(1, 0);
	   
	}
	
	//최단 거리일때 nlist에 값을 넣기
	private static void lowdist(int num, int cnt) {
		if(cnt == k) {
			nlist.add(num);
			return;
	    }
	    
		for(int i = num; i <=n ;i++) {			
			
		}
	    	
	       
	    		
	}
}
