package a03;

import java.io.*;
import java.util.*;

public class a03자료구조01_p11720숫자의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		char[] arr = str.toCharArray();
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i] - '0';
		}
		System.out.println(sum);
		
	}

}
