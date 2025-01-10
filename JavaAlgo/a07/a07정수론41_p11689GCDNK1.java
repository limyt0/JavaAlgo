package a07;

import java.io.*;
import java.util.*;

public class a07정수론41_p11689GCDNK1 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long result = n;
		for(long i = 2;i*i<=n;i++) {
			if(n % i == 0) {
				result = result - result / i;
				while(n % i ==0) {
					n /= i;
				}
			}
		}
		if(n>1) {
			result = result - result / n;
		}
		System.out.println(result);
		
	}



}
