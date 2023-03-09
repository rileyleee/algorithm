package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_4047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int[] S = new int[14];
			int[] D = new int[14];
			int[] H = new int[14];
			int[] C = new int[14];
			char type;
			int num = -1;
			boolean two = false;
			String cards = sc.next();
			outer: for (int c = 0; c < cards.length(); c += 3) {
				String eachCard = cards.substring(c, c + 3);
				type = eachCard.charAt(0);
				if (eachCard.charAt(1) == '0') {
					num = eachCard.charAt(2) - '0';
				} else {
					num = Integer.parseInt(eachCard.substring(1));
				}
				switch (type) {
				case 'S':
					if (S[num] != 0) {
						two = true;
						break outer;
					} else {
						S[num]++;
					}
					break;
				case 'D':
					if (D[num] != 0) {
						two = true;
						break outer;
					} else {
						D[num]++;
					}
					break;
				case 'H':
					if (H[num] != 0) {
						two = true;
						break outer;
					} else {
						H[num]++;
					}
					break;
				case 'C':
					if (C[num] != 0) {
						two = true;
						break outer;
					} else {
						C[num]++;
					}
					break;
				}
			}
			System.out.print("#" + t);
			if (two) {
				System.out.print(" " + "ERROR");
			} else {
				int cnt = -1;
				for (int s : S) {
					if (s == 0) {
						cnt++;
					}
				}
				System.out.print(" " + cnt);
				cnt = -1;
				for (int d : D) {
					if (d == 0) {
						cnt++;
					}
				}
				System.out.print(" " + cnt);
				cnt = -1;
				for (int h : H) {
					if (h == 0) {
						cnt++;
					}
				}
				System.out.print(" " + cnt);
				cnt = -1;
				for (int c : C) {
					if (c == 0) {
						cnt++;
					}
				}
				System.out.print(" " + cnt);
			}
		System.out.println();}
		sc.close();
	}
}