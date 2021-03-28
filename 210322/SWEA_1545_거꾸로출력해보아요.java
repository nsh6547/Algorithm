package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1545_거꾸로출력해보아요 {
	static int a,result;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a= Integer.parseInt(br.readLine());
		for(int i=a;i>=0;i--) {
			if(i==0)
				System.out.print(i);
			else
			System.out.print(i+" ");
		}
		}
	}
