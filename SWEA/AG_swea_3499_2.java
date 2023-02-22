package algorithm.SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AG_swea_3499_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			int size = sc.nextInt();

			String[] arr = new String[size];

			Queue<String> q = new LinkedList<String>();

			for (int j = 0; j < size; j++) {
				arr[j] = sc.next();
			}

			for (int j = 0; j < size / 2; j++) {
				if (size % 2 == 0) {
					q.add(arr[j]);
					q.add(arr[(size / 2) + j]);
				}
				if (size % 2 == 1) {
					q.add(arr[j]);
					q.add(arr[(size / 2) + j + 1]);
				}
			}
			if (size % 2 == 1) {
				q.add(arr[size / 2]);
			}

			System.out.print("#" + i + " ");
			for (int j = 0; j < size; j++) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();
		}
	}
}
