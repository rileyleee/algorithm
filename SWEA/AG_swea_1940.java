package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int j = 0; j < t; j++) {
			int com = sc.nextInt();
			int speed = 0;
			int distance = 0;

			for (int i = 0; i < com; i++) {
				int comNum = sc.nextInt();

				switch (comNum) {
				case 0:
					distance = distance + speed;
					System.out.println("현재속도: " + speed);
					System.out.println("현재거리: " + distance);
					break;

				case 1:
					int pspeed = sc.nextInt();
					speed = speed + pspeed;
					distance = distance + speed;
					System.out.println("현재속도: " + speed);
					System.out.println("현재거리: " + distance);
					break;

				case 2:
					int mspeed = sc.nextInt();
					speed = speed - mspeed;
					if (speed > 0) {
						distance = distance + speed;
					}
					if (speed <= 0) {
						speed = 0;
					}
					System.out.println("현재속도: " + speed);
					System.out.println("현재거리: " + distance);
				}
			}
			System.out.println("#" + (j + 1) + " " + distance);
		}
		sc.close();
	}
}
