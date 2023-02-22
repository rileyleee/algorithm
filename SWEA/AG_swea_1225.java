package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class AG_swea_1225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 0; t < 10; t++) {
			Queue<Integer> qu = new LinkedList<>();
			int testNum = Integer.parseInt(br.readLine());
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for (int num = 0; num < 8; num++) {
				qu.offer(Integer.parseInt(st.nextToken()));
			}

			int last = 1;
			while (last > 0) {
				for (int m = 1; m <= 5; m++) {
					last = qu.peek() - m;
					if (last > 0) {
						qu.poll();
						qu.offer(last);

					} else if (last <= 0) {
						last = 0;
						qu.poll();
						qu.offer(last);
						break;
					}
				}
			}
			System.out.print("#" + testNum + " ");
			for (int q = 0; q < 8; q++) {
				System.out.print(qu.poll() + " ");
			}
			System.out.println();
		}
	}
}