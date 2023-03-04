package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_10158 { // 한시간 반 소요되었으나 풀지 못함 //난 개미가 싫어
	public static boolean wPlus = true;
	public static boolean hPlus = true;
	public static int w;
	public static int h;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();

		int antW = sc.nextInt();
		int antH = sc.nextInt();

		int t = sc.nextInt(); // 개미의 t시간 뒤 위치

		System.out.printf("%d %d %d %d %d \n", w, h, antW, antH, t);

		int cnt = 0;
		int i = -1;
		int j = -1;

		outer: while (cnt <= t) {
			// 기본 진행 방향
			antMove(antW, antH, cnt);
			System.out.printf("개미w %d 개미h %d 시간 %d \n", antW, antH, cnt);
			System.out.println("flag1");

			if (antW == 0 && antH != 0) {
				wPlus = true;
				while (antH != 0 && antW != w && antH != h) {
					antMove(antW, antH, cnt);
					System.out.println(antW + " ," + antH);
					System.out.println("시간: " + cnt);
					if (cnt == t) {
						i = antW;
						j = antH;
						break outer;
					}
				}
			}
			System.out.println("flag2");
			if (antH == 0 && antW != 0) {
				hPlus = true;
				while (antW != 0 && antW != w && antH != h) {
					antMove(antW, antH, cnt);
					System.out.println(antW + " ," + antH);
					System.out.println("시간: " + cnt);
					if (cnt == t) {
						i = antW;
						j = antH;
						break outer;
					}
				}
			}
			System.out.println("flag3");
			if (antW == w && antH != h) {
				wPlus = false;
				while (antH != 0 && antW != 0 && antH != h) {
					antMove(antW, antH, cnt);
					System.out.println(antW + " ," + antH);
					System.out.println("시간: " + cnt);
					if (cnt == t) {
						i = antW;
						j = antH;
						break outer;
					}
				}
			}
			System.out.println("flag4");
			if (antH == h && antW != w) {
				hPlus = false;
				while (antH != 0 && antW != 0 && antW != w) {
					antMove(antW, antH, cnt);
					System.out.println(antW + " ," + antH);
					System.out.println("시간: " + cnt);
					if (cnt == t) {
						i = antW;
						j = antH;
						break outer;
					}
				}
			}
			System.out.println("flag5");
			if (antW == 0 && antH == 0) {
				wPlus = true;
				hPlus = true;
				while (antW != w && antH != h) {
					antMove(antW, antH, cnt);
					System.out.println(antW + " ," + antH);
					System.out.println("시간: " + cnt);
					if (cnt == t) {
						i = antW;
						j = antH;
						break outer;
					}
				}
			}
			if (antW == w && antH == h) {
				wPlus = false;
				hPlus = false;
				while (antH != 0 && antW != 0) {
					antMove(antW, antH, cnt);
					System.out.println(antW + " ," + antH);
					System.out.println("시간: " + cnt);
					if (cnt == t) {
						i = antW;
						j = antH;
						break outer;
					}
				}
			}
		}
		System.out.println(i + " " + j);
		sc.close();
	}

	public static int antMove(int antW, int antH, int cnt) {
		if (wPlus && hPlus) {
			antW++;
			antH++;
			cnt++;
		} else if (!wPlus && hPlus) {
			antW--;
			antH++;
			cnt++;
		} else if (wPlus && !hPlus) {
			antW++;
			antH--;
			cnt++;
		} else if (!wPlus && !hPlus) {
			antW--;
			antH--;
			cnt++;
		}
		return cnt;
	}
}