package a06;

import java.io.*;
import java.util.*;

public class a06그리디36_p1541잃어버린괄호 {
	static int answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String example = sc.nextLine();
		String[] str = example.split("-");
		for(int i = 0;i<str.length;i++) {
			int tmp = mySum(str[i]);
			if(i==0) {
				answer = answer + tmp;
			}else {
				answer = answer - tmp;
			}
		}
		System.out.println(answer);
		
		
	}

	private static int mySum(String a) {
		int sum = 0;
		String tmp[] = a.split("[+]");
		for(int i = 0;i<tmp.length; i++) {
			sum += Integer.parseInt(tmp[i]);
		}
		return sum;
	}

}
