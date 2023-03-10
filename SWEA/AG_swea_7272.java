package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_7272 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			char[] one = sc.next().toCharArray();
			char[] two = sc.next().toCharArray();

			StringBuilder sb = new StringBuilder();
			for (int o = 0; o < one.length; o++) {

				switch (one[o]) {
				case 'B':
					sb.append(2);
					break;
				case 'A':
				case 'D':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
					sb.append(1);
					break;
				default:
					sb.append(0);
				}
			}
			String oneS = sb.toString();

			sb = new StringBuilder();
			for (int tw = 0; tw < two.length; tw++) {

				switch (two[tw]) {
				case 'B':
					sb.append(2);
					break;
				case 'A':
				case 'D':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
					sb.append(1);
					break;
				default:
					sb.append(0);
				}
			}
			String twoS = sb.toString();

			if (oneS.equals(twoS)) {
				System.out.println("#" + t + " " + "SAME");
			} else {
				System.out.println("#" + t + " " + "DIFF");

			}
		}

		sc.close();

	}

}
