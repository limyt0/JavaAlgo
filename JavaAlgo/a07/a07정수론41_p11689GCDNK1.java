package a07;

import java.io.*;
import java.util.*;

public class a07정수론41_p11689GCDNK1 {

	public static void main(String[] args) throws IOException  {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long result = n;
		for(int p = 2;p*p <= n;p++) {
			if(n % p ==0) {
				result = result - (result/p);
			}
			while(n % p == 0) {
				n /= p ;
			}
		}
		if(n>1) {
			result = result - result/n;
		}
		System.out.println(result);
	}



}
