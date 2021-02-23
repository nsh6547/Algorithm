package day0223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_2477_참외밭 {
	static int K;// 참외의 갯수 (1<=K<=20)
	static int direction, nlength;
	static int x, y;
	static int cnt;
	static boolean[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new boolean[1500][1500];
		x = 750;
		y = 750;
		K = Integer.parseInt(br.readLine());
		for (int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			direction = Integer.parseInt(st.nextToken());
			nlength = Integer.parseInt(st.nextToken());
			switch (direction) {
			case 1:
				for (int j = 0; j < nlength; j++) {
					map[x][y++] = true;
				}
				break;
			case 2:
				for (int j = 0; j < nlength; j++) {
					map[x][y--] = true;
				}
				break;
			case 3:
				for (int j = 0; j < nlength; j++) {
					map[x++][y] = true;
				}
				break;
			case 4:
				for (int j = 0; j < nlength; j++) {
					map[x--][y] = true;
				}
				break;
			default:
				break;
			}
		}
		for (int i = 0; i < 1500; i++) {
			for (int j = 0; j < 1500; j++) {
				if (map[i][j] == true ) {
					while(true) {
					if(i>=1 && map[i-1][j]==true)
						map[i][j++]=true;
					else {
						break;
					}
					}
				}

			}
		}
		for (int i = 0; i < 1500; i++) {
			for (int j = 0; j < 1500; j++) {
//				System.out.print(map[i][j]+" ");
				if (map[i][j] == true) {
					cnt++;
				}
			}System.out.println();
		}
		System.out.println(cnt);

	}

}
