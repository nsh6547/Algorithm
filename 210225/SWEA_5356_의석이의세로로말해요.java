package day0225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5356_의석이의세로로말해요 {
	static int T;
	static char[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int tc =1; tc<=T;tc++) {
			arr=new char[5][];
			StringBuilder sb = new StringBuilder();
			sb.append("#"+tc+" ");
			
			for(int i=0;i<5;i++) {
				String st = br.readLine();
				arr[i]=new char [st.length()];
				for(int j=0;j<st.length();j++) {
					
					arr[i][j]=st.charAt(j);
				}
			}
			for(int j=0;j<15;j++) {
				for(int i=0;i<5;i++) {
					if(j>=arr[i].length)
						continue;
					sb.append(arr[i][j]);
				}
			}
			System.out.println(sb.toString());
		}
	}
}
