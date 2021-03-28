package day0314;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon_9375_패션왕신해빈 {
	static int tc,clo_num,answer;
	static HashMap<String,Integer> map;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tc=Integer.parseInt(br.readLine());
		for(int T=1;T<=tc;T++) {
			answer=1;
			map=new HashMap<>();
			clo_num=Integer.parseInt(br.readLine());
			for(int i=0; i<clo_num;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				String value=st.nextToken();
				String key=st.nextToken();
				if(map.containsKey(key)) {
				map.put(key,map.get(key)+1);
				}else {
					map.put(key, 2);
				}
			}
			for(String key : map.keySet()){
	            answer *= map.get(key);
	        }
			System.out.println(answer-1);
		}
	}
}
