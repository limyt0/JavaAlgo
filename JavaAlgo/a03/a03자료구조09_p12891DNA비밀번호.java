package a03;

import java.io.*;
import java.util.*;

public class a03자료구조09_p12891DNA비밀번호 {
	
	static int checkArr[];
	static int myArr[];
	static int checkScret;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int result = 0;
		char[] arr = new char[S];
		arr = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		checkArr = new int[4]; 
		myArr = new int[4];
		checkScret = 0;
		for(int i =0;i<4;i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0)
				checkScret++;
		}
		for(int i =0;i<P;i++) {
			Add(arr[i]);
		}
		
		if(checkScret == 4)
			result++;
		
		for(int i =P;i<S;i++) {
			int j = i - P;
			Add(arr[i]);
			Remove(arr[j]);
			if(checkScret == 4)
				result++;
		}
		System.out.println(result);
		br.close();
	}



	private static void Add(char c) {
		switch(c) {
		case 'A':
			myArr[0]++;
			if(myArr[0] == checkArr[0])
				checkScret++;
			break;
		case 'C':
			myArr[1]++;
			if(myArr[1] == checkArr[1])
				checkScret++;
			break;
		case 'G':
			myArr[2]++;
			if(myArr[2] == checkArr[2])
				checkScret++;
			break;
		case 'T':
			myArr[3]++;
			if(myArr[3] == checkArr[3])
				checkScret++;
			break;
		}
	}
	
	private static void Remove(char c) {
		switch(c) {
		case 'A':
			if(myArr[0] == checkArr[0])
				checkScret--;
			myArr[0]--;
			break;
		case 'C':
			if(myArr[1] == checkArr[1])
				checkScret--;
			myArr[1]--;
			break;
		case 'G':
			if(myArr[2] == checkArr[2])
				checkScret--;
			myArr[2]--;
			break;
		case 'T':
			if(myArr[3] == checkArr[3])
				checkScret--;
			myArr[3]--;
			break;
		}
	}
}
