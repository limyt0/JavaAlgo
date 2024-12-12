package a06;

import java.io.*;
import java.util.*;

public class a06그리디32_p11047동전0 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] coin = new int[n]; 
		for(int i =0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			coin[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		for(int i=n-1;i>=0;i--) {
			if(k > coin[i]) {
				int mok = k / coin[i];
				int nam = k % coin[i];
				cnt += mok;
				k = nam;
				if(k == 0) {
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
