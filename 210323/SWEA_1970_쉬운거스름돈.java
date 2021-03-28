package day0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1970_쉬운거스름돈 {
	static int T,N;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T;tc++) {
			arr= new int[8];
			N=Integer.parseInt(br.readLine());
			if(N/50000>=1) {
				arr[0]=N/50000;
				N=N%50000;
				}
			if(N/10000>=1) {
				arr[1]=N/10000;
				N=N%10000;
				}
			if(N/5000>=1) {
				arr[2]=N/5000;
				N=N%5000;
				}
			if(N/1000>=1) {
				arr[3]=N/1000;
				N=N%1000;
				}
			if(N/500>=1) {
				arr[4]=N/500;
				N=N%500;
				}
			if(N/100>=1) {
				arr[5]=N/100;
				N=N%100;
				}
			if(N/50>=1) {
				arr[6]=N/50;
				N=N%50;
				}
			if(N/10>=1) {
				arr[7]=N/10;
				N=N%10;
				}
			System.out.println("#"+tc);
			for(int i=0;i<8;i++) {
				if(i==7)
					System.out.print(arr[i]+"\n");
				else
					System.out.print(arr[i]+" ");
			}
		}
		
	}
}
