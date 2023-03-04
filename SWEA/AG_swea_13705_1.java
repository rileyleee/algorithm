package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_13705_1 {
	public static void main(String args[]) throws Exception { // 신산하님 코드
		Scanner sc = new Scanner(System.in);

		// 1.test case
		int t = sc.nextInt();

		for (int T = 1; T < t + 1; T++) {
			// 2.배열의 크기
			int N = sc.nextInt();
			int[][] arr = new int[N + 1][N + 1];
			// 3.파동 시작값
			int p = sc.nextInt();
			// 4. 행 열
			int r = sc.nextInt();
			int c = sc.nextInt();

			if (p == 0)
				arr[r][c] = -1;// 파동 시작값넣기
			else
				arr[r][c] = p;
			// 파동이 0이면 8방조사 때 간섭당하기 때문에 -1로 집어넣고, 마지막에 -1을 0으로 바꿔준다.

			// 5. 증감
			int plus_minus = sc.nextInt();

			// 6. 연산
			int r1 = r; // 시작점 종료점 초기화
			int c1 = c;
			int r2 = r;
			int c2 = c;

			// 파동값이 0이하면 멈출 것 또는 조사 범위를 벗어나면 멈출 것
			while (true) {
				// 다음 파동 값 계산
				p += plus_minus;

				// 파동값이 -값이면 멈추기
				if (p < 0)
					break;

				// 값 변환이 한번도 일어나지 않으면 멈추기
				if (detec(arr, r1, c1, r2, c2, p) == false)
					break;
				;

				// 새로운 영역 선언 (좌상 , 우하로 이동)
				r1--;
				c1--;
				r2++;
				c2++;
				// (r1>0 && c1>0 || r2<=N && c2<=N)

			}

			// 결과출력전 -1을 0으로
			if (arr[r][c] == -1)
				arr[r][c] = 0;

			// 7. 결과 출력 : row 합
			System.out.print("#" + T + " ");
			for (int i = 1; i <= N; i++) {
				int line_sum = 0;
				for (int j = 1; j <= N; j++) {
					line_sum += arr[i][j];
				}
				System.out.print(line_sum + " ");
			}
			System.out.println();

		} // test case end
	}

	// 8방 탐색 함수
	// r1 c1 : 시작지점
	// r2 c2 : 종료지점
	// p : 파동
	static public boolean detec(int[][] arr, int r1, int c1, int r2, int c2, int p) {

		int N = arr.length;

		// 상 하 좌 우 좌상 우상 좌하 우하
		int[][] drc = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 }, { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } };
		boolean flag = false;
		for (int i = r1; i <= r2; i++) {
			for (int j = c1; j <= c2; j++) {
				// 한 칸 마다 8방 조사
				for (int k = 0; k < 8; k++) {
					// 경계 조심
					if (i + drc[k][0] > 0 && i + drc[k][0] <= N && j + drc[k][1] > 0 && j + drc[k][1] <= N) {
						// 그 위치에 0이 아닌 수가 있다면 skip
						if (arr[i + drc[k][0]][j + drc[k][1]] == 0) {
							// p는 0~255까지 늘어날 수 있다.

							if (p > 255)
								p = 255;
							arr[i + drc[k][0]][j + drc[k][1]] += p;// 값 변환
							flag = true;// 전체적으로 한번이라도 값 변환이 일어나면 true
						}

					}
				} // 8방조사 end
			}
		}

		// arr는 return 안해줘도 반영됨
		return flag;
	}// detec end
}
