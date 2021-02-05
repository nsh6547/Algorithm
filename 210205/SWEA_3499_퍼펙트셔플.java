package day0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3499_퍼펙트셔플 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T= Integer.parseInt(br.readLine());
		
		for(int tc =1; tc<=T;tc++) {
			int N= Integer.parseInt(br.readLine());
			int half =N/2;
			String[] right = new String[half];
			if(N%2!=0)half++;
			String[] left = new String[half];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<left.length;i++ ) 
				left[i]=st.nextToken();
			for (int i=0; i<right.length;i++)
				right[i]=st.nextToken();
			StringBuilder sb = new StringBuilder();
			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			for(int i=0; i<left.length;i++) {
				sb.append(left[i]+" ");
				if(right.length<left.length &&i==left.length-1)break;
				sb.append(right[i]+" ");
				
				
			}
			sb.deleteCharAt(sb.lastIndexOf(" "));
			System.out.println(sb);
		}
	}
}
