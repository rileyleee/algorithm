package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AG_swea_1231_1 { // 중위 선회 예진님 코드
	static char[] tree;
	static int[] left;
	static int[] right;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1; i <= 10; i++) {
			int N = Integer.parseInt(br.readLine());

			tree = new char[N + 1];
			left = new int[N + 1];
			right = new int[N + 1];

			for (int j = 0; j < N; j++) {
				String[] input = br.readLine().split(" ");

				tree[Integer.parseInt(input[0])] = input[1].charAt(0);

				if (input.length >= 3) {
					left[Integer.parseInt(input[0])] += Integer.parseInt(input[2]);
				}
				if (input.length >= 4) {
					right[Integer.parseInt(input[0])] += Integer.parseInt(input[3]);
				}
			}
			System.out.print("#" + i + " ");
			mid(1);
			System.out.println();
			
			//System.out.println(Arrays.toString(tree));
			//System.out.println(Arrays.toString(left));
			//System.out.println(Arrays.toString(right));
		}
	}

	public static void mid(int num) {

		if (num < tree.length) {
			// L
			if (left[num] != 0) {
				mid(left[num]);
			}
			// V
			System.out.print(tree[num]);
			// R
			if (right[num] != 0) {
				mid(right[num]);
			}
		}
	}
}