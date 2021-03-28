package day0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1989_초심자의회문검사 {
	static int T;
	static boolean check;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			check=true;
			String st = br.readLine();
			for(int i=0; i<st.length()/2;i++) {
				char first = st.charAt(i);
				char last = st.charAt(st.length()-i-1);
				if(first!=last) {
					check=false;
					break;
				}
			}
			
			
			
			if(check)
				System.out.println("#"+tc+" "+1);
			else
				System.out.println("#"+tc+" "+0);
		}
		
		
	}
}
