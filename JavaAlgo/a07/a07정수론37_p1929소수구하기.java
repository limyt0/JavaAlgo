package a07;

import java.io.*;
import java.util.*;

public class a07정수론37_p1929소수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean arr[] = new boolean[n+1];
		for(int i=2;i<=n;i++) {
			arr[i] = true;
		}
		
		for(int start = 2;start*start<=n;start++) {
			if(!arr[start]) {
				continue;
				
			}
			for(int i = start+start;i<=n;i+=start) {
				//if(i % start == 0 && i != start) {
			//	}
				arr[i] = false;
			}
		}
		
		for(int i = m;i<=n;i++) {
			if(arr[i]) {
				System.out.println(i);				
			}
		}
	}

}
