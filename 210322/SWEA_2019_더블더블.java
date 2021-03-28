package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2019_더블더블 {
	static int a,result;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a= Integer.parseInt(br.readLine());
		result=1;
		System.out.print(result+" ");
		for(int i=1;i<=a;i++) {
			result*=2;
			if(i==a)
				System.out.print(result);
			else 
				System.out.print(result+" ");
			}
		}
	}
