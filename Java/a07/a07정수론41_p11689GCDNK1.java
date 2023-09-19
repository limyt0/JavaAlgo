package a07;

import java.io.*;
import java.util.*;

public class a07정수론41_p11689GCDNK1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long result = n;
		for(long p=2; p<=Math.sqrt(n); p++) {
			if(n%p==0) {
				result = result - result/p;
				while(n%p == 0) {
					n /= p;
				}
			}
		}
		if(n>1) {
			result = result - result /n;
		}
		System.out.println(result);
		
	}

}
