package a03;

import java.util.*;

public class a03자료구조11_p1874스택수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer sf = new StringBuffer();
		int num = 1;
		boolean result = true;
		for(int i = 0;i<arr.length;i++) {
			int su = arr[i];
			if(su >= num) {
				while(su>=num) {
					stack.push(num++);
					sf.append("+\n");
				}
				stack.pop();
				sf.append("-\n");
			}else {
				int pop = stack.pop();
				if(pop > su) {
					System.out.println("NO");
					result = false;
					break;
				}else {
					sf.append("-\n");					
				}
			}
		}
		
		if(result) System.out.println(sf.toString());
	}

}
