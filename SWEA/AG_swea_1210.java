package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1210 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		for (int t = 0; t < 10; t++) {
//			int testNum = sc.nextInt();

			// 사다리 배열 그리기 -> 상하좌우로 1줄씩 추가 생성
			int[][] ladder = new int[102][102];

			for (int r = 0; r < ladder.length; r++) {
				for (int c = 0; c < ladder[r].length; c++) {
					ladder[r][c] = sc.nextInt();
				}
			}

			// 사다리 1행 중 값이 1인 열만 배열에 담기
			// 입구 개수 세기
			int cnt = 0;
			for (int entrance = 0; entrance < ladder.length; entrance++) {
				if (ladder[1][entrance] == 1) {
					cnt++;
				}
			}
			//입구 개수 배열 만들기
			int[] entrance = new int[cnt];

			for (int ent = 0 ; ent < ladder.length; ent++) {
				if (ladder[1][ent] == 1) {
					entrance[ent] = ent;
				}

			}

//			System.out.println("#" + testNum + " " + "result");
//		}

		sc.close();

	}

}
