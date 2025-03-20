package a03;

import java.io.*;
import java.util.*;

public class a03자료구조12_p17298오큰수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr =new int[n];
		int[] result = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(0);
		for(int i = 1;i<n;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				result[stack.pop()] = arr[i];
			}
			stack.push(i);
			
		}
		while(!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0;i<n;i++) {
			bw.write(result[i]+" ");
		}
		bw.write("\n");
		bw.flush();
	}

}
