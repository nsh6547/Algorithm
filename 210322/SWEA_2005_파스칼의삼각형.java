package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_2005_파스칼의삼각형 {
	static int T,n;
	static int[][] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int tc=1 ;tc<=T;tc++) {
			StringBuilder sb = new StringBuilder();
			sb.append("#"+tc+" ");
			n=Integer.parseInt(br.readLine());
			arr=new int[n][n];
			for(int i=0;i<n;i++) {
				arr[i][0]=1;
			}
			for(int i=1;i<n;i++) {
				for(int j=1;j<n;j++) {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
			for(int i=0;i<n;i++) {
				sb.append("\n");
				for(int j=0;j<n;j++) {
					if(arr[i][j]!=0) {
					if(j==n-1)sb.append(arr[i][j]);
					else sb.append(arr[i][j]+" ");}
				}
			}
			System.out.println(sb.toString());
		}
	}
}
