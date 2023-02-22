package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class AG_swea_3499 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		for (int t = 0; t < test; t++) {
			Queue<String> qu1 = new LinkedList<>();
			Queue<String> qu2 = new LinkedList<>();
			Queue<String> finalQu = new LinkedList<>();

			int num = Integer.parseInt(br.readLine());

			int limit = 0;

			if (num % 2 == 0) {
				limit = num / 2;
			} else {
				limit = num / 2 + 1;
			}

			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			for (int s = 0; s < limit; s++) {
				qu1.offer(st.nextToken());
			}
			for (int s = 0; s < num - limit; s++) {
				qu2.offer(st.nextToken());
			}

			for (int s = 0; s < limit; s++) {
				finalQu.offer(qu1.poll());
				if (!qu2.isEmpty()) {
					finalQu.offer(qu2.poll());
				}
			}
			System.out.print("#" + (t + 1) + " ");
			for (int i = 0; i < num; i++) {
				System.out.print(finalQu.poll()+ " ");
			}
			System.out.println();
		}
	}
}