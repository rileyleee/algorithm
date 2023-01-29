package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_2019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n + 1; i++) {
			int multi = 1;
			for (int j = 1; j < i + 1; j++) {
				multi *= 2;
			}
			System.out.print(multi + " ");
		}
		sc.close();
	}
}
