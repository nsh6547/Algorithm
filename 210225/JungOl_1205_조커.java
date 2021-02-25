package day0225;

import java.util.Arrays;
import java.util.Scanner;

public class JungOl_1205_조커 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int jokerCnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] != 0)
                break;
            jokerCnt++;
        }

        int ans = (jokerCnt == N) ? N : 0;

        for(int i = jokerCnt; i < N; i++) {

            int lastNum = arr[i];

            int cnt = 1;
            int joker = jokerCnt;

            for(int j = i + 1; j < N; j++) {

                if(lastNum == arr[j])
                    continue;

                if( arr[j] == lastNum + 1 ) {
                    cnt++;
                    lastNum = arr[j];
                    continue;
                }

                if(joker == 0)
                    break;


                lastNum++;
                cnt++;
                joker--;
                j--;
            }
            ans = Math.max(ans, cnt + joker);

        }
        System.out.println(ans);
    }
}