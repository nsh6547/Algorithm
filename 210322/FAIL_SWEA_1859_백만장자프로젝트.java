package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FAIL_SWEA_1859_백만장자프로젝트 {
	static int T,N,cnt,max,point;
	static long sum;
	static int[] arr;
	static boolean[] check;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			sum=0;
			point=0;
			max=Integer.MIN_VALUE;
			N=Integer.parseInt(br.readLine());
			arr=new int[N];
			check=new boolean[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
				if(arr[i]>max)
					max=arr[i];
			}
			for(int i=0;i<N;i++) {
				if(i<=N-2&&arr[i]<max&&arr[i]<=arr[i+1])
					check[i]=true;
				else {
					for(int j=point;j<i;j++) {
						if(check[j]) {
							sum+=arr[i];
							sum-=arr[j];
							check[j]=false;
							}
					}
					point=i;
				}
					
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
