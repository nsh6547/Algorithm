package day0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1979_어디에단어가들어갈수있을까 {
	static int T,N,K;
	static boolean[][] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		for(int tc=1;tc<=T;tc++) {
			st= new StringTokenizer(br.readLine()," ");
			N=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			arr=new boolean[N+2][N+2];
			for(int i=1;i<=N;i++) {
				st= new StringTokenizer(br.readLine()," ");
				for(int j=1;j<=N;j++) {
					if(Integer.parseInt(st.nextToken())==1)
						arr[i][j]=true;
					else
						arr[i][j]=false;
				}
			}
			
			int sum=0;
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					int check =0;
					if(!arr[i][j-1]&&arr[i][j]) {
						
						int a=j+1;
						while(arr[i][a]) {
							check++;
							a++;
						}
					}
					if(check==K-1) {
						sum++;
//						System.out.println(i+" "+j);
						}
				}
			}
			
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					int check =0;
					if(!arr[j-1][i]&&arr[j][i]) {
						int a=j+1;
						while(arr[a][i]) {
							check++;
							a++;
						}
					}
					if(check==K-1) {
						sum++;
//						System.out.println(i+" "+j);
					}
				}
			}
			
			System.out.println("#"+tc+" "+sum);
			
		}
	}
}
