package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2070_큰놈작은놈같은놈 {
	static int T;
	public static void main(String args[])  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			if(left> right)
				System.out.println("#"+tc+" >");
			else if(left < right)
				System.out.println("#"+tc+" <");
			else
				System.out.println("#"+tc+" =");
		}
	}
}
