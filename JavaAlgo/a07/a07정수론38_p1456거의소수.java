package a07;

import java.util.*;
import java.io.*;
public class a07정수론38_p1456거의소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		int alength = 10000000;
		if(b <= alength ) {
			alength = (int)b;
		}
		boolean arr[] = new boolean[alength+1];
		//int alength = arr.length;
		for(int i = 2;i<alength;i++) {
			arr[i] = true;
		}
		
		for(int start = 2; start*start <=alength;start++ ) {
			if(!arr[start]) {
				continue;
			}
			for(int i =start + start;i<alength;i+=start) {
				if(arr[i]){
					arr[i] = false;
				}
			}
		}
		int cnt = 0;
		for(int i = 2;i<=alength;i++) {
			if(arr[i]) {
				long temp = i;
				while((double)i <= (double)b/(double)temp) {
					if((double)i>=(double)a/(double)temp) {
						cnt++;						
					}
					temp *= i;
				}
			}
		}
		System.out.println(cnt);
		
		
	}
}
