package day0201;

import java.util.Scanner;

public class SW_Expert_1289_원재의메모리복구하기 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int TC = sc.nextInt();
	int TCnt = 0;
	for (int tc =1; tc<=TC; tc++) {
		int cnt=0;
		TCnt++;
		String bit=sc.next();
		if(bit.charAt(0)=='1')cnt++;
		for (int i=0 ; i<bit.length()-1;i++) {
			if(bit.charAt(i)==bit.charAt(i+1)) {
				continue;
			}else {
				cnt++;
			}
		}
		System.out.println("#"+TCnt+" "+cnt);
		
	}
	

}
}
