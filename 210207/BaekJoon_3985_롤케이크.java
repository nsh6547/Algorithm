package day0207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_3985_롤케이크 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int[] arr = new int[L];
		int N = Integer.parseInt(br.readLine());
		int[] predMax = {0,0};
		int[] manyRoll = { 0, 0 };
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int front = Integer.parseInt(st.nextToken());
			int back = Integer.parseInt(st.nextToken());
			if (back - front > predMax[1]) {
				predMax[0] = i;
				predMax[1]=back-front;
			}

			for (int j = front - 1; j < back; j++) {

				if (arr[j] == 0) {
					arr[j] = i;
					cnt++;
				}
			}
			if (cnt > manyRoll[1]) {
				manyRoll[0] = i;
				manyRoll[1] = cnt;
			}
		}
		System.out.println(predMax[0]);
		System.out.print(manyRoll[0]);
	}
}
