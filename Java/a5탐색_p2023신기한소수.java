package algom2023;

import java.io.*;
import java.util.*;

public class a5탐색_p2023신기한소수 {
	static int _n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		_n = Integer.parseInt(st.nextToken());
		//DFS
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
	private static void DFS(int number, int jarisu) {
		if(jarisu == _n) {
			if(isPrime(number)) {
				System.out.println(number);
			}
			return;
			
		}
		for(int i =1;i<10;i++) {
			//짝수는 더이상 탐색 필요 없음.
			if(i%2 ==0) {
				continue;
			}
			//소수라면 재귀함수로 자릿수 늘림
			if(isPrime(number*10+i)) {
				DFS(number*10+i, jarisu+1);
				
			}
		}
		
	}
	private static boolean isPrime(int num) {
		for(int i =2; i<=num/2;i++ ) {
			if(num%i ==0) {
				return false;
			}			
		}
		return true;
	}
	/*
	 * private static boolean isPrime(int num) { for(int i =2; i<=num/2;i++ )
	 * if(num%i ==0) return false; return true; }
	 */
}
