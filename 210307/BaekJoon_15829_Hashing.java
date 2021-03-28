package day0307;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_15829_Hashing {
	static int L, mod=1234567891 ;
	static long sum;
	//a = 97 이므로 모든 문자에 -96
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		L=Integer.parseInt(br.readLine());
		String st = br.readLine();
		sum=0;
		for(int i=0; i<L;i++) {
			sum+= (st.charAt(i)-96)*(pow(31, i));
		}
		System.out.println(sum%mod);
	}
	
	static long pow(int a, int b) {
		return b==0?1:a*pow(a,b-1)% mod;
	}
}
