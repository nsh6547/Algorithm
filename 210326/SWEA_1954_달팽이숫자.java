import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_1954_달팽이숫자 {
	static int T, N, flag, ix, iy;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		int[] di = { 0, 1, 0, -1 };
		int[] dj = { 1, 0, -1, 0 };
		ix = di[flag];
		iy = dj[flag];
		for (int tc = 1; tc <= T; tc++) {
			int[] xny = { 0, 0 };
			int start = 0;
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			flag = 0;
			ix = di[flag];
			iy = dj[flag];

			for (int a = N; a > 0; a--) {

				if (a == N) {

					for (int i = 0; i < a; i++) {
						start++;
						arr[xny[0]][xny[1]] = start;
						if (i < a - 1) {
							xny[0] += ix;
							xny[1] += iy;
						}
					}
				} else {

					for (int b = 0; b < 2; b++) {
						for (int i = 0; i < a; i++) {
							start++;
							arr[xny[0]][xny[1]] = start;
//							System.out.println(xny[0] + "," + xny[1]);
							if (i < a - 1) {
								xny[0] += ix;
								xny[1] += iy;
							}
						}
						if(b<1) {
						flag++;
						if (flag == 4) {
							flag = 0;
							ix = di[flag];
							iy = dj[flag];
						} else {
							ix = di[flag];
							iy = dj[flag];
						}
						xny[0] += ix;
						xny[1] += iy;
//						System.out.println(flag);
						}
					}
				}
				flag++;
				if (flag == 4) {
					flag = 0;
					ix = di[flag];
					iy = dj[flag];
				} else {
					ix = di[flag];
					iy = dj[flag];
				}
				xny[0] += ix;
				xny[1] += iy;
//				System.out.println(flag);

			}
			System.out.println("#"+tc);
			for (int i = 0; i < N; i++) {
				for(int j=0;j<N;j++) {
					if(j<N-1)
					System.out.print(arr[i][j]+" ");
					else
						System.out.print(arr[i][j]);
				}
				System.out.println();
			}

		}
	}
}
/*
 * 1 2 3 4 5 161718196 152425207 142322218 131211109 5 44 33 22 11 4 33 22 11 3
 * 22 11
 * 
 */