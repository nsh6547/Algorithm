package day0225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_4789_성공적인공연기획 {
	static int T, person, check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			person = 0;
			check = 0;
			StringBuilder sb = new StringBuilder();
			sb.append("#"+tc+" ");
			String st = br.readLine();
			for (int i = 0; i < st.length(); i++) {
				int a = st.charAt(i) - '0';
				if (i >= 1 && person < i) {
					check+= (i-person) ;
					person+=(i-person);
				}
				person += a;
			}
			sb.append(check);
			System.out.println(sb.toString());

		}
	}
}
