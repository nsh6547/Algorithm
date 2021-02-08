package day0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_9229_한빈이와SpotMart {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int T=1;T<=tc;T++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N =Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			StringTokenizer we =new StringTokenizer(br.readLine(), " ");
			int[] arr = new int [N];
			for(int i=0; i<N; i++) {
				arr[i]= Integer.parseInt(we.nextToken());
			}
			int max =0;
			for(int j=0; j<N; j++) {
				for(int k=j+1; k<N;k++) {
					if(arr[j]+arr[k]<=M &&max<arr[j]+arr[k])
						max =arr[j]+arr[k];
				}
			}
			if(max ==0)
				System.out.println("#"+T+" -1");
			else
			System.out.println("#"+T+" "+max);
			
		}
	
	}
}
