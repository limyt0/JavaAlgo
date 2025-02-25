package a03;

import java.util.*;

public class a03자료구조07_p1940주몽 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N+1];
		for(int i =1;i<=N;i++) {
			arr[i] = sc.nextInt();
		}
		int s = 1;
		int e = N;
		int cnt = 0;
		Arrays.sort(arr);
		while(s < e) {
			if(arr[s]+arr[e] < M) {
				s++;
			}else if(arr[s] + arr[e] >M) {
				e--;
			}else {
				cnt++;
				s++;
				e--;
			}
		}
		System.out.println(cnt);
	}

}
