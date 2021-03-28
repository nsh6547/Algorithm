package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2050_알파벳을숫자로변환 {
  public static void main(String args[])throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String st = br.readLine();
	  StringBuilder sb=new StringBuilder();
	  for(int i=0; i<st.length();i++) {
		  int c=st.charAt(i)-'0'-16; 
		  sb.append(c+" ");
	  }
	  
	  System.out.println(sb.substring(0, sb.length()-1));
  }
}
