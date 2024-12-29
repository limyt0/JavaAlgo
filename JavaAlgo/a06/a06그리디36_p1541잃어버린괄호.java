package a06;

import java.io.*;
import java.util.*;

public class a06그리디36_p1541잃어버린괄호 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] str = st.split("-");
		int sum = 0;
		for(int i = 0;i<str.length;i++) {
			if(i == 0) {
				sum += StringToVal(str[i]);
			}else {
				sum -= StringToVal(str[i]);
			}
		}
		System.out.println(sum);
	}

	private static int StringToVal(String str) {
		String[] val = str.split("[+]");
		int psum = 0;
		for(int i = 0;i<val.length;i++) {
			int num = Integer.parseInt(val[i]);
			psum += num;
		}
		return psum;
	}

	

}
