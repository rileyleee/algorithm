package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1946 { //30분 소요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int num = sc.nextInt();
			StringBuilder sb = new StringBuilder();

			for (int n = 1; n <= num; n++) {
				char letter = sc.next().charAt(0);
				int count = sc.nextInt();
				for (int c = 0; c < count; c++) {
					sb.append(letter);
				}
			}
			String str = sb.toString();
			char[] doc = str.toCharArray();

			int cnt = 0;
			System.out.println("#" + t );
			for (int d = 0; d < doc.length; d++) {
				System.out.print(doc[d]);
				cnt++;
				if (cnt % 10 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}
		sc.close();
	}
}