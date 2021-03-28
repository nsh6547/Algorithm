package day0314;

import java.util.Arrays;
import java.util.Scanner;

public class P1_PermutationBasicTest {

	static int N;
	static int[] input, numbers;
	static boolean[] isSelected;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		input = new int[N];
		numbers= new int[N];
		isSelected=new boolean[N];
		
		for(int i=0; i<N;i++) {
			input[i] = sc.nextInt();
		}
		
		permutation(0);
	}
	private static void permutation(int cnt) {
		
		if(cnt==N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}else
		
		for(int i=0;i<N;i++) {
			if(isSelected[i])continue;
			
			numbers[cnt]=input[i];
			isSelected[i]=true;
			permutation(cnt+1);
			isSelected[i]=false;
		}
	}
}
