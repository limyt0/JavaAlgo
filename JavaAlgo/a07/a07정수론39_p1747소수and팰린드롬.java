package a07;

import java.io.*;
import java.util.*;

//원래 제목은 소수and팰린드롬 인데 &가 class 이름으로 지정 안 돼서 and로 함.
public class a07정수론39_p1747소수and팰린드롬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int _n = sc.nextInt();
		int _a[] = new int[10000001];
		for(int i =2;i<_a.length;i++) {
			_a[i]= i;
		}
		for(int i =2; i<=Math.sqrt(_a.length) ;i++) {
			if(_a[i] == 0) {
				continue;
			}
			for(int j =i+i;j<_a.length;j=j+i) {
				_a[j] = 0;
			}
		}
		int i = _n;
		while(true) {
			if(_a[i]!=0) {
				int result = _a[i];
				if(isPalindrome(result)) {
					System.out.println(result);
					break;
				}
			}
			i++;
		}
	}

	private static boolean isPalindrome(int target) {
		char tmp[] = String.valueOf(target).toCharArray();
		int s= 0;
		int e = tmp.length - 1;
		while(s<e) {
			if(tmp[s] != tmp [e]) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

}
