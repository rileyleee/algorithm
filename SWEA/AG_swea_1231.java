package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1231 { // 중위순회
	static char[] words;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			int nNum = sc.nextInt();
			words = new char[nNum * 2];

			for (int n = 0; n < nNum; n++) {
				int node = sc.nextInt();
				char text = sc.nextLine().charAt(1);
				words[node] = text;
			}
			System.out.print("#" + t + " ");
			traverse(1);
			System.out.println();
		}
		sc.close();
	}

	private static void traverse(int i) {
		if (i <= words.length - 1) {

			traverse(2 * i); // 왼쪽 자식 출력
			if (words[i] != '\u0000') { // 자기 자신 출력
				System.out.print(words[i]);
			}
			traverse(2 * i + 1); // 오른쪽 자식 출력
		}
	}
}