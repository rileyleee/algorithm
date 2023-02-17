package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AG_BJ_1439_3 {

	static String str;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();
		int totalBunch = 1; // 전체 묶음 개수
		boolean oneSideChk = true; // 처음으로 달라진수 묶음 체크
		int oneSideNum = 0; // 처음으로 달라진 수 묶음 개수
		String str_f = str.substring(0, 1);
		for (int i = 1; i < str.length(); i++) {
			String str_s = str.substring(i, i + 1);
			if (!str_f.equals(str_s)) {
				totalBunch++;
				if (oneSideChk) {
					oneSideNum++;
				}
				oneSideChk = !oneSideChk;
			}
			str_f = str_s;
		}

		if (totalBunch == 1) {
			System.out.println(0);
		} else {
			System.out.println(Math.min(oneSideNum, totalBunch - oneSideNum));
		}
	}
}
