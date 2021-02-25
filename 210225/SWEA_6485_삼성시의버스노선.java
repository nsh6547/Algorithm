package day0225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_6485_삼성시의버스노선 {
	static int T,N,A,B,P,C;
	static int num,arrlength;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T= Integer.parseInt(br.readLine());
		for(int tc =1 ; tc<=T;tc++) {
			StringBuilder sb =  new StringBuilder();
			N=Integer.parseInt(br.readLine());
			arr=new int[5001];
			arrlength=0;
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				A=Integer.parseInt(st.nextToken());
				B=Integer.parseInt(st.nextToken());
				if(B>=arrlength)arrlength=B;
				for(int j=A;j<=B;j++) {
					arr[j]++;
				}
			}
			P=Integer.parseInt(br.readLine());
			sb.append("#"+tc+" ");
			
			for(int j=0; j<P;j++) {
				C=Integer.parseInt(br.readLine());
				sb.append(arr[C]+" ");
			}
			sb.setLength(sb.length()-1);
			System.out.println(sb.toString());
		}
	}
}

