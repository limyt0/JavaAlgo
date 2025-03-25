package a08;

import java.io.*;
import java.util.*;

public class a08그래프63_p1389케빈베이컨6단계법칙 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());		
		int result[] = new int[N];
		int arr[][] = new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(i == j) arr[i][j] = 0;
				else arr[i][j] = 10000001;
			}
		}
		for(int i = 0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		for(int k = 1;k<=N;k++) {
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					if(arr[i][j] > arr[i][k] + arr[k][j] ) arr[i][j] = arr[i][k] + arr[k][j];
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		int ans = -1;
		for(int i =1;i<=N;i++) {
			int temp =0;
			for(int j = 1;j<=N;j++) {
				temp = temp + arr[i][j];
			}
			if(min > temp) {
				min = temp;
				ans = i;
			}
		}
		
		System.out.println(ans);
	}

}
