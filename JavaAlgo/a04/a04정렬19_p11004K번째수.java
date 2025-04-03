package a04;

import java.io.*;
import java.util.*;

public class a04정렬19_p11004K번째수 {
	static int[] A;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		quickSort(0, N-1, K-1);
		System.out.println(A[K-1]);
	}
	private static void quickSort(int S, int E, int K) {
		if(S < E) {			
			int pivot = partition(S, E);
			if(pivot == K) {
				return;
			}
			if(pivot > K) {
				quickSort(S, pivot-1, K);
			}else {
				quickSort(pivot+1, E, K);			
			}
		}
		
	}
	private static int partition(int S, int E) {
	
		if(S + 1 == E) {
			if(A[S] > A[E]) swap(S, E);
			return E;
		}
		int M = (S + E)/2;
		swap(S, M);
		int pivot = A[S];
		int i = S+1;
		int j = E;
		while(i<=j) {
			while(A[S] < A[j] && j > 0) {
				j--;
			}
			while(A[S] > A[i] && i < A.length-1) {
				i++;
			}
			if(i <=j) {
				swap(i++,j--);
			}
		}
		A[S] = A[j];
		A[j] = pivot;
		
		return j;
	}
	private static void swap(int i, int j) {
		int temp;
		temp = A[i];
		A[i] = A[j];
		A[j] = temp; 
		
	}
}
