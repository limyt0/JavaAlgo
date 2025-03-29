package a04;

import java.io.*;
import java.util.*;


public class a04정렬16_p1377버블소트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		boolean changed = false;
		int N = Integer.parseInt(st.nextToken());
		mData[] arr = new mData[N];
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int value = Integer.parseInt(st.nextToken());
			arr[i] = new mData(value, i+1);
		}
		
		Arrays.sort(arr);
		int max = 0;
		for(int i = 0;i<N;i++) {
			if(arr[i].index - i > max) {
				max = arr[i].index - i;
			}
		}
		
		System.out.println(max);
	}


}

class mData implements Comparable<mData>{
	int value;
	int index;
	public mData(int value, int index) {
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(mData o) {
		return this.value - o.value;
	}
}