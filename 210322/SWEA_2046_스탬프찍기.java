package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2046_스탬프찍기 {
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append("#");
		}
		System.out.println(sb.toString());
	}
}
