package a06;

import java.io.*;
import java.util.*;

public class a06그리디35_p1931회의실배정 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][2];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		int cnt = 0;
		int last = -1;
		for(int i=0; i<n;i++) {
			if(last <= arr[i][0]) {
				last = arr[i][1];
				cnt++;
			} 
		}
		System.out.println(cnt);
		
	}

}
