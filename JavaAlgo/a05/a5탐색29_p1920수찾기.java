package a05;

import java.io.*;
import java.util.*;

public class a5탐색29_p1920수찾기 {
	//static int _n;
	//static int _nums[];
	//static int _x;
	//static int _xnums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int _n = Integer.parseInt(st.nextToken());
		int[] _a = new int[_n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<_n;i++) {
			_a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(_a);
		st = new StringTokenizer(br.readLine());
		int _m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<_m;i++) {
			boolean find = false;
			int target = Integer.parseInt(st.nextToken());
			
			//이진탐색 시작
			int start = 0;
			int end = _n - 1;
			while(start <= end) {
				int mid = (start+end)/2;
				int midValue = _a[mid];
				if(midValue > target) {
					end = mid - 1;
				}else if(midValue < target) {
					start = mid + 1;
				}else {
					find = true;
					break;
				}
			}
			if(find) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
		}
	}
}
