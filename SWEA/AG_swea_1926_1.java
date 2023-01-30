package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1926_1 { // 31에서 -1로 출력 실수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nArr = new int[n];

		for (int i = n - (n - 1); i < (n + 1); i++) {
			nArr[i - 1] = i;
			String sNum = String.valueOf(nArr[i - 1]);
			if (sNum.contains("3") || sNum.contains("6") || sNum.contains("9")) {
				for (int j = 0; j < sNum.length(); j++) {
					char cNum = sNum.charAt(j);
					if (cNum == '3' | cNum == '6' | cNum == '9') {
						cNum = '-';
						System.out.print(cNum);
					} else {
						System.out.print(cNum);
					}
				}
				System.out.print(" ");
			} else {
				System.out.print(sNum);
				System.out.print(" ");
			}
		}
		sc.close();
	}
}