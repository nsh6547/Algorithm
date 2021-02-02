package day0202;

import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {
		int[] di = { 0, 1, 0, -1 };
		int[] dj = { 1, 0, -1, 0 };

		Scanner sc = new Scanner(System.in);

		int tcNum = sc.nextInt();

		for (int TC = 1; TC <= tcNum; TC++) {
			int x = 0, y = 0;
			int size = sc.nextInt();
			int[][] arr = new int[size][size];
			int num = 1;

			while (true) {
				while (true) {// right
					int j = y + dj[0];

					if (j < arr.length && (arr[x][j] == 0))
						arr[x][y] = num++;
					else
						break;
//					System.out.println(x + "," + y);
					y++;

				}
				while (true) {// down
					int i = x + di[1];
					if (i < arr.length && (arr[i][y] == 0))
						arr[x][y] = num++;
					else
						break;
//					System.out.println(x + "," + y);
					x++;
				}
				while (true) {// left
					int j = y + dj[2];

					if (j >= 0 && (arr[x][j] == 0))
						arr[x][y] = num++;
					else
						break;
//					System.out.println(x + "," + y);
					y--;
				}
				while (true) {// up
					int i = x + di[3];
					if (i >= 0 && (arr[i][y] == 0))
						arr[x][y] = num++;
					else
						break;
//					System.out.println(x + "," + y);
					x--;
				}

				if (num == (size * size))
					break;

			}
			System.out.println("#" + TC);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == 0)
						arr[i][j] = (size * size);
					System.out.print(arr[i][j] + " ");

				}
				System.out.println();
			}
		}

	}
}
