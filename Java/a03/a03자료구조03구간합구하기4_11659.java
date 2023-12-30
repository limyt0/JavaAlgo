package a03;

import java.io.*;
import java.util.*;

public class a03자료구조03구간합구하기4_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		int[] sum = new int[n+1];
		for(int i =1; i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());	
			sum[i] += sum[i-1] + arr[i];
 		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int int_i = Integer.parseInt(st.nextToken());
			int int_j = Integer.parseInt(st.nextToken());
			int result = sum[int_j] - sum[int_i-1];
			System.out.println(result);
		}
	}
}
