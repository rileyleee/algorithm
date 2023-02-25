package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AG_BJ_1259 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while (flag) {
			String str = br.readLine();
			// 0이 들어오면 while문 빠져나가기
			if (str.equals("0")) {
				flag = false;
			} else {
				// char로 변환해서 담기
				char[] strArr = new char[str.length()];
				for (int i = 0; i < str.length(); i++) {
					strArr[i] = str.charAt(i);
				}
				// 팰린드롬 확인 논리형 자료형
				boolean pal = true;
				// 반절만 반복을 돌아서
				for (int i = 0; i < strArr.length / 2; i++) {
					// 양 끝의 값이 같으면 true
					if (strArr[i] == strArr[strArr.length - 1 - i]) {
						pal = true;
						// 다르면 false로 변경
					} else {
						pal = false;
						break;
					}
				}
				if (pal)
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
	}
}
