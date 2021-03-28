import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1945_간단한소인수분해 {
	static int T,N,a,b,c,d,e;
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T= Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int a=0,b=0,c=0,d=0,e=0;
			N=Integer.parseInt(br.readLine());
			
			while(N%2==0) {
				N/=2;
				a++;
			}
			while(N%3==0) {
				N/=3;
				b++;
			}
			while(N%5==0) {
				N/=5;
				c++;
			}
			while(N%7==0) {
				N/=7;
				d++;
			}
			while(N%11==0) {
				N/=11;
				e++;
			}
			System.out.println("#"+tc+" "+a+" "+b+" "+c+" "+d+" "+e);
			
		}
	}
}