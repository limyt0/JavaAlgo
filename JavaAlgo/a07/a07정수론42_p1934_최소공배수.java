package a07;

import java.util.*;

public class a07정수론42_p1934_최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int lcm = (a*b) / gcb(a, b) ;//
			System.out.println(lcm);
		}
	}

	private static int gcb(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			
			return gcb(b, a % b);
		}
	}


	

}
