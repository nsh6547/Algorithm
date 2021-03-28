package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2071_평균값구하기 {
	static int T;
	static float sum;
	static int num;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			sum=0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<10;i++) {
				sum+=Integer.parseInt(st.nextToken());
			}
			System.out.println("#"+tc+" "+Math.round(sum/10));
		}
	}
}
