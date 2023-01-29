package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_2019_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int two = sc.nextInt();
		System.out.print(result + " ");

		for (int i = 1; i < two + 1; i++) {
			result = result * 2;
			System.out.print(result + " ");
		}
		sc.close();
	}
}