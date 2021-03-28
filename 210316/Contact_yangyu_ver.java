package day0316;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Contact_yangyu_ver {
	static boolean[][] adj;
	static int[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			adj = new boolean[101][101];
			visit = new int[101];
			
			int len = sc.nextInt();
			int start = sc.nextInt();

			for (int i = 0; i < (len / 2); i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				adj[from][to] = true;
			}

			Arrays.fill(visit, Integer.MAX_VALUE);

			dfs(start, 0);
			
			int ans = 0; // 가장 늦게 연락받은 애중에 번호 제일 큰애
			int max = 0;
			
			for (int i = 1; i <= 100; i++) {
				if (visit[i]>=max && visit[i]!=Integer.MAX_VALUE) {
					ans = i;
					max = visit[i];
				}
			}
			System.out.println("#"+tc+" "+ans);
		}
	}

	static void dfs(int now, int time) {
		if (visit[now] <= time)
			return;

		visit[now] = time;

		for (int i = 1; i <= 100; i++) {
			if (adj[now][i])
				dfs(i, time + 1);
		}
	}
}