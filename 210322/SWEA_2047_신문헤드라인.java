package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2047_신문헤드라인 {
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String st = br.readLine();
		// 32 더하기
		for(int i=0;i<st.length();i++) {
			if(i==0) {
				sb.append(st.charAt(i));
				continue;
				}
			if(st.charAt(i)=='_'||st.charAt(i)=='.')
				sb.append(st.charAt(i));
			else {
				int c= st.charAt(i)-32;
				char ch= (char)(c);
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
	}
}
