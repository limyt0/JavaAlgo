package a04;

import java.io.*;
import java.util.*;

public class a04정렬20_p2751번 {
	static int[] arr, tmp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N];
		tmp = new int[N];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		merger_sort(0, N-1);
		
		for(int i = 0;i<N;i++) {
			System.out.println(arr[i]);			
		}
	}
	private static void merger_sort(int s, int e) {
		if(s >= e) {
			return;
		}
		int mid = (s+e) /2;
		merger_sort(s, mid);			
		merger_sort(mid+1, e);			
		int p1 = s;
		int p2 = mid+1;
		int index = s;
		for(int i = s;i<=e; i++) {
			tmp[i]= arr[i];
		}
		while(p1 <= mid && p2<=e) {
			if(tmp[p1] < tmp[p2]) {
				arr[index] = tmp[p1];
				p1++;
			}else {
				arr[index] = tmp[p2];
				p2++;
			}
			index++;
		}
		while(p1<=mid) {
			arr[index] = tmp[p1];
			index++;
			p1++;
		}
		while(p2<=e) {
			arr[index] = tmp[p2];
			index++;
			p2++;
		}
		

	}

}
