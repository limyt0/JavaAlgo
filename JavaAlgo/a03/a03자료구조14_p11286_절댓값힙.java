package a03;

import java.io.*;
import java.util.*;

public class a03자료구조14_p11286_절댓값힙 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2)->{
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			if(first_abs == second_abs) {
				return o1 > o2? 1:-1;
			}else {
				return first_abs - second_abs;
			}
			
		});
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			if(x ==0) {
				if(queue.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(queue.poll());
				}				
			}else {
				queue.add(x);				
			}
		}
	}

}
