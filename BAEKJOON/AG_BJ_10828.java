package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AG_BJ_10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cNum = Integer.parseInt(br.readLine());

		int[] arr = new int[cNum];
		int top = -1;

		for (int c = 0; c < cNum; c++) {

			String str = br.readLine();

			if (str.equals("top")) {
				if (top != -1) {
					System.out.println(arr[top]);
				} else {
					System.out.println(-1);
				}
			}

			else if (str.equals("size")) {
				System.out.println(top + 1);
			}

			else if (str.equals("empty")) {
				if (top == -1) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}

			else if (str.equals("pop")) {
				if (top != -1) {
					System.out.println(arr[top]);
					top--;
				} else {
					System.out.println(-1);
				}
			}

			else if (str.contains("push")) {
				StringTokenizer st = new StringTokenizer(str);
				String command = st.nextToken();
				int nNum = Integer.parseInt(st.nextToken());
				top++;
				arr[top] = nNum;
			}
		}
	}
}
