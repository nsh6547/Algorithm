package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2043_서랍의비밀번호 {
	static int P,K;
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.println(Integer.parseInt(st.nextToken())-Integer.parseInt(st.nextToken())+1);
	}
	
}
