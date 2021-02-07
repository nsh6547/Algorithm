package day0207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2810_컵홀더 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String info = br.readLine();
		int cnt =0,cn=0;
		for(int i=0; i<N; i++) {
			char person = info.charAt(i);
			if(person=='L')
				cnt++;
		}
		if(cnt==0)
			System.out.println(N);
		else
		System.out.println(N-(cnt/2-1));
	}

}
