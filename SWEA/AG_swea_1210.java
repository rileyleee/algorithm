package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AG_swea_1210 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int test = 0; test < 10; test++) {
			int testNum = Integer.parseInt(br.readLine());

			int[][] ladder = new int[102][102];

			for (int r = 1; r < ladder.length - 1; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int c = 1; c < ladder[r].length - 1; c++) {
					ladder[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			// 도착지 X좌표 구하기 (99, 57) -> "배열 확장 (100, 58)"
			int x = 0;
			for (int c = 0; c < ladder[100].length; c++) {
				if (ladder[100][c] == 2)
					x = c;
			}
//		System.out.println(x);

			// 0행의 입구 확인
			int cnt = 0;
			for (int c = 1; c < ladder[1].length; c++) {
				if (ladder[1][c] == 1)
					cnt++;
			}
//		System.out.println(cnt);

			// 0행의 입구 번호 배열에 담기
			int i = 0;
			int[] start = new int[cnt];
			for (int c = 1; c < ladder[1].length; c++) {
				if (ladder[1][c] == 1)
					start[i++] = c;
			}
//		System.out.println(Arrays.toString(start));
			int xIdx = -1;
			for (int m = 0; m < start.length; m++) {
				if (start[m] == x) {
					xIdx = m;
				}
			}
//		System.out.println(xIdx);

			// X좌표에서 시작해서 좌 또는 우가 우선이고 이동할 때 마다 direction을 기억하게 한다. 카운트도 필요
			// 좌 또는 우를 이동할 때는 0을 만날 때까지 이동한다.
			// 좌 또는 우가 없을 경우 상으로 이동한다. 상을 이동할 때는 좌우를 항상 검사한다.

			int start_point = ladder[100][x];
			int[] nRow = { 0, 0, -1 }; // 좌, 우 , 상 기준
			int[] nCol = { -1, 1, 0 };

			int sRow = 100;
			int sCol = x;
			int newCol = 0;

			while (sRow > 0 && sCol > 0 && sCol < 101) {
				// 좌
				newCol = sCol + nCol[0];

				if (ladder[sRow][newCol] == 1) {
					sCol = start[xIdx - 1];
					xIdx = xIdx - 1;
//					System.out.println("현재위치: " + sRow + ", " + sCol);
					// 좌측 연속된 1 끝까지 이동 후 하나 올라가기
					sRow--;
//					System.out.println("현재위치: " + sRow + ", " + sCol);
				}

				// 우
				newCol = sCol + nCol[1];

				if (ladder[sRow][newCol] == 1) {
					sCol = start[xIdx + 1];
					xIdx = xIdx + 1;
//					System.out.println("현재위치: " + sRow + ", " + sCol);
					// 우측 연속된 1 끝까지 이동 후 하나 올라가기
					sRow--;
//					System.out.println("현재위치: " + sRow + ", " + sCol);
				}

				// 상만 1일 때,
				if (ladder[sRow][sCol + 1] == 0 && ladder[sRow][sCol - 1] == 0) {
					sRow--;
//					System.out.println("현재위치: " + sRow + ", " + sCol);
				}
			}
//			System.out.println("좌 이동 수: " + lCount);
//			System.out.println("우 이동 수: " + rCount);
			System.out.println("#" + testNum + " " + (sCol - 1));
		}
//------------------------------------------------------------------------------------------//		
//		// 사다리 확인용
//		for (int r = 0; r < ladder.length; r++) {
//			for (int c = 0; c < ladder[r].length; c++) {
//				System.out.print(ladder[r][c]);
//			}
//			System.out.println();
//		}
//------------------------------------------------------------------------------------------//

	}
}
