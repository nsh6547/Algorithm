package day0205;
public class Comb2 {
	static String[] source = {"A","B","C","D","E"};
	static boolean[] result = new boolean[source.length]; // 모든 원소에 대해 쓰고 안쓰고를 기록하게 됨.
	static int N = 5, R = 2;
	
	public static void main(String[] args) {
		comb2(0,0);
	}
	
	static void comb2(int cnt, int target) {
		if(cnt == R) {
			System.out.print("{");
			for(int i=0; i<source.length; i++) { // 모든 원소들에 대해
				if(result[i]) // 쓰는 선택을 한 원소들만
					System.out.print(source[i]+" ");
			}
			System.out.println("}");
			return;
		}
		if(target == N)
			return;
		
		result[target] = true;
		comb2(cnt+1,target+1);
		result[target] = false;
		comb2(cnt, target+1);
	}
}