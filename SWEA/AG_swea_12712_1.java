package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_12712_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			int M = sc.nextInt(); // 배열 크기
			int N = sc.nextInt(); // 분사 범위

			int[][] arr = new int[M + 2 * (N - 1)][M + 2 * (N - 1)];
			// 배열의 크기에 + (분사범위-1)이면 배열끝에서 분사할 수 있는 최대 범위가 나오는데
			// 양쪽이니깐 (분사범위-1)*2

			for (int r = 0; r < M; r++) { // 파리있는 범위만큼 입력을받으니깐 입력받는 배열의 크기는 동일하게
				for (int c = 0; c < M; c++) {
					arr[r + N - 1][c + N - 1] = sc.nextInt();
					// 파리만있는 범위의 크기지만 증가시킨 arr 배열 크기가 원래 범위보다 커서 가운데로 배치시켜줘야함.
				}
			}

//확인차 출력
//            for (int r = 0; r < M + 2 * (N - 1); r++) {
//                for (int c = 0; c < M + 2 * (N - 1); c++) {
//                    System.out.print(arr[r][c] + " ");
//                }
//                System.out.println();
//            }

			int max = 0;
			// 대각선
			for (int r = N - 1; r < M + 2 * (N - 1) - (N - 1); r++) { // 증가된 배열 인덱스 0부터 타격범위 -1 하면 파리 있는 인덱스(요거 그리면
																		// 바로나와)
				for (int c = N - 1; c < M + 2 * (N - 1) - (N - 1); c++) {
					// 위 두개는 1. 입력받은 배열이 파리있는 배열보다 크기때문에 인덱스를 조절해서 파리있는 배열부터 시작하게끔
					// 2. 마찬가지로 파리있는 배열에서 끝나게끔!
					int sum = 0;

					for (int k = 1 - N; k <= N - 1; k++) { // k는 분사 범위 1 2 3 하나씩 걸리도록
						sum += arr[r - k][c + k]; // 오 위 -> 왼 아래

					}
					for (int k = 1 - N; k <= N - 1; k++) {
						sum += arr[r + k][c + k]; // 왼 위 -> 오 아래
					}
					sum = sum - arr[r][c];
					if (sum > max) {
						max = sum;
					}

				}
			}
			// 요것도 위방식대루..
			// 가로 세로합
			for (int r = N - 1; r < M + 2 * (N - 1) - (N - 1); r++) {
				for (int c = N - 1; c < M + 2 * (N - 1) - (N - 1); c++) {
					int sum1 = 0;

					for (int k = 1 - N; k <= N - 1; k++) { // 세로
						sum1 += arr[r + k][c];

					}
					for (int k = 1 - N; k <= N - 1; k++) { // 가로
						sum1 += arr[r][c + k];
					}
					sum1 = sum1 - arr[r][c];
					if (sum1 > max) {
						max = sum1;
					}
				}
			}
			System.out.printf("#%d %d\n", t + 1, max);
		}
	}
}