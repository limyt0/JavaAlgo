package a07;

import java.io.*;
import java.util.*;

public class a07정수론37_p1929소수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int _m = Integer.parseInt(st.nextToken());
		int _n = Integer.parseInt(st.nextToken());
		int[] _a = new int[_n+1];
		for(int i =2; i<=_n;i++) {
			_a[i] = i;
		}
		for(int i=2;i<=Math.sqrt(_n);i++) {
			if(_a[i] == 0) {
				continue;
			}
			for(int j= i+i;j<=_n;j=j+i) {
				_a[j] = 0;
			}
		}
		for(int i =_m; i<=_n;i++) {
			if(_a[i] !=0) {
				System.out.println(_a[i]);
			}
		}
	}

}
