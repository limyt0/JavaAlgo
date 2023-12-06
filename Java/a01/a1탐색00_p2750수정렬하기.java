package a01;

import java.io.*;
import java.util.*;

public class a1탐색00_p2750수정렬하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr= new int[n];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] > arr[j] ) {
					int tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;					
				}
			}
		}
		for(int i=0;i<n;i++) {			
			System.out.println(arr[i]);
		}

	}

}
