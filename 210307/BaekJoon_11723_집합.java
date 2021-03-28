package day0307;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11723_집합 {
	static int M,num;
	static String operator;
	static boolean[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr=new boolean[21];
		M=Integer.parseInt(br.readLine());
		StringBuilder sb  =new StringBuilder();
		for(int i=0; i<M;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			operator=st.nextToken();
			if(!operator.equals("all")&&!operator.equals("empty"))
				num=Integer.parseInt(st.nextToken());
				
			switch(operator) {
				case "add":
					arr[num]=true;
					break;
				case "remove":
					arr[num]=false;
					break;
				case "check":
					if(arr[num])
						sb.append(1+"\n");
					else
						sb.append(0+"\n");
					break;
				case "toggle":
					if(arr[num])
						arr[num]=false;
					else
						arr[num]=true;
					break;
				case "all":
					for(int j=1;j<=20;j++) {
						arr[j]=true;
					}
					break;
				case "empty":
					arr=new boolean[21];
					break;
				default:
					break;
				}
//			System.out.println(i+" "+hs.toString());
		}
		System.out.println(sb.toString());
	}
}
