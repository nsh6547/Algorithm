package day0204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호짝짓기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			int answer = 0;
			Stack<Character> stack = new Stack<>();
			int n = Integer.parseInt(br.readLine());
				String chars = br.readLine();
				for (int j = 0; j < n; j++) {
					char ch = chars.charAt(j);
					switch (ch) {
					case ')':
						if (stack.peek() == '(') {
							stack.pop();
						}else
							stack.push(ch);
						break;
					case ']':
						if (stack.peek() == '[') {
							stack.pop();
						}else
							stack.push(ch);
						break;
					case '}':
						if (stack.peek() == '{') {
							stack.pop();
						}else
							stack.push(ch);
						break;
					case '>':
						if (stack.peek() == '<') {
							stack.pop();
						}else
							stack.push(ch);
						break;
					default:
						stack.push(ch);
						break;
				}
					
			}if(stack.isEmpty())answer=1;
			System.out.println("#"+tc+" "+answer);
		}
	}
}
