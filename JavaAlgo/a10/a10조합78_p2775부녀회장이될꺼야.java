package a10;

import java.util.Scanner;

public class a10조합78_p2775부녀회장이될꺼야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] D = new int[15][15];
		for(int i = 0;i<15;i++) {
			D[i][1] = 1;
			D[0][i] = i;
		}
		
		for(int i = 1;i<15;i++) {
			for(int j =2;j<15;j++) {
				D[i][j] = D[i][j-1] + D[i-1][j];
			}
		}
			
		int T = sc.nextInt();		
		for(int i = 0;i<T;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(D[k][n]);
		}
	}
}