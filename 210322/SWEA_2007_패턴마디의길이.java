package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2007_패턴마디의길이 {
	static int T;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			String st = br.readLine();
			
			for(int i=2;i<st.length();i++) {
				String s =st.substring(0, i);
				if(s.contains(st.substring(i, i*2))) {
					System.out.println("#"+tc+" "+s.length());
					break;
				}
			}
		}
	}
}
