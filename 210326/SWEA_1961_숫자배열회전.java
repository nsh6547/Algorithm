
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1961_숫자배열회전 {
	static int T, N;
	static int[][] arr, temp;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = null;
		for (int tc = 1; tc <= T; tc++) {
			sb = new StringBuilder();
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			temp = new int[N][N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			sb.append("#" + tc + "\n");
			
			for(int j=0;j<N;j++) {
			
			for (int c = 0; c < 3; c++) {
				rotate();
				for (int i = 0; i < N; i++) {
					sb.append(arr[j][i]);
				}
				sb.append(" ");
				
			}
			sb.append("\n");
			rotate();
			}
			System.out.print(sb.toString());

		}
	}

	static public void rotate() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				temp[i][j] = arr[N - 1 - j][i];
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = temp[i][j];
			}
		}
	}
}
