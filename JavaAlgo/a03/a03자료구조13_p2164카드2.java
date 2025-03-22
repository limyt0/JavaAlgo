package a03;

import java.util.*;

public class a03자료구조13_p2164카드2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1;i <=n;i++) {
			queue.add(i);
		}
		
		while(queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.poll());
	}

}
