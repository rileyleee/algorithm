package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AG_BJ_2567 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cpNum = Integer.parseInt(br.readLine());
		int[][] wP = new int[102][102];

		for (int cP = 0; cP < cpNum; cP++) {
			String cpIdx = br.readLine();
			StringTokenizer st = new StringTokenizer(cpIdx);
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			for (int l = r + 1; l < r + 11; l++) {
				for (int m = c + 1; m < c + 11; m++) {
					wP[l][m] = 1;
				}
			}
		}

		int around = 0;
		for (int i = 0; i < wP.length; i++) {
			for (int j = 0; j < wP[i].length; j++) {
				if (wP[i][j] == 1) {
					if (wP[i - 1][j] == 0)
						around++;
					if (wP[i + 1][j] == 0)
						around++;
					if (wP[i][j - 1] == 0)
						around++;
					if (wP[i][j + 1] == 0)
						around++;
				}
			}
		}
		System.out.println(around);
	}
}

//		//---------------도화지 입력 확인---------------//
//		for (int i = 0; i < wP.length; i++) {
//			for (int j = 0; j < wP[i].length; j++) {
//				System.out.print(wP[i][j]);
//			}
//			System.out.println();
//		}
//		//----------------------------------------//