package a06;

import java.io.*;
import java.util.*;

public class a06그리디34_p1744수묶기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pqPlus = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> pqMinus = new PriorityQueue<Integer>();
		for(int i =0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			if(num >0) {
				pqPlus.add(num);
			}else {
				pqMinus.add(num);
			}
		}
		int sum = 0;
		while(pqMinus.size()>1) {
			int data1 = pqMinus.remove();
			int data2 = pqMinus.remove();
			sum += (data1 *data2);
		}
		
		while(pqPlus.size()>1) {
			int data1 = pqPlus.remove();
			int data2 = pqPlus.remove();
			if(data2 != 1) {
				sum += (data1 * data2);
			}else {
				sum += (data1 + data2);
			}
		}
		
		if(pqMinus.size() ==1) {
			sum += pqMinus.remove();
		}
		
		if(pqPlus.size() == 1) {
			sum += pqPlus.remove();
		}
		
		System.out.println(sum);
	}

}
