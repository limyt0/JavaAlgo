package a05;


import java.io.*;
import java.util.*;

public class a5탐색29_p1920수찾기 {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		

		for(int i = 0;i<m;i++) {
			int num = Integer.parseInt(st.nextToken());
			int result = 0;
			
			int s = 0;
			int e = arr.length -1;
			
			while(s <=e) {
				int mid = (s + e)/2;
				int midVal = arr[mid];
				if(midVal < num) {
					s = mid+1;
				}else if(midVal > num) {
					e = mid-1;
				}else {
					result = 1;
					break;
				}
			}
			
			System.out.println(result);
		}
	}
}
