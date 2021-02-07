package day0207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2851_슈퍼마리오 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int point= 0;
		for (int i=0; i<10;i++) {
			int mushroom =Integer.parseInt(br.readLine());
			
			if(Math.abs(100-point) >=Math.abs(100-(mushroom+point)) ) {
			point+=mushroom;
			}else if(Math.abs(100-point) <Math.abs(100-(mushroom+point)))// 여기 예외처리 안해서 계속틀렸음
					break;
		}
		System.out.print(point);
	}
}
