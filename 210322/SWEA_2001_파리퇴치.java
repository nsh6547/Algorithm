package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2001_파리퇴치 {
	static int T, N, M;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				st= new StringTokenizer(br.readLine()," ");
				for (int j = 0; j < N; j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			int max=Integer.MIN_VALUE;
			
			for(int a=0;a<N-M+1;a++) {
				for(int b=0;b<N-M+1;b++) {
					int sum=0;
					for(int i=a;i<a+M;i++) {
						for(int j=b;j<b+M;j++) {
							sum+=arr[i][j];
//							System.out.println(arr[i][j]);
						}
					}
					if(sum>max) max=sum;
//					System.out.println(a+","+b);}
					
				}
			}
			System.out.println("#"+tc+" "+max);
			
			
			
		}
		
	}
}
