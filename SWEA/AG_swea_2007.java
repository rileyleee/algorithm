package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AG_swea_2007 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		for (int t = 0; t < test; t++) {

			char[] pattern = new char[30];
			String str = br.readLine();

			StringBuilder sb = new StringBuilder(str).reverse();
			for (int s = 0; s < sb.length(); s++) {
				pattern[s] = sb.charAt(s);
			}
			char start = pattern[0];
			int cnt = 0;
			int num = 0;
			for (int i = 1; i < 11; i++) {
				if (pattern[i] == start) {
					num = i;
					cnt++;
				}
			}
			if (cnt >= 2) {
				// System.out.println("#" + " " + (num / cnt));
				System.out.println("#" + (t + 1) + " " + (num / cnt));

			} else {
				// System.out.println("#" + " " + num);
				System.out.println("#" + (t + 1) + " " + num);
			}
		}
	}
}
