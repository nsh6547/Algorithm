package day0317;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260_DFS와BFS {
	static int N,M,V;
	static boolean visit[];
	static boolean adj[][];
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb= new StringBuilder();
		N= sc.nextInt();
		M= sc.nextInt();
		V= sc.nextInt();
		
		adj = new boolean[N+1][N+1];
		
		for(int m=0; m<M;m++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adj[from][to] =true;
			adj[to][from] =true;
		}
		
		bfs(V);
	}
	
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		visit[start]= true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			sb.append(now+" ");
			
			for(int v=1; v<=N;v++) {
				if(adj[now][v] && !visit[v]) {
					visit[v]=true;
					queue.add(v);
				}
			}
		}
	}
	static void dfs(int now) {
		visit[now] = true;
		sb.append(now+" ");
		
		for(int v=1; v<=N; v++) {
			if(adj[now][v] && !visit[v]) {
				dfs(v);
			}
		}
		
	}
}
