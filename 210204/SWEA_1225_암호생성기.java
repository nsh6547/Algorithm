package day0204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 암호생성기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int TC = 0; TC < 10; TC++) {
			int tc = Integer.parseInt(br.readLine());
			ArrayList<Integer> pw = new ArrayList<>();
			String pws = br.readLine();
			StringTokenizer st = new StringTokenizer(pws);
			for (int N = 0; N < 8; N++) {
				pw.add(Integer.parseInt(st.nextToken()));
			}

			while (true) {
				for (int i = 1; i < 6; i++) {
					if (pw.get(0) - i <= 0) {
						pw.add(0);
						pw.remove(0);
						break;
					} else {
						pw.add(pw.get(0) - i);
						pw.remove(0);
					}
				}
				if (pw.get(7) == 0)
					break;
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < pw.size(); i++) {
				System.out.print(pw.get(i) + " ");
			}
			System.out.println();
		}
	}
}
