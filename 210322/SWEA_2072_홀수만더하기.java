package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2072_홀수만더하기 {
	static int T;
	static int sum;
	static int num;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			sum=0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<10;i++) {
				num= Integer.parseInt(st.nextToken());
				if(num%2!=0)
					sum+=num;
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
