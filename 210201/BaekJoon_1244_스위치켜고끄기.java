package day0201;

import java.util.Scanner;

public class hwalgo01_대전_5반_노선호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int switchNum = sc.nextInt();
		boolean[] arr = new boolean[switchNum];
		for (int i = 0; i < arr.length; i++) {
			int temp = sc.nextInt();
			if (temp == 1) {
				arr[i] = true;
			} else {
				arr[i] = false;
			}
		}

		int stuNum = sc.nextInt();
		int[][] stuInfo = new int[stuNum][2];
		for (int i = 0; i < stuInfo.length; i++) {
			for (int j = 0; j < stuInfo[i].length; j++) {
				stuInfo[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < stuInfo.length; i++) {
			if (stuInfo[i][0] == 1) {
				for (int j = 0; j < arr.length; j++) {
					if ((j + 1) % stuInfo[i][1] == 0) {
						arr[j] = (!arr[j]);
					}
				}

			} else {

				arr[stuInfo[i][1] - 1] = !(arr[stuInfo[i][1] - 1]);

				int left = stuInfo[i][1] - 2;
				int right = stuInfo[i][1];
			

				while (left >= 0 && (right <= switchNum - 1) && (arr[left] == arr[right])) {
					arr[left] = (!arr[left]);
					arr[right] = (!arr[right]);
					left--;
					right++;

				}

			}

		}
		int cnt=1;
		for (int i = 0; i < arr.length; i++) {
			
			
			if (arr[i] == true) 
				System.out.print(1);
			else
				System.out.print(0);
			if(cnt<arr.length) {
			System.out.print(" ");}
			
			if(cnt%20 ==0) {
				System.out.println();
			}
			cnt++;
			
		

	}
	

}}

