import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JungOl_1828_냉장고 {
	static int N;

	static class Material implements Comparable<Material> {
		int low, high;

		public Material(int low, int high) {
			super();
			this.low = low;
			this.high = high;
		}

		@Override
		public int compareTo(Material o) {
			int diff = this.low - o.low;
			return diff != 0 ? diff : this.high - o.high;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		Material[] m = new Material[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			m[i] = new Material(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		int lowRefri = getLowRefri(m);
		System.out.println(lowRefri);

	}

	static int getLowRefri(Material[] a) {
		Arrays.sort(a);
		int refriCnt = 1;
		int low = a[0].low, high = a[0].high;
		for (int i = 1; i < a.length; i++) {
			if (low <= a[i].low && a[i].low <= high) {
				low = a[i].low;
				if (a[i].high >= high)

					continue;
				else if (a[i].high < high) {
					high = a[i].high;
				}

			} else {
				low = a[i].low;
				high = a[i].high;
				refriCnt++;
			}
		}
		return refriCnt;

	}
}
