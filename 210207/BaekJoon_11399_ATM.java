package day0207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_11399_ATM {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i =0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());	
		}
		Arrays.sort(arr);
		int sum=0;
		int temp=0;
		for (int i:arr) {
			temp +=i;
			sum+=temp;
		}
		System.out.println(sum);
		
		
	}
}
