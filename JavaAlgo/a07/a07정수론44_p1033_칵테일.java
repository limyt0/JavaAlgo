package a07;

import java.io.*;
import java.util.*;

public class a07정수론44_p1033_칵테일 {
	static int n;//재료 수
	static int[] a;//인접리스트
	static int lcm; //최소공배수
	static int[] d;//각 노드 저장 배열
	boolean[] visited;//방문여부 저장 배열
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		a = new int[n];
		for(int i = 0;i<n-1;i++) {
			st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			d[i] = Integer.parseInt(st.nextToken());
			
		}
		
	}

}
