package day0205;

import java.util.Arrays;

public class Comb1 {
	static String[] source = {"A","B","C","D","E"};
	static int N = 5, R = 2;
	static String[] result = new String[R];
	
	public static void main(String[] args) {
		comb(0,0);
	}
	
	static void comb(int cnt, int start) {
		if(cnt==R) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i=start; i<N; i++) {
			result[cnt] = source[i];
			comb(cnt+1, i+1);
		}
	}
}