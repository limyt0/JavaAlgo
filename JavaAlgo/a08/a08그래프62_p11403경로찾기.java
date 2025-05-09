package a08;

import java.io.*;
import java.util.*;

public class a08그래프62_p11403경로찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][N];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<N;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int k = 0;k<N;k++) {
			for(int i = 0;i<N;i++) {
				for(int j = 0;j<N;j++) {
					if(arr[i][k] ==1 & arr[k][j] == 1) arr[i][j] = 1;
				}
			}
		}
		
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<N;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
