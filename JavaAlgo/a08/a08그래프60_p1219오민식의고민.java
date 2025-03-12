package a08;

import java.io.*;
import java.util.*;

public class a08그래프60_p1219오민식의고민 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int sCity = Integer.parseInt(st.nextToken());
		int eCity = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Edge60[] Edges = new Edge60[M];
		long[] distance = new long[N];
		long[] cityMoney = new long[N];
		Arrays.fill(distance, Long.MIN_VALUE);
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			Edges[i] = new Edge60(s, e, p);
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			cityMoney[i] = Long.parseLong(st.nextToken());
		}
		distance[sCity] = cityMoney[sCity];
		for(int i =0;i<=N+100;i++) {
			for(int j = 0;j<M;j++) {
				int start = Edges[j].start;
				int end = Edges[j].end;
				int price = Edges[j].price;
				if(distance[start] == Long.MIN_VALUE) continue;
				else if(distance[start] == Long.MAX_VALUE)
					distance[end] = Long.MAX_VALUE;
				else if(distance[end] < distance[start] + cityMoney[end] - price) {
					distance[end] = distance[start] + cityMoney[end] - price;
					if(i>=N-1) distance[end] = Long.MAX_VALUE;
				}
				
			}
		}
		if(distance[eCity] == Long.MIN_VALUE) System.out.println("gg");
		else if(distance[eCity] == Long.MAX_VALUE) System.out.println("Gee");
		else System.out.println(distance[eCity]);
	}

}



class Edge60{
	int start, end, price;
	public Edge60(int start, int end, int price){
		this.start = start;
		this.end = end;
		this.price = price;
	}
	
}