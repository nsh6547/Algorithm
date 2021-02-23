package day0218;
// 구현 실패 ㅜㅜ 어렵다.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class SWEA_1987_알파벳 {
	static int R,C;
	static char[][] arr;
	static boolean[][] used;
	
	static int[] di = {1,-1,0,0};
	static int[] dj = {0,0,-1,1};
	static int size =1;
	static int sizeMax=0; // 최대 칸수
	static ArrayList<Character> check =new ArrayList<>();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		R= Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr=new char[R][C];
		used=new boolean[R][C];
		
		for(int i =0; i<R; i++) {
			String s =br.readLine();
			for(int j=0; j<C;j++) {
				arr[i][j]=s.charAt(j);
			}
		}
		searchmap(0,0);
		System.out.println(size);
	}
	
	
	
	static void searchmap(int i, int j) {
		
		int checker=0; //지나온 칸이 있나 확인하는 카운터
		
		check.add(arr[i][j]);
		used[i][j]=true;
		sizeMax++;
//		System.out.println(check.size());
		for(int d=0;d<4;d++) {
			int dx = i+di[d];
			int dy = j+dj[d];
			
			if(dx<0||dx>=R||dy<0||dy>=C||used[dx][dy])continue;
			System.out.println(dx+","+dy);
			for(int x=0,m=check.size();x<m;x++) {
				if(check.get(x)!=arr[dx][dy])checker++;
			}
			if(checker==check.size()) {
				searchmap(dx,dy);
				
			}else {
//				System.out.println("dfdfd");
				check =new ArrayList<>();
//				sizeMax=0;
				return;
			}
			
				
		}
		used[i][j]=false;
		searchmap(dx,dy);
		if(sizeMax>size)size=sizeMax;
		
		
	}
}
