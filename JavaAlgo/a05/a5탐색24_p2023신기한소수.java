package a05;

import java.io.*;
import java.util.*;

public class a5탐색24_p2023신기한소수 {
	static int n ;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		dfs(2, 1);
		dfs(3, 1);
		dfs(5, 1);
		dfs(7, 1);
	}

	private static void dfs(int num, int jarisu) {
		if(jarisu == n) {
			System.out.println(num);
			return;
		}
		
		for(int i = 1;i<=9 ;i+=2) {
			int fnum = num*10 + i;
			if(isSosu(fnum)) {
				dfs(fnum, jarisu + 1);
			}
		}

	}


	static boolean isSosu(int num) {
		for(int i =2; i*i <=num ;i++ ) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
		
	}
	
}
