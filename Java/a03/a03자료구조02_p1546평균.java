package a03;

import java.io.*;
import java.util.*;

public class a03자료구조02_p1546평균 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int m = 0;
		for(int i =0;i<n;i++) {
			if(m < arr[i]) {
				m = arr[i];
			}
		}
		
		float sum = 0;
		for(int i=0;i<n;i++) {
			sum += ((float)arr[i]/m)*100.0;
		}
		System.out.println(sum/n);
		
	}

}
