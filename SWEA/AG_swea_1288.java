package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_1288 {
	public static void main(String[] args) { // 26분 소요
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int sheepNum = sc.nextInt();
			String sheep = "";

			int[] arr = new int[10];

			int mul = 0;
			int sum = 0;

			while (true) {
				sum = 0;
				mul++;
//				System.out.println("mul: " + mul);
				sheep = String.valueOf(sheepNum * mul);
//				System.out.println(sheep);

				for (int i = 0; i < sheep.length(); i++) {
					arr[sheep.charAt(i) - 48] = 1;
				}
//				System.out.println(Arrays.toString(arr));
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
				}
//				System.out.println("sum: " + sum);
				if (sum == 10) {
					break;
				}
			}
			System.out.println("#" + t + " " + sheepNum * mul);
		}
		sc.close();
	}
}