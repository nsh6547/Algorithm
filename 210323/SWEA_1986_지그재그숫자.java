package day0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1986_지그재그숫자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int sum=0;
			for (int i = 1; i <= N; i++) {
				if(i%2==0)
					sum-=i;
				else
					sum+=i;
			}
			System.out.println("#"+tc+" "+sum);

		}
	}
}
