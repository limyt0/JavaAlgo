package a05;

import java.io.*;
import java.util.*;

public class a5탐색30_p2343기타레슨 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int _n = Integer.parseInt(st.nextToken());
		int _m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] _a = new int[_n];
		int start = 0;
		int end = 0;
		for(int i =0;i<_n;i++) {
			_a[i] = Integer.parseInt(st.nextToken());
			if(start <_a[i]) start = _a[i];
			end = end + _a[i];
		}
		while(start <= end) {
			int mid = (start+end) /2;
			int sum = 0;
			int count = 0;
			for(int i=0;i<_n;i++) {
				if(sum + _a[i] > mid) {
					count++;
					sum = 0;
				}
				sum = sum + _a[i];
			}
			if(sum !=0) count++;
			if(count > _m) start = mid+1;
			else end = mid -1;
		}
		System.out.println(start);
	}

}
