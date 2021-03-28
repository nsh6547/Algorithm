package day0226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_2309_일곱난장이 {
	static int[] arrK,ans;
	static boolean[] used;
	static int N = 7;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arrK = new int[9];
		ans = new int[7];
		used = new boolean[9];
		for (int i = 0; i < 9; i++) {
			arrK[i] = Integer.parseInt(br.readLine());
		}
		powerSet(0);
	}

	private static void powerSet(int target) {
		int a=0;
		int sum=0;
		if (target == N) {
			for(int j=0;j<used.length;j++) {
				if(used[j])
					sum+=arrK[j];
				if(sum==100) {
					for(int i=0;i<used.length;i++)
						if(used[i])
							ans[a++]=arrK[i];
					Arrays.sort(ans);
					for(int i=0;i<ans.length;i++) 
						System.out.println(ans[i]);
				}
				return;
			}
			
			
		}
		
		used[target] = true;
		powerSet(target + 1);
		used[target] = false;
		powerSet(target + 1);
		System.out.println();
	}
}
