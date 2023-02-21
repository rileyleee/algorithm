package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AG_BJ_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int yDifh = h - y;
		int yDif0 = y;
		int xDiffw = w - x;
		int xDiff0 = x;

		int result = Math.min(Math.min(xDiffw, xDiff0), Math.min(yDif0, yDifh));

		System.out.println(result);
	}
}
