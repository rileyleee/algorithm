package SWEA;

import java.util.Scanner;

public class AG_swea_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int num = sc.nextInt();

			int[] numarr = new int[num];
			for (int j = 0; j < num; j++) {
				numarr[j] = sc.nextInt();
			}
			
			
			for (int k = 0; k < num; k++) {
				for (int j = (num - 1); j > 0; j--) {
					if (numarr[j] < numarr[j - 1]) {
						int a = numarr[j];
						int b = numarr[j - 1];
						numarr[j - 1] = a;
						numarr[j] = b;
					}
				}
			}
			
			
			System.out.print("#" + (i + 1) + " ");
			for (int j = 0; j < num; j++) {
				System.out.print(numarr[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
