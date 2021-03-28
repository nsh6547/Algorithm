package day0226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_14696_딱지놀이 {
	static int N;// 1<=N<=1000;
	static int A, B;
	static int aNum, bNum;
	static StringBuilder sb;
	static int astar,acircle,asquare,atriangle;
	static int bstar,bcircle,bsquare,btriangle;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			sb=new StringBuilder();
			astar=0;acircle=0;asquare=0;atriangle=0;
			bstar=0;bcircle=0;bsquare=0;btriangle=0;
			StringTokenizer a = new StringTokenizer(br.readLine(), " ");
			aNum = Integer.parseInt(a.nextToken());
			
			for (int an = 0; an < aNum; an++) {
				A = Integer.parseInt(a.nextToken());
				if(A==4)
					astar++;
				else if(A==3)
					acircle++;
				else if(A==2)
					asquare++;
				else if(A==1)
					atriangle++;
			}
			
			StringTokenizer b = new StringTokenizer(br.readLine(), " ");
			bNum = Integer.parseInt(b.nextToken());
			for (int bn = 0; bn < bNum; bn++) {
				B = Integer.parseInt(b.nextToken());
				if(B==4)
					bstar++;				
				else if(B==3)
					bcircle++;
				else if(B==2)
					bsquare++;
				else if(B==1)
					btriangle++;
			}
			
			if(astar>bstar)
				sb.append("A");
			else if(bstar>astar)
				sb.append("B");
			else if(astar==bstar&& acircle>bcircle)
				sb.append("A");
			else if(astar==bstar&& acircle<bcircle)
				sb.append("B");
			else if(astar==bstar&& acircle==bcircle && asquare>bsquare)
				sb.append("A");
			else if(astar==bstar&& acircle==bcircle && asquare<bsquare)
				sb.append("B");
			else if(astar==bstar&& acircle==bcircle && asquare==bsquare&&atriangle>btriangle)
				sb.append("A");
			else if(astar==bstar&& acircle==bcircle && asquare==bsquare&&atriangle<btriangle)
				sb.append("B");
			else if((astar==bstar&& acircle==bcircle && asquare==bsquare&&atriangle==btriangle))
				sb.append("D");
//			sb.setLength(sb.length()-1);
			if(i==N-1)
				System.out.print(sb.toString());
			else
				System.out.println(sb.toString());
		}
	}
}
