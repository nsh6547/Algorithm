package day0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1983_조교의성적매기기 {
	static int T,N,K,mid,fin,hw,check;
	static double[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T= Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		for(int tc=1 ; tc<=T;tc++) {
			check=0;
			st=new StringTokenizer(br.readLine()," ");
			N=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			arr= new double[N];
			for(int i=0;i<N;i++) {
				st=new StringTokenizer(br.readLine()," ");
				mid=Integer.parseInt(st.nextToken());
				fin=Integer.parseInt(st.nextToken());
				hw=Integer.parseInt(st.nextToken());
				double point=mid*0.35+fin*0.45+hw*0.2;
				arr[i]=point;
			}
			for(int i=0;i<N;i++) {
				if(arr[K-1]<arr[i]) check++;
			}
			check=check*10/N;
			switch(check) {
			case 0:
				System.out.println("#"+tc+" A+");
				break;
			case 1:
				System.out.println("#"+tc+" A0");
				break;
			case 2:
				System.out.println("#"+tc+" A-");
				break;
			case 3:
				System.out.println("#"+tc+" B+");
				break;
			case 4:
				System.out.println("#"+tc+" B0");
				break;
			case 5:
				System.out.println("#"+tc+" B-");
				break;
			case 6:
				System.out.println("#"+tc+" C+");
				break;
			case 7:
				System.out.println("#"+tc+" C0");
				break;
			case 8:
				System.out.println("#"+tc+" C-");
				break;
			case 9:
				System.out.println("#"+tc+" D0");
				break;
			}
		}
	}
}
