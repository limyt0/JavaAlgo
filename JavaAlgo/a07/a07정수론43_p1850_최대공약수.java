package a07;

import java.io.*;
import java.util.*;

public class a07정수론43_p1850_최대공약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long result = LongGDC(a, b);
		//System.out.println("result:"+result);
		while(result > 0) {
			System.out.print("1");
			result--;
		}

	}

	private static long LongGDC(long a, long b) {
		//System.out.println(a+", "+b);
		if(b== 0) {
			return a;
		}else {
			return LongGDC(b, a % b);			
		}
		
	}

}
