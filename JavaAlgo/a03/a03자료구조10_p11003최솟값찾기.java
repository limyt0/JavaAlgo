package a03;

import java.io.*;
import java.util.*;

public class a03자료구조10_p11003최솟값찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Deque<Node10> mydeque = new LinkedList<>();
		for(int i =0;i<N;i++) {
			int now = Integer.parseInt(st.nextToken());
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node10(now, i));
			
			if(mydeque.getFirst().index <=i - L) {
				mydeque.removeFirst();
			}
			bw.write(mydeque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
	}
	
	
	static class Node10{
		public int value;
		public int index;
		Node10(int value, int index)
		{
			this.value = value;
			this.index = index;
		}
	}

}

