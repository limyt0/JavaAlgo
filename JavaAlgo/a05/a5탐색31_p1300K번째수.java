package a05;

import java.io.*;
import java.util.*;

public class a5탐색31_p1300K번째수 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int _n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int _k = Integer.parseInt(st.nextToken());
		long start = 1, end = _k;
		long ans = 0;
		while(start <= end) {
			long mid = (start + end) / 2;
			long cnt = 0;
			
			for(int i =1; i<=_n; i++) {
				
				cnt += Math.min(mid / i, _n);
			}
			if(cnt <_k) {
				start = mid +1;				
			}else {
				ans = mid;
				end = mid -1;
			}
			
		}
		System.out.println(ans);
		
	}
	//for문 두개 쓰면 메모리 초과 뜸
/*
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int _n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int _k = Integer.parseInt(st.nextToken());
		int[] _b = new int[_n*_n];
		int cnt = 0;
		for(int i =0;i<_n;i++) {
			for(int j=0;j<_n;j++) {
				_b[cnt] = (i+1)*(j+1);
				cnt++;
			}			
		}
		Arrays.sort(_b);
		System.out.println(_b[_k]);
	}
*/
}
