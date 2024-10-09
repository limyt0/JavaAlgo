package a07;

import java.io.*;
import java.util.*;


public class a07정수론45_p21568_AxByC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		long gcd = gcd(a, b);
		if(c%gcd !=0) {
			System.out.println(-1);
		}else {
			int mok = (int)(c / gcd);
			long[] ret = Excute(a, b);
			System.out.println(ret[0] * mok + " "+ret[1]*mok);
		}
	}
	//유클리드 호제법 함수
	private static long[] Excute(long a, long b) {
		long[] ret = new long[2];
		if(b==0) {
			ret[0] = 1; ret[1] = 0;
			return ret;
		}
		long q = a / b;
		long[] v = Excute(b, a % b);
		ret[0] = v[1];
		ret[1] = v[0] - v[1]*q;
		
		return ret;
	}
	private static long gcd(long a, long b) {
		while(b!=0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}

	//
	
	
}
