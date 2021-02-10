package day0210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_4698_테네스의특별한소수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[1000001];
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i < arr.length; i++) {
			int j = 2;
			while (true) {
				if (i * j >= 1000001)
					break;
				arr[i * j] = true;
				j++;
			}
		}
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String D = st.nextToken();
			String A = st.nextToken();
			String B = st.nextToken();
			int cntDecimal = 0;

			for (int i = Integer.parseInt(A); i <= Integer.parseInt(B); i++) {
				if (arr[i] == false) {
					String s = Integer.toString(i);
					if (s.contains(D)) {
						cntDecimal++;
					}
				}
			}
			System.out.print("#" + tc + " ");
			System.out.println(cntDecimal);

		}
	}

}
