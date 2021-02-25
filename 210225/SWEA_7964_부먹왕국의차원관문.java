package day0225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_7964_부먹왕국의차원관문 {
	static int T, N,D;
	static int cnt,minblock;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N=Integer.parseInt(st.nextToken()); 
			D=Integer.parseInt(st.nextToken());
			StringTokenizer cityInfo = new StringTokenizer(br.readLine(), " ");
			minblock=0;
			for(int i=0; i<N;i++) {
				if(((cityInfo.nextToken()).charAt(0)=='1'))
					cnt=0;
				else {
					cnt++;
					if(cnt==D) {
						cnt=0;
						minblock++;
					}
				}
			}
			System.out.println("#"+tc+" "+minblock);
		}
	}
}
