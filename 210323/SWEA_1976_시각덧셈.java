package day0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1976_시각덧셈 {
	static int T,a,b,c,d;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int tc =1; tc<=T;tc++) {
			StringTokenizer st= new StringTokenizer(br.readLine(), " ");
			a= Integer.parseInt(st.nextToken());
			b= Integer.parseInt(st.nextToken());
			c= Integer.parseInt(st.nextToken());
			d= Integer.parseInt(st.nextToken());
			int si=0;
			int min=0;
			int cnt=0;
			if(b+d>=60) {
				cnt++;
				min=(b+d)%60;
			}
			else {
				min=b+d;
			}
			if(a+c+cnt>=12) {
				si=(a+c+cnt)%12;
				if(si==0)
					si=12;
			}
			else {
				si=a+c+cnt;
			}
			System.out.println("#"+tc+" "+si+" "+min);
			
		}
	}
}
