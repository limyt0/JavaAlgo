package a07;

import java.io.*;
import java.util.*;

public class a07정수론43_p1850_최대공약수 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long result = gcb(a ,b);
		StringBuilder sb = new StringBuilder();
		for(long i = 0;i<result;i++) {
			sb.append("1");
		}
		System.out.println(sb);
	}

	private static long gcb(long a, long b) {
		if(b== 0) {
			return a;
		}else {
			
			return gcb(b, a%b);
		}
	}



}
