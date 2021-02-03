package day0203;

import java.io.IOException;
import java.util.Scanner;

public class Battle {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] di = { -1, 1, 0, 0 };
		int[] dj = { 0, 0, -1, 1 };
		int tc = sc.nextInt();
		for (int TC = 1; TC <= tc; TC++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			char[][] map = new char[H][W];
			int tank_x = 0, tank_y = 0;
			for (int h = 0; h < H; h++) {
				String st = sc.next();
				for (int w = 0; w < W; w++) {
					map[h][w] = st.charAt(w);
					if (map[h][w] == '^' || map[h][w] == 'v' || map[h][w] == '<' || map[h][w] == '>') {
						tank_x = h;
						tank_y = w;
					}
//					System.out.println("start x:"+tank_x+","+tank_y);
				}
			}
			int N = sc.nextInt();
			String st11=sc.next();
			for (int n = 0; n < N; n++) {
				 char st1=st11.charAt(n);
				if (st1 == 'U') {
					map[tank_x][tank_y] = '^';
					if ((tank_x + di[0]) >= 0 && map[tank_x + di[0]][tank_y + dj[0]] == '.') {
						map[tank_x][tank_y] = '.';
						tank_x += di[0];
						tank_y += dj[0];
						map[tank_x][tank_y] = '^';
					}
				} else if (st1 == 'D') {
					map[tank_x][tank_y] = 'v';
					if ((tank_x + di[1]) < map.length && map[tank_x + di[1]][tank_y + dj[1]] == '.') {
						map[tank_x][tank_y] = '.';
						tank_x += di[1];
						tank_y += dj[1];
						map[tank_x][tank_y] = 'v';
					}
				} else if (st1 == 'L') {
					map[tank_x][tank_y] = '<';
					if ((tank_y + dj[2]) >= 0 && map[tank_x + di[2]][tank_y + dj[2]] == '.') {
						map[tank_x][tank_y] = '.';
						tank_x += di[2];
						tank_y += dj[2];
						map[tank_x][tank_y] = '<';
					}

				} else if (st1 == 'R') {
					map[tank_x][tank_y] = '>';
					if ((tank_y + dj[3]) < map[0].length && map[tank_x + di[3]][tank_y + dj[3]] == '.') {
						map[tank_x][tank_y] = '.';
						tank_x += di[3];
						tank_y += dj[3];
						map[tank_x][tank_y] = '>';
					}
				} else if (st1 == 'S') {
					if (map[tank_x][tank_y] == '^') {
						for (int x = tank_x - 1; x >= 0; x--) {
							if (map[x][tank_y] == '*') {
								map[x][tank_y] = '.';
								break;
							} else if (map[x][tank_y] == '#') {
								break;
							}
						}
					} else if (map[tank_x][tank_y] == 'v') {
						for (int x = tank_x + 1; x < map.length; x++) {
							if (map[x][tank_y] == '*') {
								map[x][tank_y] = '.';
								break;
							} else if (map[x][tank_y] == '#') {
								break;
							}
						}

					} else if (map[tank_x][tank_y] == '<') {
						for (int y = tank_y - 1; y >= 0; y--) {
							if (map[tank_x][y] == '*') {
								map[tank_x][y] = '.';
								break;
							} else if (map[tank_x][y] == '#') {
								break;
							}
						}

					} else if (map[tank_x][tank_y] == '>') {
						for (int y = tank_y + 1; y < map[tank_x].length; y++) {
							if (map[tank_x][y] == '*') {
								map[tank_x][y] = '.';
								break;
							} else if (map[tank_x][y] == '#') {
								break;
							}
						}

					}
				}
//				System.out.println("Attack:"+st1+" "+tank_x+","+tank_y+":"+map[tank_x][tank_y]);

			}
			System.out.print("#"+TC+" ");
			for(int i=0; i<map.length;i++) {
				for(int j=0 ; j<map[i].length;j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}

		}
	}
}
