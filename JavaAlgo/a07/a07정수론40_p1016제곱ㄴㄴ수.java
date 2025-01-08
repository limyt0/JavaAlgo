package a07;
import java.util.*;

public class a07정수론40_p1016제곱ㄴㄴ수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();
		boolean arr[] = new boolean[(int)(max-min)+1];
		
		for(long i = 2;i*i<=max;i++) {
			long pow = i*i;
			long start = min / pow;
			if(min % pow != 0) {
				start++;
			}
			for(long j = start;j*pow<=max;j++) {
				arr[(int)((j*pow)-min)] = true;
			}
		}
		int cnt = 0;
		for(int i = 0;i<arr.length; i++) {
			if(!arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
 	}

}
