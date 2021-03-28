package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1936_1대1가위바위보 {
	static int a,b;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		a= Integer.parseInt(st.nextToken());
		b= Integer.parseInt(st.nextToken());
		if(a==1&&b==2)
			System.out.println("B");
		else if(a==1&&b==3)
			System.out.println("A");
		else if(a==2&&b==1)
			System.out.println("A");
		else if(a==2&&b==3)
			System.out.println("B");
		else if(a==3&&b==2)
			System.out.println("A");
		else if(a==3&&b==1)
			System.out.println("B");
		}
	}
