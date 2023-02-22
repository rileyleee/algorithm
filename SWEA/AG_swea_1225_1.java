package algorithm.SWEA;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AG_swea_1225_1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> qu = new LinkedList<>();

		for (int t = 0; t < 10; t++) {
			int testNum = sc.nextInt();
			qu.clear();

			for (int num = 0; num < 8; num++) {
				qu.offer(sc.nextInt());
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
		sc.close();
	}
}