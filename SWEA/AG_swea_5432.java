package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class AG_swea_5432 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		Stack<Character> stk = new Stack<>();

		for (int t = 0; t < test; t++) {
			stk.clear();
			int iron = 0;
			int finalIron = 0;
			char last = '0';

			String str = br.readLine();
			char[] strList = str.toCharArray();

			for (char c : strList) {
				if (stk.isEmpty()) {
					stk.push(c);
					last = c;
					iron++;
				} else {
					if (last == ('(')) { // 마지막 원소가 여는 괄호일 때
						if (c == ('(')) { // 입력값도 여는 괄호이면 스택에 넣고 쇠막대기 증가
							stk.push(c);
							last = c;
							iron++;
							// System.out.println("flag1");
							// System.out.println("iron: " + iron);
						} else { // 입력 값이 닫는 괄호이면 레이저 출력
							stk.pop();
							last = c;
							iron--; // 쇠막대기인 줄 알고 센 수 빼주기
							// System.out.println("laser");
							// System.out.println("iron: " + iron);
							finalIron += iron; // 잘라서 분리된 쇠막대기 세기
							// System.out.println("flag2");
							// System.out.println("finalIron: " + finalIron);
						}
					} else { // 마지막 원소가 닫는 괄호일 때
						if (c == ('(')) { // 입력 값이 여는 괄호이면 일단 스택에 담고
							stk.push(c);
							last = c;
							iron++;
							// System.out.println("flag3");
							// System.out.println("iron: " + iron);
						} else { // 입력 값이 닫는 괄호이면
							last = c;
							finalIron += 1;
							// System.out.println("finalIron: " + finalIron);
							iron--;
							// System.out.println("flag4");
							// System.out.println("iron: " + iron);
						}
					}
				}
			}
			System.out.println("#" + (t + 1) + " " + finalIron);
		}
	}
}