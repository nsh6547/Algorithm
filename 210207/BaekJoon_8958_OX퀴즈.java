package day0207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_8958_OX퀴즈 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int TC=1; TC<=tc;TC++) {
			String ox = br.readLine();
			int allPoint=0;
			int continues=0;
			for(int i=0; i<ox.length();i++) {
				char room= ox.charAt(i);
				if(room=='O') {
					continues=continues+1;
					allPoint+=continues;
				}else {
					continues=0;
				}
			}
			System.out.println(allPoint);
		}
	}
}
