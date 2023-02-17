package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();

		int[] aInt = new int[3];
		int[] bInt = new int[3];

		// 정수배열로 담을게^^ 화나게 하네 진짜
		for (int i = 0; i < aArr.length; i++) {
			aInt[i] = aArr[i] - 48;
			bInt[i] = bArr[i] - 48;
		}

		// 숫자 구하기
		int da = Integer.parseInt(a.substring(2) + a.substring(1, 2) + a.substring(0, 1));
		int db = Integer.parseInt(b.substring(2) + b.substring(1, 2) + b.substring(0, 1));

		if (aInt[2] > bInt[2]) {
			System.out.println(da);
		} else {
			System.out.println(db);
		}
		sc.close();
	}
}
//왜 틀린거죠 왜죠 왜!!!!!!