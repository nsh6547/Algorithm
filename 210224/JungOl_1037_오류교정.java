package day0224;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JungOl_1037_오류교정 {
	static int N;
	static boolean[][] arr;
	static int[] row, col;
	static int check;
	static int cnt ;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new boolean[N][N];
		row = new int[N];
		col = new int[N];
		char a;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < N; j++) {
				a =st.nextToken().charAt(0);
				if ( a== '1') {
					arr[i][j] = true;
					
				} else 
					arr[i][j] = false;
//				System.out.println(arr[i][j]);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j])
					row[i]++;
				if (arr[j][i])
					col[i]++;
			}
		}
		check = 0;
//		System.out.println(row.toString());
		
//		for(int i=0; i<N;i++) {
//			System.out.println(row[i]);
//			System.out.println(col[i]);}
		for (int i = 0; i < N; i++) {
			if (col[i] % 2 != 0) {
//				System.out.println("d");
				check++;}
			if (row[i] % 2 != 0) {
//				System.out.println("d");
				check++;}
		}
		if (check == 0)
			System.out.println("OK");
		else {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					 cnt = 0;
					arr[i][j] = (!arr[i][j]);
					row = new int[N];
					col = new int[N];
					
					for (int k = 0; k < N; k++) {
						for (int l = 0; l < N; l++) {
							if (arr[k][l])
								row[k]++;
							if (arr[l][k])
								col[k]++;
						}
					}
					check = 0;
					
					for (int k = 0; k < row.length; k++) {
						if (col[k] % 2 != 0)
							check++;
						if (row[k] % 2 != 0)
							check++;
					}
					
					if(check==0) {
						System.out.println("Change bit ("+(i+1)+","+(j+1)+")");
						cnt++;
						break;
					}
					arr[i][j] = (!arr[i][j]);

				}
				if(cnt==1)break;
				
			}
			if(cnt!=1)System.out.println("Corrupt");
		}
		
		
	}
}
