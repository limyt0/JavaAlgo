package a05;

import java.io.*;
import java.util.*;

public class a5탐색31_p1300K번째수 {
	
	public static void main(String[] args) throws IOException    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		
		long start = 1;
		long end = k;
		long ans = 0;
		while(start<=end) {
			long mid = (start + end)/2;
			long cnt =0;
			for(int i =1;i<=n;i++) {
				cnt += Math.min(mid /i, n);
			}
			if(k > cnt) {
				start = mid + 1;
			}else {
				ans = mid;
				end = mid - 1;
			}
		}
		System.out.println(ans);
	}
	
}
