package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2058_자릿수더하기 {
	static int N,sum;
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		for(int i=0;i<st.length();i++) {
			sum+=(st.charAt(i)-'0');
		}
		System.out.println(sum);
	}
}
