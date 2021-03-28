package day0316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SWEA_1238_Contact {
	static int data_len,start_point;
	static StringBuilder sb;
	static LinkedList<Integer> num ;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb= new StringBuilder();
		for(int tc=1;tc<=10;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			num= new LinkedList<>();
			data_len=Integer.parseInt(st.nextToken());
			start_point=Integer.parseInt(st.nextToken());
			StringTokenizer nums= new StringTokenizer(br.readLine()," ");
			for(int i=0;i<data_len/2;i++) {
				int from =Integer.parseInt(nums.nextToken());
				int to =Integer.parseInt(nums.nextToken());
				if(num.contains(from))num.add(from,to);
				else {
					num.addFirst(from);
				}
				
			}
			System.out.println(num.size());
			
		}
	}
}
