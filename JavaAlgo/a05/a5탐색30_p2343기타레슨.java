package a05;

import java.io.*;
import java.util.*;

public class a5탐색30_p2343기타레슨 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new  StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		int start = 0;
		int end = 0;
		
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(start < arr[i]) start = arr[i];
			end = end + arr[i];
		}
		
		while(start <= end) {
			int middle = (start+end)/2;
			int sum = 0;
			int cnt = 0;
			for(int i=0;i<n;i++) {
				if(sum + arr[i] > middle) {
					cnt++;
					sum = 0;
				}
				sum = sum + arr[i];
				
			}
			if(sum !=0) {
				cnt++;
			}
			if(cnt > m ) {
				start = middle +1;
			}else {
				end = middle - 1;
			}
		}
		System.out.println(start);
	}

}
