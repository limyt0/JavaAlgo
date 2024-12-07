package a05;

import java.io.*;
import java.util.*;

public class a5탐색30_p2343기타레슨 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		int start = 0;
		int end = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(start < arr[i]) {
				start = arr[i];
			}
			end = end+ arr[i];
		}

		while(start <=end) {
			int mid = (start+end)/2;
			int cnt = 0;
			int sum = 0;
			for(int i =0;i<n;i++) {
				if(sum + arr[i] > mid) {
					sum = 0;
					cnt++;
				}
				sum = sum+ arr[i];
			}
			if(sum !=0) {
				cnt++;
			}
			if(cnt > m) {
				start = mid +1;
			}else {
				end = mid -1;
			}
		}
		System.out.println(start);
	}

}
