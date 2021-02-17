package day0217;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_1992_쿼드트리 {// 분할정복
	static int N;
	static boolean[][] arr;
	static int checkTrue, checkFalse;
	static StringBuilder sb ;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new boolean[N][N];
		sb= new StringBuilder();
		for (int i = 0; i < N; i++) {
			String row = br.readLine();
			for (int j = 0; j < N; j++) {
				boolean ch = (row.charAt(j) == '1') ? arr[i][j] = true : (arr[i][j] = false);
			}
		}

		func(0, 0, N, N);
		System.out.println(sb.toString());

	}

	static void func(int wi, int wj, int ei, int ej) {
		checkTrue=0;
		checkFalse=0;

		for (int i = wi; i < ei; i++) {
			for (int j = wj; j < ej; j++) {
				if (arr[i][j])
					checkTrue++;
				else
					checkFalse++;
			}
		}
		if (checkTrue==Math.pow((ei-wi),2)||checkFalse==Math.pow((ei-wi),2)||(ei-wi)+(ej-wj)==2) {
			
			if (checkTrue==0)
				sb.append('0');
			else
				sb.append('1');
			
			return;
		}
		
		int mi = (wi + ei) / 2;
		int mj = (wj + ej) / 2;
		sb.append('(');
		func(wi, wj, mi, mj);
		func(wi, mj, mi, ej);
		func(mi, wj, ei, mj);
		func(mi, mj, ei, ej);
		sb.append(')');

	}
}
