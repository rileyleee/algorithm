package SWEA;
import java.util.Scanner;

public class AG_swea_2071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] test = new int[10];

		for (int i = 1; i < t + 1; i++) {
			double total = 0;
			for (int j = 0; j < 10; j++) {
				test[j] = sc.nextInt();
				total += test[j];
			}

			System.out.println("#"+i+" "+(Math.round(total/test.length)));
		}
		sc.close();
	}
}
