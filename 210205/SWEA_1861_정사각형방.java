package day0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_정사각형방_1861 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] di = { 1, -1, 0, 0 };
		int[] dj = { 0, 0, -1, 1 };

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] room = new int[N][N];

			for (int x = 0; x < N; x++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int y = 0; y < N; y++) {
					room[x][y] = Integer.parseInt(st.nextToken());
				}
			}
			int ansRoom=Integer.MAX_VALUE, ansMax = 1; // 방번호와 이동한 방
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int i2 = i, j2 = j;
					int check = 1, tmpNum = room[i][j];
					
					while (true) {
						int cnt = 0;
						for (int d = 0; d < 4; d++) {
							int x = i2 + di[d];
							int y = j2 + dj[d];
							if (0 <= x && x < N && 0 <= y && y < N && room[x][y] == tmpNum + 1) {
								cnt++;
								tmpNum++;
								check += 1;
								i2 = x;
								j2 = y;
							}
						}
						if ( cnt == 0)
							break;
					}
					if (check > ansMax) {
						ansMax = check;
						ansRoom=room[i][j];
						
					}else if(check == ansMax && room[i][j]<ansRoom) {
						ansRoom=room[i][j];
					}
				}
			}
			System.out.println("#"+tc+" "+ansRoom+" "+ansMax);
		}
	}
}
