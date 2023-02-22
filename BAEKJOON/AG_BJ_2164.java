package algorithm.BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AG_BJ_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		Queue<Integer> qu = new LinkedList<Integer>();

		for (int n = 1; n <= num; n++) {
			qu.offer(n);
		}

		while (qu.size() > 1) {
			qu.poll();
			qu.offer(qu.poll());
		}
		System.out.println(qu.poll());
		sc.close();
	}
}