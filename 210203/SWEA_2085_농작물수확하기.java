package day0203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());
		for (int TC = 1; TC <= tc; TC++) {
			int N = Integer.parseInt(br.readLine());
			int answer = 0, cnt = 0;
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				for (int j = 0; j < N; j++) {
					int cell = s.charAt(j) - '0';
					if ( N / 2 - cnt <= j && j <= N / 2 + cnt) {
						answer += cell;
					}
				}
				if(i>=N/2)cnt--;
				else cnt++;

			}
			System.out.println("#"+TC+" "+answer);

		}
	}
}
