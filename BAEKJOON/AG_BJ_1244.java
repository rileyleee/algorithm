package algorithm.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class AG_BJ_1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int btn = sc.nextInt();
		int[] bArr = new int[btn + 1];
		for (int b = 1; b <= btn; b++) {
			bArr[b] = sc.nextInt();
		}

		int stNum = sc.nextInt();
		for (int st = 0; st < stNum; st++) {
			int gender = sc.nextInt();
			if (gender == 1) { // 남학생인 경우 부여받은 번호와 그의 배수인 스위치의 상태를 바꾼다.
				int btnNum = sc.nextInt();
				for (int b = 1; b <= btn; b++) {
					if (b % btnNum == 0) {
//						System.out.println(b);
						bArr[b] = 1 - bArr[b]; // 0이면 1, 1이면 0으로 변경
//						System.out.println(Arrays.toString(bArr));
					}
				}
			} else if (gender == 2) { // 여학생인 경우 부여받은 번호의 양 옆으로 나아가며 대칭의 상태인 경우 각 상태를 바꾼다.
				int btnNum = sc.nextInt();
				bArr[btnNum] = 1 - bArr[btnNum]; // 본인 위치는 무조건 바꾸기
				for (int b = btnNum + 1, i = 1; b <= btn; b++, i++) {
					if (btnNum - i > 0) { // 배열 경계를 넘지 않는다면,
//						System.out.println("b:" + b);
//						System.out.println("b - i: " + (btnNum - i));
						if (bArr[b] == bArr[btnNum - i]) {
							bArr[b] = 1 - bArr[b];
							bArr[btnNum - i] = 1 - bArr[btnNum - i];
//							System.out.println(Arrays.toString(bArr));
						} else { // 안 멈추면 대칭이 아닌 애들 뒤에서 대칭이 나오는 경우 바꿔버리기 때문
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		int cnt = 0;
		for (int i = 1; i <= btn; i++) {
			cnt++;
			if (cnt > 1 && cnt % 20 == 1) {
				System.out.print("\n"); // println도 상관없을 듯
			}
			System.out.print(bArr[i] + " ");
		}
		sc.close();
	}
}