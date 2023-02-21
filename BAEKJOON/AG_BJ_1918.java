package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AG_BJ_1918 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		Stack<Character> stk = new Stack<>();
		StringBuilder sb = new StringBuilder();

		Map<Character, Integer> priority = new HashMap<>();
		priority.put('(', 0);
		priority.put(')', 1);
		priority.put('+', 2);
		priority.put('-', 2);
		priority.put('*', 3);
		priority.put('/', 3);

		for (char c : str.toCharArray()) {
			// 알파벳 대문자라면,
			if ((int) c >= 65 && (int) c <= 90) {
				sb.append(c);
			}
			// 여는 괄호라면
			else if (priority.get(c) == 0) {
				stk.push(c);
			}
			// 닫는 괄호라면
			else if (priority.get(c) == 1) {
				// 여는 괄호 만나기 직전까지 다 꺼내고
				while ((!stk.isEmpty()) && priority.get(stk.peek()) > priority.get('(')) {
					sb.append(stk.pop());
				}
				// 여는 괄호 버리기
				stk.pop();
			}

			// 부호라면,
			else {
				// 스택이 비어있다면
				if (stk.isEmpty()) {
					stk.push(c);
				} else { // 스택이 비어있지 않다면
					while ((!stk.isEmpty()) && (priority.get(stk.peek()) >= priority.get(c))) {
						sb.append(stk.pop());
					}
					stk.push(c);
				}
			}
		}
		while (!stk.isEmpty()) {
			sb.append(stk.pop());
		}
		System.out.println(sb.toString());
	}
}
