import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1959_두개의숫자열 {
	static int T, A, B;
	static int[] arr1, arr2;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		for (int tc = 1; tc <= T; tc++) {
			int max = Integer.MIN_VALUE;
			st = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			if (A >= B) {
				arr1 = new int[A];
				arr2 = new int[B];

				st = new StringTokenizer(br.readLine(), " ");
				for (int i = 0; i < arr1.length; i++) {
					arr1[i] = Integer.parseInt(st.nextToken());
				}
				st = new StringTokenizer(br.readLine(), " ");
				for (int i = 0; i < arr2.length; i++) {
					arr2[i] = Integer.parseInt(st.nextToken());
				}

			} else {
				arr1 = new int[B];
				arr2 = new int[A];

				st = new StringTokenizer(br.readLine(), " ");
				for (int i = 0; i < arr2.length; i++) {
					arr2[i] = Integer.parseInt(st.nextToken());
				}
				st = new StringTokenizer(br.readLine(), " ");
				for (int i = 0; i < arr1.length; i++) {
					arr1[i] = Integer.parseInt(st.nextToken());
				}
			}
			int sum = 0;

			for (int i = 0; i < arr1.length - arr2.length + 1; i++) {
				sum = 0;
					for (int c = 0; c < arr2.length; c++) {
						sum += arr1[i + c] * arr2[c];
					}
					if (sum > max)
						max = sum;
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}
