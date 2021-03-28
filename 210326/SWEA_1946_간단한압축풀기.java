import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1946_간단한압축풀기 {
	static int T,N;
	static char[][] arr;
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T= Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			N= Integer.parseInt(br.readLine());
			arr=new char[15][10];
			int row=0,cnt=0;
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				char first=st.nextToken().charAt(0);
				int second=Integer.parseInt(st.nextToken());
				for(int j=0;j<second;j++) {
					if(cnt==10) {
						row++;
						cnt=0;
					}
					arr[row][cnt]=first;
//					System.out.println(arr[row][cnt]);
//					System.out.println(row+" :"+cnt);
					cnt++;
				}
				
			}
			System.out.println("#"+tc);
			for(int i=0;i<=row;i++) {
				for(int j=0;j<10;j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
