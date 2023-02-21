package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class AG_swea_1224 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 0; t < 10; t++) {
			String length = br.readLine();
			String str = br.readLine();

			Stack<Character> stack = new Stack<>();
			StringBuilder sb = new StringBuilder();
			// 후위표기로 변환
			for (char c : str.toCharArray()) {
				if (c == '*') {
					if (stack.isEmpty()) {
						stack.push(c);
					} else {
						// 스택의 맨 위가 곱셈이 아닐 때까지 꺼낸다.
						while ((!stack.isEmpty()) && stack.peek() == '*') {
							sb.append(stack.pop());
						}
						stack.push(c);
					}

				} else if (c == '+') {
					if (stack.isEmpty()) {
						stack.push(c);
					} else {
						// 스택의 맨 위가 곱셈이 아닐 때까지 꺼낸다.
						while ((!stack.isEmpty()) && (stack.peek() == '*' || stack.peek() == '+')) {
							sb.append(stack.pop());
						}
						stack.push(c);
					}

				} else if (c == '(') {
					stack.push(c);

				} else if (c == ')') {
					while (stack.peek() != '(') {
						sb.append(stack.pop());
					}
					stack.pop();
				} else {
					sb.append(c);
				}
			}
			while (!stack.isEmpty()) {
				sb.append(stack.pop());
			}

			// 변환 후 연산
			String cal = sb.toString();

			Stack<Integer> iStack = new Stack<>();

			for (char i : cal.toCharArray()) {

				if (i == '+') {
					if (!iStack.isEmpty()) {
						int rt = iStack.peek();

						iStack.pop();
						int lt = iStack.peek();

						iStack.pop();
						int result = lt + rt;
						iStack.push(result);
					}
				} else if (i == '*') {
					if (!iStack.isEmpty()) {
						int rt = iStack.peek();

						iStack.pop();
						int lt = iStack.peek();

						iStack.pop();
						int result = lt * rt;
						iStack.push(result);
					}
				} else {
					iStack.push(i - '0');
				}
			}
			System.out.println("#" + (t + 1) + " " + iStack.get(0));
		}
	}
}