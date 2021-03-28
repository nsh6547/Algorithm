package day0226;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class BaekJoon_2455_지능형기차 {
	static int max,person;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		person=0;// <=10,000
		max=Integer.MIN_VALUE;
		for(int i=0;i<4;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			person-=Integer.parseInt(st.nextToken());
			person+=Integer.parseInt(st.nextToken());
			if(person>=max)max=person;
//			System.out.println(person);
			
		}
		System.out.println(max);
		
		for (int i = 0; i < args.length; i++) {
			
		}
	}
}
