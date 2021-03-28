package day0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1966_숫자를정렬하자 {
	static int T,N;
	static int[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T= Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T ;tc++) {
			N=Integer.parseInt(br.readLine());
			arr=new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			System.out.print("#"+tc+" ");
			for(int i=0; i<N;i++) {
				if(i==N-1)
					System.out.println(arr[i]);
				else
					System.out.print(arr[i]+" ");
			}
		}
	}
}
