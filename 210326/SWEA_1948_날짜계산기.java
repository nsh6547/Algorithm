import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1948_날짜계산기 {
	static int T,m1,d1,m2,d2;
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		int[][] arr= {{0,0},{1,31}, {2,28}, {3,31}, {4,30}, 
				{5,31}, {6,30}, {7,31}, {8,31}, 
				{9,30}, {10,31}, {11,30}, {12,31}};
		for(int tc=1;tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			m1=Integer.parseInt(st.nextToken());
			d1=Integer.parseInt(st.nextToken());
			m2=Integer.parseInt(st.nextToken());
			d2=Integer.parseInt(st.nextToken());
			int sum=0;
			if(m1==m2){
				sum=d2-d1+1;
			}
			else {
			sum= d2+arr[m1][1]-d1+1;
			for(int a=m1+1;a<m2;a++) {
				sum+=arr[a][1];
			}
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
