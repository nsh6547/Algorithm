package day0314;

import java.util.Arrays;
import java.util.Scanner;

public class P2_BitOperatorTest {

	static int N;
	static int[] input, numbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		input = new int[N];
		numbers= new int[N];
		
		for(int i=0; i<N;i++) {
			input[i] = sc.nextInt();
		}
		
		permutation(0,0);
	}
	private static void permutation(int cnt,int flag) {
		
		if(cnt==N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}else
		
		for(int i=0;i<N;i++) {
			if((flag & 1<<i)!=0)continue;
			
			numbers[cnt]=input[i];
			permutation(cnt+1,flag | 1<<i);
		}
	}
}
