package a07;

import java.io.*;
import java.util.*;

//원래 제목은 소수and팰린드롬 인데 &가 class 이름으로 지정 안 돼서 and로 함.
public class a07정수론39_p1747소수and팰린드롬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		
		boolean sosu[] = new boolean[10000001];
		for(int i = 2; i<sosu.length;i++) {
			sosu[i] = true;			
		}
		
		for(int start = 2; start*start<sosu.length;start++) {
			if(!sosu[start]) {
				continue;
			}
			
			for(int i = start+start; i<sosu.length;i+=start) {
				if(sosu[i]) {
					sosu[i] = false;
				}
			}
		}
		
		for(int i = n;i<sosu.length;i++) {
			if(!sosu[i]) {
				continue;
			}
			if(isP(i)) {
				num = i;
				break;
			}
		}
		
		
		System.out.println(num);
	}

	private static boolean isP(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Queue<Integer> queue = new LinkedList<Integer>();
		while(num != 0 ) {
			list.add(num % 10);//1자리부터 들어감.
			num /=  10;
		}
		int last = list.size()-1;
		boolean result = true;
		for(int i =0;i<list.size();i++) {
			if(list.get(i) != list.get(last - i) ) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	

	

}
