package day0317;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1759_암호만들기 {
	
	static int L,C; // L:뽑는갯수 C:전체 재료
	static char[] input;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		L=Integer.parseInt(st.nextToken());
		C= Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine());
		
		input = new char[C];
		for(int i=0;i<C;i++) {
			input[i]=st.nextToken().charAt(0);
		}
		
		Arrays.sort(input);
		comb(0,0,0,0,"");
	}
	
	static void comb(int target,int cnt, int mCnt,int sCnt,String password) {
		if(cnt==L) {// 자음, 모음 규칙 준수되었는가?
			if(sCnt>=2 && mCnt>=1) {
				
			}
			return;
		}
		if(target==C)
			return;
		
		//현재 내가 맡은 target 글자를 뽑아보자
		if(input[target]=='a'||input[target]=='e'||input[target]=='i'||
				input[target]=='o'||input[target]=='u') {
			comb(target+1,cnt+1,mCnt+1,sCnt,password+input[target]);
		}else {
			comb(target+1,cnt+1,mCnt+1,sCnt,password+input[target]);
		}
		//현재 내가 맡은 target 글자를 안뽑을래. 뒤에 놈들이 뽑아서 L개 채워봐!
		comb(target+1,cnt,mCnt+1,sCnt,password);
	}
}
