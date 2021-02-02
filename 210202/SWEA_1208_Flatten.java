package day0202;

import java.util.Scanner;

public class Flatten {

	static final int tc = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int TC = 0; TC < tc; TC++) {
			int[] boxArr = new int[100];
			int maxHeight= Integer.MIN_VALUE;
			int minHeight= Integer.MAX_VALUE;
			int gap =0;
			int dump = sc.nextInt();
			
			for(int i =0; i<boxArr.length; i++) {
				int height = sc.nextInt();
				boxArr[i] =height;
				if(height <minHeight)minHeight=height; //배열에 상자 정보 저장하면서 최대최소 높이를 저장
				if(height >maxHeight)maxHeight=height; 
			}
			int count=0;
			while(count<dump) { //덤프 횟수만큼 반복
				count++;
				for(int i=0 ; i<boxArr.length; i++) { 
					if(boxArr[i]==minHeight) { // 최소값 찾아서 +1 하고 종료 동일한 최소값이 배열중에 있을 수 있으므로
						boxArr[i]+=1;
						minHeight+=1;
						break;
					}
				}
				for(int i=0 ; i<boxArr.length; i++) { //최대값 찾아서 -1 하고 종료 동일한 최대값이 배열중에 있을 수 있으므로 
					if(boxArr[i]==maxHeight) {
						boxArr[i]-=1;
						maxHeight-=1;
						break;
					}
				}
				for(int i=0 ; i<boxArr.length; i++) {  
					if(boxArr[i] <minHeight)minHeight=boxArr[i];
				}
				for(int i=0 ; i<boxArr.length; i++) {
					if(boxArr[i] >maxHeight)maxHeight=boxArr[i];
				}
				
			}
			System.out.println("#"+(TC+1)+" "+(maxHeight-minHeight));
			
		}
	}
}
