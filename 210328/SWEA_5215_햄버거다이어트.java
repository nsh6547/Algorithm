package day0328;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_5215_햄버거다이어트 {
	static int T,N,L,t,K,maxPoint;
	static int[][] arr;
	static boolean[] used;
	
	static StringTokenizer st = null;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T= Integer.parseInt(br.readLine());
		
		for(int tc= 1; tc<=T; tc++) {
			st= new StringTokenizer(br.readLine()," ");
			N=Integer.parseInt(st.nextToken());
			L=Integer.parseInt(st.nextToken());
			arr=new int[N][2];
			used = new boolean[N];
			maxPoint=Integer.MIN_VALUE;
			
			for(int i=0; i<N;i++) {
				st= new StringTokenizer(br.readLine()," ");
				arr[i][0]=Integer.parseInt(st.nextToken());
				arr[i][1]=Integer.parseInt(st.nextToken());
			}
			
			PowerSet(0);
			System.out.println("#"+tc+" "+maxPoint);
		}
	}
	static public void PowerSet(int target) {
		int sumCal=0;
		int sumPoint=0;
		if(target==N) {
			
			for(int i=0;i<N;i++) {
				if(used[i]) {
					sumCal+=arr[i][1];
					sumPoint+=arr[i][0];
					}
			}
			if(sumCal<=L && maxPoint<=sumPoint)
				maxPoint=sumPoint;
			return;
		}
		used[target]=true;
		PowerSet(target+1);
		used[target]=false;
		PowerSet(target+1);
		
	}
}
