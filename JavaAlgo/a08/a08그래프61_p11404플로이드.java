package a08;

import java.io.*;
import java.util.*;

public class a08그래프61_p11404플로이드 {
	static int distance[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st=  new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		distance = new int[n+1][n+1];
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(i == j) {
					distance[i][j] = 0;
				}else {
					distance[i][j] = 1000001;
				}
			}
		}
		
		for(int i =0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(distance[a][b] > c) distance[a][b] = c;
		}
		for(int k = 1;k<=n;k++) {
			for(int i = 1;i<=n;i++) {
				for(int j = 1;j<=n;j++) {
					if(distance[i][j] > distance[i][k] + distance[k][j]) {
						distance[i][j] = distance[i][k] + distance[k][j];
					}
				}
			}
		}
		for(int i =1;i<=n;i++) {
			for( int j =1;j<=n;j++) {
				if(distance[i][j] == 1000001) System.out.println("0 ");
				else System.out.print(distance[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}