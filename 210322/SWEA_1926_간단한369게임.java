package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1926_간단한369게임 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			String st = Integer.toString(i);
			boolean check=false;
			for(int j=0;j<st.length();j++) {
				if(st.charAt(j)=='3'||st.charAt(j)=='6'||st.charAt(j)=='9') {
					sb.append("-");
					check=true;
					}
				
			}
			if(!check)
				sb.append(st);
			sb.append(" ");
			
		}
		System.out.println(sb.toString());
	}
}
