package a03;

import java.util.*;

public class a03자료구조05_p10986나머지합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] S = new long[N];
		long[] C = new long[M];
		S[0] = sc.nextInt();
		for(int i = 1;i<N;i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		long cnt = 0;
		for(int i = 0;i<N;i++) {
			int r = (int)(S[i]%M);
			if(r == 0) cnt++;
			C[r]++;
		}
		for(int i =0;i<M;i++) {
			if(C[i]>1) {
				cnt = cnt + (C[i]*(C[i]-1)/2);
			}
		}
		System.out.println(cnt);
	}

}
