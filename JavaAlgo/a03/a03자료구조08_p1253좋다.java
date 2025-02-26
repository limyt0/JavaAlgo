package a03;

import java.io.*;
import java.util.*;

public class a03자료구조08_p1253좋다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long[] arr= new long[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<N;i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		int cnt = 0;
		for(int k=0;k<N;k++) {
			long find = arr[k];
			int s = 0;
			int e = N-1;
			while(s < e) {
				if(arr[s] + arr[e] == find) {
					if(s != k && e != k) {
						cnt++;
						break;
					}else if(s == k) {
						s++;
					}else if(e ==k) {
						e--;
					}
					
				}else if(arr[s] + arr[e] < find) {
					s++;
				}else {
					e--;
				}
			}
			
		}
		System.out.println(cnt);
		br.close();
	}

}
