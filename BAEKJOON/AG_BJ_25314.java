package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt() / 4;

		for (int a = 0; a < num; a++) {
			System.out.print("long" + " ");
		}
		System.out.print("int");
		sc.close();
	}
}
