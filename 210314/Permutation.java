package day0314;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Permutation {
	
	static int N;
	static boolean[] isSelected;
	static int[] Numbers,input;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		Numbers=new int[N];
		input=new int[N];
		isSelected=new boolean[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N;i++) {
			input[i]=Integer.parseInt(st.nextToken());
		}
		permutation(0);
	}
	private static void permutation(int cnt) {
		if(cnt==N) {
			System.out.println(Arrays.toString(Numbers));
		}else {
			for(int i=0;i<N;i++) {
				if(isSelected[i])continue;
				Numbers[cnt]=input[i];
				isSelected[i]=true;
				permutation(cnt+1);
				isSelected[i]=false;
			}
		}
	}
}
