package day0308;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_15657_N과M {
	static int N,M;
	static int[] arr;
	static boolean[] used;
	static StringBuilder sb,a;
	public static void main(String[] args) throws Exception{
		sb= new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		arr=new int[N];
		used=new boolean[N];
		StringTokenizer num = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(num.nextToken());
		}
		Arrays.sort(arr);
		powerSet(0,0);
		System.out.println(sb.toString());
	}
	static void powerSet(int idx,int cnt) {
		if(idx==M) {
			if(cnt==0)return;
			a= new StringBuilder();
			for(int i=0; i<N;i++) {
				if(used[i])
					a.append(arr[i]+" ");
			}
//			a.setLength(a.length()-1);
			sb.append(a+"\n");
//			System.out.println(a.toString());
			return;
		}
		used[idx]=true;
		powerSet(idx+1,cnt);
		used[idx]=false;
		powerSet(idx+1,cnt+1);
	}
}
