package day0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1974_스도쿠검증 {
	static int T;
	static int[][] arr;
	static boolean[] check;
	static boolean ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		for(int tc=1; tc<=T;tc++) {
			arr=new int[9][9];
			
			for(int i=0;i<9;i++) {
				st= new StringTokenizer(br.readLine()," ");
				for(int j=0;j<9;j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			ans=true;
			for(int i=0;i<9;i++) {
				check=new boolean[10];
				for(int j=0;j<9;j++) {
					if(!check[arr[i][j]])
						check[arr[i][j]]=true;
				}
				for(int j=1;j<10;j++) {
					if(!check[j]) {
						ans=false;
						break;
						}
				}
				if(ans==false)break;
			}
			if(!ans) {
				System.out.println("#"+tc+" "+0);
				continue;
			}
			
			for(int i=0;i<9;i++) {
				check=new boolean[10];
				for(int j=0;j<9;j++) {
					if(!check[arr[j][i]])
						check[arr[j][i]]=true;
				}
				for(int j=1;j<10;j++) {
					if(!check[j]) {
						ans=false;
						break;
						}
				}
				if(ans==false)break;
			}
			
			if(!ans) {
				System.out.println("#"+tc+" "+0);
				continue;
			}
			//0,0 |0,3|0,6
			//3,0 |3,3|3,6
			//6,0 |6,3|6,6
			
			for(int i=0;i<7;i+=3) {
				for(int j=0;j<7;j+=3) {
					check=new boolean[10];
					for(int k=i;k<i+3;k++) {
						for(int l=j;l<j+3;l++) {
							if(!check[arr[k][l]])
								check[arr[k][l]]=true;
						}
					}
					for(int k=1;k<10;k++) {
						if(!check[k]) {
							ans=false;
							break;
							}
					}
					if(ans==false)break;
					
				}
			}
			
			
			if(!ans)
				System.out.println("#"+tc+" "+0);
			else
				System.out.println("#"+tc+" "+1);
			
		}
	}
}
