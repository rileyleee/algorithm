package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AG_BJ_1181 {
	// 단어의 개수가 최대 20,000개 이기 때문에 2중 반복문 사용하면 4억개로 4초가 소요됨 -> 시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int wNum = Integer.parseInt(br.readLine());
		String[] words = new String[wNum];
		for (int i = 0; i < wNum; i++) {
			words[i] = br.readLine();
		}
		for (int j = 0; j < wNum - 1; j++) { //comparable로 변경
			for (int i = 0; i < wNum - 1; i++) {
				if (words[i].length() > words[i + 1].length()) {
					String temp = words[i];
					words[i] = words[i + 1];
					words[i + 1] = temp;

					// 길이가 같을 때는 사전 순 비교를 위해 compareTo 활용
				} else if (words[i].length() == words[i + 1].length()) {
					if (words[i].compareTo(words[i + 1]) > 0) {
						// 양수가 나온다는 건 전자가 후자보다 뒤에 위치한다는 뜻
						String temp = words[i]; // 따라서 순서를 바꿔준다.
						words[i] = words[i + 1];
						words[i + 1] = temp;
					}
				}
			}
		}
		// 중복되는 단어는 "0" 문자열로 변경하고
		for (int i = 0; i < wNum - 1; i++) {
			if (words[i].equals(words[i + 1])) {
				words[i + 1] = "0";
			}
		}
//		// "0"이 아닌 경우 출력 -> 시간초과
//		for (int i = 0; i < wNum; i++) {
//			if (words[i] != "0") {
//				System.out.println(words[i]);
//			}
//		}

		// "0"이 아닌 경우 출력
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < wNum; i++) {
			if (words[i] != "0") {
				sb.append(words[i]).append("\n");
			}
		}
		System.out.println(sb);
	}
}
