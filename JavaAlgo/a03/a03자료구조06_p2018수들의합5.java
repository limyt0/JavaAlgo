package a03;

import java.util.*;

public class a03자료구조06_p2018수들의합5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start = 1;
		int end = 1;
		int cnt = 1;
		int sum = 1;
		while(end !=N) {
			if(sum == N) {
				cnt++;
				end++;
				sum = sum + end;
			}else if(sum > N) {
				sum = sum - start;
				start++;
			}
			else {
				end++;
				sum = sum + end;
			}
		}
		
		System.out.println(cnt);
	}

}
