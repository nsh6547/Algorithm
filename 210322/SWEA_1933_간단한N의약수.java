package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1933_간단한N의약수 {
	static int a,b;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				if(i==a)
					System.out.print(i);
				else
				System.out.print(i+" ");
				}
		}
	}
}
