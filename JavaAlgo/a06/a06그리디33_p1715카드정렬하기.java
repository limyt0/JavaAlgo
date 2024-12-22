package a06;

import java.io.*;
import java.util.*;

public class a06그리디33_p1715카드정렬하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int data = Integer.parseInt(st.nextToken());
			pq.add(data);
		}
		
		int data1 = 0;
		int data2 = 0;
		int sum = 0;
		while(pq.size()>1) {
			data1 = pq.remove();
			data2 = pq.remove();
			sum += (data1 +data2);
			pq.add(data1 + data2);
		}
		
		System.out.println(sum);
	}

}