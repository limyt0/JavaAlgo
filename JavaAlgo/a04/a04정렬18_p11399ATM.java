package a04;

import java.util.*;

public class a04정렬18_p11399ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] S = new int[N];
		for(int i =0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=1;i<N;i++) {
			int i_p =  i;
			int i_v = A[i];
			for(int j = i-1;j>=0;j--) {
				if(A[j]<A[i]) {
					i_p = j+1;
					break;
				}
				if(j==0) {
					i_p =0;
				}
			}
			for(int j=i;j>i_p;j--) {
				A[j] = A[j-1];
			}
			A[i_p] = i_v;
		}
		S[0] = A[0];
		for(int i =1;i<N;i++) {
			S[i] = S[i-1] + A[i];
		}
		int sum = 0;
		for(int i =0;i<N;i++) {
			sum = sum + S[i];
		}
		System.out.println(sum);
	}

}
