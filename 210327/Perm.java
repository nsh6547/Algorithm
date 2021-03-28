package day0205;
import java.util.Arrays;
import java.util.Stack;

public class Perm {
	static String[] source = {"A","B","C","D","E"};
	static boolean[] used = new boolean[source.length];
	static int N = 5, R = 2;
	static String[] result = new String[R];
	
	public static void main(String[] args) {
		perm(0);
	}
	
	static void perm(int idx) { // result 배열에 어느칸을 채우는지.
		if(idx==R) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!used[i]) { // 모든 재료중에 사용중이 아닌. 미사용상태는 전부 다 내 자리에 놔봐야지.
				result[idx] = source[i];
				used[i] = true;
				perm(idx+1);
				used[i] = false;
			}
		}
	}
}


