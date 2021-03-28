package day0205;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class comb_exer {
	static int[] input;
	static boolean[] used;
	static int N=5,R=2;
	static int[] result= new int[N];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		input = new int[N];
		used = new boolean[N];
		for(int i=0;i<5;i++) {
			input[i]=Integer.parseInt(st.nextToken());
		}
//		comb(0,0);
		perm(0);
		
	}
	private static void comb(int cnt, int target) {
		if(cnt==R) {
			for(int i=0;i<N;i++) {
				if(used[i])
					System.out.print(input[i]+" ");
			}
			System.out.println();
			return;
		}
		if(target==N)
			return;
		
		used[target]=true;
		comb(cnt+1,target+1);
		used[target]=false;
		comb(cnt,target+1);
					
	}
	private static void perm(int idx) {
		if(idx==R) {
			System.out.println(Arrays.toString(result));
			return;
			}
			
		
		
		for(int i=0;i<N;i++) {
			if(!used[i]) {
				result[idx]=input[i];
				used[i]=true;
				perm(idx+1);
				used[i]=false;
			}
				
		}
	}
	
}
