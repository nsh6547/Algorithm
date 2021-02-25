package day0225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SWEA_1767_프로세스연결 {
	static int N, max, totalCnt, min, map[][];
	static int dr[] = { -1, 1, 0, 0 };
	static int dc[] = { 0, 0, -1, 1 };
	static ArrayList<int[]> List; // 고려해야하는 코어만 담고 있는 리스트(가장자리 코어는 배제)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			List = new ArrayList<int[]>();
			max = 0;
			min = Integer.MAX_VALUE;
			totalCnt = 0;

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if (i == 0 || i == N - 1 || j == 0 || j == N - 1)
						continue;
					if (map[i][j] == 1) {
						List.add(new int[] { i, j });
						totalCnt++;
					}

				}
			}
		}
	}
	
	private static void go(int index, int cCnt) {
		
		if(index == totalCnt) {
			int res = getLength();
			
			if(max < cCnt) {
				max = cCnt;
				min = res;
			}else if(max == cCnt) {
				
			}
		}
		
		// 코어 선택 전선 놓아보기(4방향을 놓아보기)
		int[] cur = List.get(index);
		int r=  cur[0];
		int c= cur[1];
		
		for(int d = 0; d<4; d++) {
			if(isAvailable(r,c,d)) {
				//전선 놓기
				setStatus(r,c,d,2);
				//다음 코어로 넘어가기
				go(index+1,cCnt+1);
				// 놓았던 전선 되돌려 놓기
				setStatus(r,c,d,0);
			}
			
		}
		
		// 코어 비선택
		go(index+1, cCnt);
	}
	
	private static void setStatus(int r, int c, int d, int s) {
		int nr=r, nc=c;
		while(true) {
			nr += dr[d];
			nc += dc[d];
			if(nr<0 || nr>=N || nc<0 || nr>=N)break;
			map[nr][nc] =s;
		}
	}
	
	private static boolean isAvailable(int r, int c, int d) {
		int nr=r, nc=c;
		while(true) {
			nr+= dr[d];
			nc+= dc[d];
			if(nr<0 || nr>=N || nc<0 || nr>=N)break; // 계속해서 해당방향으로 직진을 해서 경계를 벗어남. : 전원연결 가능
			if(map[nr][nc]>=1)return false; // 코어나 전선이 놓아져있어 불가능.
		}
		return true;
		
		
	}
	
	private static int getLength() {
		int lCnt =0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==2) lCnt++;
			}
		}
		return lCnt;
	}
	
	
	
}
