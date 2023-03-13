package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		int order = sc.nextInt();

		System.out.println(word.charAt(order - 1));

		sc.close();
	}
}