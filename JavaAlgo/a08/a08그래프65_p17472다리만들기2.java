package a08;

import java.io.*;
import java.util.*;
//문제 보류
public class a08그래프65_p17472다리만들기2 {
	static int[][] map;
	static int[] dr = {-1,0,1,0};
	static int[] dc = {0,1,0,-1};
	static int[] parent;
	static boolean[][] visited;
	static ArrayList<int[]> mlist;
	static PriorityQueue<bEdge> queue;
	static int N,M,sNum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map= new int[N][M];
		visited = new boolean[N][N];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sNum = 1;
		//sumlist = new ArrayList<>();
	}

}

class bEdge implements Comparable<bEdge>{
	int s,e,v;
	bEdge(int s, int e, int v){
		this.s = s;
		this.e = e;
		this.v = v;
		
	}
	@Override
	public int compareTo(bEdge o) {
		
		return this.v - o.v;
	}
}