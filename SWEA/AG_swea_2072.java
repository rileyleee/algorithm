package SWEA;
import java.util.Scanner;

public class AG_swea_2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int test[] = new int[10];

		int c = test.length;

		for (int j = 1; j < t + 1; j++) {
			int total = 0;

			for (int i = 0; i < c; i++) {
				test[i] = sc.nextInt();

				if (test[i] % 2 != 0) {
					total = total + test[i];
				}
			}
			System.out.println("#" + j + " " + total);
		}
		sc.close();
	}
}
