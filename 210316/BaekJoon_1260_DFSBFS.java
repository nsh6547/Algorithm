package day0316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_1260_DFSBFS {
	
	static int N,M,V,from,to;
	static StringTokenizer st ;
	static boolean[] visited;
	static ArrayList<Integer>[] list;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st= new StringTokenizer(br.readLine()," ");
		
		N= Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		V= Integer.parseInt(st.nextToken());
		
		for(int i=0;i<N+1;i++) {
			list[i]= new ArrayList<Integer>();
		}
		
		
		for(int i=0; i<M;i++) {
			st= new StringTokenizer(br.readLine()," ");
			from=Integer.parseInt(st.nextToken());
			to=Integer.parseInt(st.nextToken());
			
			list[from].add(to);
			list[to].add(from);
			}
		for(int i=1;i<N+1;i++) {
			Collections.sort(list[i]);
		}
		visited = new boolean[N+1];
		dfs(V);
		System.out.println();
		
		visited = new boolean[N+1];
		bfs(V);
		System.out.println();
	}
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int a = queue.poll();
			System.out.print(a + " ");
			for(int k: list[a]) {
				if(!visited[k]) {
					queue.add(k);
					visited[k]= true;
				}
			}
		}
	}
	private static void dfs(int start) {
		if(visited[start])
			return;
		visited[start]=true;
		System.out.print(start + " ");
		
		for(int k : list[start]) {
			if(!visited[k])
				dfs(k);
		}
	}
	
}
