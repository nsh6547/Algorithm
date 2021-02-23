package day0222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_13300_방배정 {
	static int N, K; // 1<=N<=1000 학생 수 , 1<=K<=1000 한 방에 배정할 수 있는 최대 인원 수
	static int[][] arr;
	static int S,Y;// 성별, 학년
	static int room;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr= new int[6][2];
		for(int i=0;i<N;i++) {
			StringTokenizer stuInfo = new StringTokenizer(br.readLine()," ");
			S=Integer.parseInt(stuInfo.nextToken());
			Y=Integer.parseInt(stuInfo.nextToken());
			switch(Y) {
			case 1:
				if(S==0)
					arr[0][0]++;
				else
					arr[0][1]++;
				break;
			case 2:
				if(S==0)
					arr[1][0]++;
				else
					arr[1][1]++;
				break;
			case 3:
				if(S==0)
					arr[2][0]++;
				else
					arr[2][1]++;
				break;
			case 4:
				if(S==0)
					arr[3][0]++;
				else
					arr[3][1]++;
				break;
			case 5:
				if(S==0)
					arr[4][0]++;
				else
					arr[4][1]++;
				break;
			case 6:
				if(S==0)
					arr[5][0]++;
				else
					arr[5][1]++;
				break;
			}
			
			
		}
		for(int j=0; j<6;j++) {
			for(int k=0;k<2;k++) {
				if(arr[j][k]==0)continue;
				else if(arr[j][k]<=K)room++;
				else if(arr[j][k]>K) {
					room+=(arr[j][k]/K);
					if(arr[j][k]%K!=0)
						room++;
				}
			}
		}
		System.out.println(room);
	}
}
