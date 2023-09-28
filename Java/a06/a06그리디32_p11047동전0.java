package a06;

import java.io.*;
import java.util.*;

public class a06그리디32_p11047동전0 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int _n = Integer.parseInt(st.nextToken());
		int _k = Integer.parseInt(st.nextToken());
		int[] _a = new int[_n];
		
		for(int i=0;i<_n;i++) {
			st = new StringTokenizer(br.readLine());
			_a[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt=0;
		for(int i = _n-1;i>=0;i--) {
			if(_a[i] <= _k) {
				cnt += (_k / _a[i]);
				_k = _k % _a[i];
			}			
		}
		System.out.println(cnt);
	}

}
