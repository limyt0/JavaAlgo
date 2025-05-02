package a10;

import java.util.*;

public class a10조합76_p11050이항계수1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] D = new int[n+1][n+1];
		for(int i=0;i<=n;i++) {
			D[i][1] = i;
			D[i][0] = 1;
			D[i][i] = 1;
		}
		
		for(int i = 2;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				D[i][j] = D[i-1][j] + D[i-1][j-1];
			}
		}
		System.out.println(D[n][k]);
	}

}
