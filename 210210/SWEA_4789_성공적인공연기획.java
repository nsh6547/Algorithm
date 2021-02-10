package day0210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_4789_성공적인공연기획 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			int sum = 0;
			int answer = 0;

			for (int i = 1; i < s.length(); i++) {
				int ss = s.charAt(i) - '0';
				sum += ss;

				if (sum < i) {
					answer += (i - sum);
					sum += (i - sum);
				}
			}

			System.out.print("#" + tc + " ");
			System.out.println(answer);
		}
	}
}
