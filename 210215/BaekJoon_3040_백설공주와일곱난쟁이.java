package day0215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_3040_백설공주와일곱난쟁이 {
	static int N;
	static int[] ans,numbers;
	static boolean[] used;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		N = 7;
		numbers =new int[N];
		used=new boolean[9];
		ans=new int[N];

		powerSet(0, arr,ans);
		for(int i=0; i<N;i++) {
		System.out.println(ans[i]);}
	}

	static void powerSet(int cnt, int[] arr,int[] ans) {
		// 7명을 다 뽑았다면 비교
		if (cnt == N) {
			int sumHun = 0;

			for (int i = 0; i < 9; i++) {
				if (used[i]) {
					sumHun += arr[i];
				}
			}
			
			if (sumHun == 100) {
				for (int i = 0; i < numbers.length; i++) {
					ans[i]=numbers[i];
				}
			}
			return;
		}
		
		for (int i = 0; i < 9; i++) {
			if(used[i])continue;
			
			numbers[cnt] = arr[i];
			used[i]=true;
			powerSet(cnt+1,arr,ans);
			used[i]=false;
		}
	}
}
