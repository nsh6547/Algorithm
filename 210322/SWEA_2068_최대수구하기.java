package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2068_최대수구하기 {
	static int T,max,num;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			max=Integer.MIN_VALUE;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<10;i++) {
				num= Integer.parseInt(st.nextToken());
				if(num>max)
					max=num;
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}
