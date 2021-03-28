package day0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2056_연월일달력 {
	static int[] arr;
	static int T,month,day,check;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		arr=new int[8];
		for(int tc=1;tc<=T;tc++) {
			check=0;
			String st= br.readLine();
			month=Integer.parseInt(st.substring(4, 6));
			day=Integer.parseInt(st.substring(6,8));
			if(1>month||month>12)
				System.out.println("#"+tc+" -1");
			else {
				switch(month) {
				case 1:
					if(1>day||day>31)
						check=1;
					break;
				case 2:
					if(1>day||day>28)
						check=1;
					break;
				case 3:
					if(1>day||day>31)
						check=1;
					break;
				case 4:
					if(1>day||day>30)
						check=1;
					break;
				case 5:
					if(1>day||day>31)
						check=1;
					break;
				case 6:
					if(1>day||day>30)
						check=1;
					break;
				case 7:
					if(1>day||day>31)
						check=1;
					break;
				case 8:
					if(1>day||day>31)
						check=1;
					break;
				case 9:
					if(1>day||day>30)
						check=1;
					break;
				case 10:
					if(1>day||day>31)
						check=1;
					break;
				case 11:
					if(1>day||day>30)
						check=1;
					break;
				case 12:
					if(1>day||day>31)
						check=1;
					break;
				}
				if(check==1)
					System.out.println("#"+tc+" -1");
				else {
					System.out.println("#"+tc+" "+st.substring(0,4)+"/"+st.substring(4,6)+"/"+st.substring(6,8));
				}
			}
		}
	}
}
