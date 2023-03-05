package algorithm.SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AG_swea_15706_1 { // 큐 활용 완전탐색 아님 다른 테케는 틀림
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		outer: for (int t = 0; t < test; t++) {

			int N = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();

			int[] score = new int[N];

			int maxScore = -1;

			for (int s = 0; s < score.length; s++) {
				score[s] = sc.nextInt();
				if (maxScore < score[s]) {
					maxScore = score[s];
				}
			}

			int[] cntArr = new int[maxScore + 1];
			for (int c = 0; c < score.length; c++) {
				cntArr[score[c]]++;
			}

			Queue<Integer> qu = new LinkedList<>();

			for (int q = 0; q < cntArr.length; q++) {
				if (cntArr[q] != 0) {
					qu.offer(cntArr[q]);
				}
			}
			int last = 0;
			while (qu.size() > 3) {
				last += qu.poll();
				last += qu.poll();
				qu.offer(last);
			}

			int fmax = -1;
			int fmin = 100;
			for (int q : qu) {
				if (q < fmin)
					fmin = q;
				if (q > fmax)
					fmax = q;
				if (q < min || q > max) {
					System.out.println("#" + (t + 1) + " " + -1);
					continue outer;
				}
			}
			System.out.println("#" + (t + 1) + " " + (fmax - fmin));
		}
		sc.close();
	}
}