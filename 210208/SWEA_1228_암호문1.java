package day0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1228_암호문1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			String origin = br.readLine();
			StringBuilder  sb= new StringBuilder(origin); 
			sb.append(" ");
			
//			System.out.println("sb origin "+sb.toString());
			int commandCnt = Integer.parseInt(br.readLine());
			StringTokenizer com = new StringTokenizer(br.readLine(), "I");
			for (int i = 0; i < commandCnt; i++) {
				StringTokenizer com1 =new StringTokenizer(com.nextToken());
				int x = Integer.parseInt(com1.nextToken());
				int y = Integer.parseInt(com1.nextToken());
				StringBuilder sb2 =new StringBuilder();
				for(int j=0; j<y; j++) {
					sb2.append(com1.nextToken()+" ");
					
				}
				sb.insert(x*7, sb2);
//				System.out.println("x "+ x+" ");
//				System.out.println("y "+ y+" ");
				
			}
			int length = sb.length();
			sb.delete(69, length);
			sb.insert(0, "#"+tc+" ");
			System.out.println(sb.toString());

		}
	}
}
