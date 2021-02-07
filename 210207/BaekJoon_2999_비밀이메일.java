package day0207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2999_비밀이메일 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String message=br.readLine();
		int N=message.length(),C=N,R=1;
		for(int i=1;i<message.length();i++) {
			int temp=N/i;
			if(N%i==0 && N/i==temp && temp>=i) {
				R=i;
				C=N/R;
			}
		}
		char[][]arr =new char[R][C];
		int cnt =0;
		for(int i=0 ; i<C;i++) {
			for(int j=0; j<R;j++) {
				
				arr[j][i]=message.charAt(cnt);
				cnt++;
			}
		}
		for(int i=0 ; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]);
				
			}
		}
		
	}

}
