package a06;

import java.io.*;
import java.util.*;

public class a06그리디35_p1931회의실배정 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int _n = Integer.parseInt(st.nextToken());
		int[][] _a = new int[_n][2];
		for(int i =0; i<_n;i++) {
			st = new StringTokenizer(br.readLine());
			_a[i][0] = Integer.parseInt(st.nextToken());
			_a[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(_a, new Comparator<int[]>() {

			@Override
			public int compare(int[] S, int[] E) {
				if(S[1] == E[1]) {					
					return S[0]-E[0];
				}
				return S[1]-E[1];
			}
		});
		int cnt = 0;
		int end = -1;
		for(int i = 0; i<_n; i++) {
			if(_a[i][0] >=end) {
				end = _a[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
