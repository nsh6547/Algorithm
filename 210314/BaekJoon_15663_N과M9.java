package day0314;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class BaekJoon_15663_N과M9 {
	static int N,M;
	static int[] arr,list;
	static boolean[] isSelected;
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception{
		sb= new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		list=new int[N];
		isSelected = new boolean[N];
		
		StringTokenizer num = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(num.nextToken());
		}
		
		Arrays.sort(arr);
		permutation(0);
		System.out.println(sb.toString());
	}
	private static void permutation(int cnt) {
		if(cnt ==M) {
			for(int i=0;i<M;i++) {
				sb.append(list[i]+" ");
			}
			sb.append("\n");
		}else {
			int before =0;
			for(int i=0; i<N;i++) {
				if(isSelected[i])continue;
				else if (!isSelected[i] &&(i==0||before !=arr[i])) {
				before = arr[i];
				list[cnt]=arr[i];
				isSelected[i]=true;
				permutation(cnt+1);
				isSelected[i]=false;}
			}
		}
	}
}

/*			for(int j=i+1;j<N-1;j++) {
	if(arr[i]==arr[j])isSelected[j]=true;
}
*/
