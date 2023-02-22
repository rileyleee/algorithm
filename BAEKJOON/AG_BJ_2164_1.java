package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2164_1 { //정의민님 코드

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int alen = n;
		int cn = n;
		while (cn > 0) {
			if (cn == 1) {
				alen += cn;
				break;
			}
			if (cn % 2 == 0)
				cn /= 2;
			else {
				cn /= 2;
				cn++;
			}
			alen += cn;
		}

		int[] arr = new int[alen + 1];
		for (int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}
		int front = -1;
		int rear = n - 1;

		while (rear - front != 1) {
			front++;
			arr[n++] = arr[++front];
			rear++;
			if (rear - front == 1) {
				break;
			}
		}
		System.out.println(arr[rear]);
	}
}
