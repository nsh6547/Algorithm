package day0314;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_15657_N과M {
	static int N,M;
	static int[] arr,list;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception{
		sb= new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		list = new int [M];
		
		StringTokenizer num = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(num.nextToken());
		}
		
		Arrays.sort(arr);
		dfs(0,0);
		System.out.println(sb.toString());
	}
	static void dfs(int idx,int cnt) {
		if(cnt ==M) {
			for(int i=0; i<M;i++) {
				sb.append(list[i]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=idx; i<N; i++) {
			list[cnt]=arr[i];
			dfs(i,cnt+1);
		}
	}
}
