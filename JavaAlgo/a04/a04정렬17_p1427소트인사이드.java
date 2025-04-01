package a04;

import java.util.*;

public class a04정렬17_p1427소트인사이드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		int[] arr = new int[len];
		for(int i =0;i<len;i++) {
			arr[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		for(int i =0;i<len;i++) {
			int max = i;
			for(int j = i+1;j<len;j++) {
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			if(arr[i] < arr[max]) {
				int tmp = arr[i];
				arr[i] = arr[max];
				arr[max] = tmp;
			}
		}
		
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]);
		}
	}

}
