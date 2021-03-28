package day0317;

import java.util.Scanner;

public class BaekJoon_14889_스타트와링크 {
    private static int[][] map;
    private static boolean[] isVisited;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        map = new int[size][size];
        isVisited = new boolean[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        dfs(0, 0);
        System.out.println(min);
    }

    private static void dfs(int index, int depth) {
        if (depth == map.length / 2) {
            int startTeam = 0;
            int linkTeam = 0;
            for (int i = 0; i < map.length - 1; i++) { 
                for (int j = i + 1; j < map.length; j++) {
                    if (isVisited[i] && isVisited[j]) {
                        startTeam += (map[i][j] + map[j][i]);
                    } else if (!isVisited[i] && !isVisited[j]) {
                        linkTeam += (map[i][j] + map[j][i]);
                    }
                }
            }
            min = Math.min(min, Math.abs(startTeam - linkTeam));
            return;
        }
        for (int i = index; i < map.length; i++) { 
            if (!isVisited[i]) {
                isVisited[i] = true;
                dfs(i + 1, depth + 1);
                isVisited[i] = false;
            }
        }

    }
}