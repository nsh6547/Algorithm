package day0202;

import java.util.Scanner;

public class Ladder {
	static final int tc = 10;

	public static void main(String[] args) {

		int[] dy = { -1, 1 };
		Scanner sc = new Scanner(System.in);
		for (int TC = 1; TC <= 10; TC++) {
			int tcNum = sc.nextInt();
			int[][] arr = new int[100][100];
			for (int x = 0; x < arr.length; x++) {
				for (int y = 0; y < arr[x].length; y++) {
					arr[x][y] = sc.nextInt();
				}
			}

			for (int y = 0; y < arr.length; y++) {
				if (arr[arr.length-1][y] == 2) {
					for (int x = arr.length-2; x >= 0; x--) {
						for (int d = 0; d < dy.length; d++) {
							int yi = y + dy[d];
							if (yi >= 0 && yi < arr.length && arr[x][yi] == 1) {
								while (true) {
									y += dy[d];
									
									if (y+dy[d]<0||y+dy[d]>=arr.length||arr[x][y +dy[d]] == 0 )
										break;
								}
								break;
							}
						}
						if (x == 0)System.out.println("#"+TC+" "+y);
					}
					
					break;
				}
			}

		}
	}
}
