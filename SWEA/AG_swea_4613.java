package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_4613 {
	public static void main(String[] args) { // 깃발은 W -> B -> R순 //맨 윗줄은 w 맨 아랫줄은 반드시 R이어야 함
		// 각 행별로 각 색의 수 비교  //이전 선택에 따라 최소값을 선택하지 못하는 오류를 발생 -> 그리디 알고리즘의 한계인가..요
		// 문제 해결 불가 -> 한 행 한 행은 최적이었지만 결국 모든 값을 합했을 때는 최적이 아니게 됨 -> 결국 2중 반복문 필요

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			char[][] oArr = new char[n][m];
			for (int r = 0; r < n; r++) {
				String str = sc.next();
				for (int c = 0; c < m; c++) {
					oArr[r][c] = str.charAt(c);
				}
			}
			// 행별 색 분포
			int[] wArr = new int[n];
			int[] bArr = new int[n];
			int[] rArr = new int[n];

			for (int r = 0; r < n; r++) {
				for (int c = 0; c < m; c++) {
					if (oArr[r][c] == 'W') {
						wArr[r]++;
					} else if (oArr[r][c] == 'B') {
						bArr[r]++;
					} else if (oArr[r][c] == 'R') {
						rArr[r]++;
					}
				}
			}
			// 국기의 행별 색 저장 배열
			char[] flag = new char[n];
			flag[0] = 'W';
			flag[n - 1] = 'R';

			int changeSum = 0;

			// 맨 윗줄 카운트(무조건 흰색이어야 함)
			int firstline = m - wArr[0];
			changeSum += firstline;

			// 맨 아랫줄 카운트(무조건 빨간색이어야 함)
			int lastline = m - rArr[n - 1];
			changeSum += lastline;

			for (int i = 1; i < n - 1; i++) {
				// 전 줄이 흰색이고 다음 줄이 빨간색인 경우, -> 파란색만 가능
				if (flag[i - 1] == 'W' && flag[i + 1] == 'R') {
					changeSum += m - bArr[i];
					flag[i] = 'B';
					// 전 줄이 흰색이고 다음 줄이 빨간색이 아닌 경우, -> 흰색과 파란색만 가능
				} else if (flag[i - 1] == 'W' && flag[i + 1] != 'R') {
					int wC = 0;	int bC = 0;
					// 흰색인 경우 변화 값
					wC = m - wArr[i];
					// 파란 색인 경우 변화 값
					bC = m - bArr[i];

					if (wC > bC) { // 등호 여부에 따라 값이 테케 1만 맞았다가 2만 맞았다가 함 
						changeSum += bC;
						flag[i] = 'B';
					} else {
						changeSum += wC;
						flag[i] = 'W';
					}

					// 전 줄이 파란색이면 -> 파란색과 빨간색만 가능
				} else if (flag[i - 1] == 'B') {
					int bC = 0;	int rC = 0;
					// 파란색인 경우 변화 값
					bC = m - bArr[i];
					// 빨간색인 경우 변화값
					rC = m - rArr[i];

					if (bC >= rC) {
						changeSum += rC;
						flag[i] = 'R';
					} else {
						changeSum += bC;
						flag[i] = 'B';
					}
				} // 전 줄이 빨간색이면 빨간색만 가능
				else if (flag[i - 1] == 'R') {
					changeSum += m - rArr[i];
					flag[i] = 'R';
				}
			}

			System.out.println(Arrays.toString(wArr));
			System.out.println(Arrays.toString(bArr));
			System.out.println(Arrays.toString(rArr));
			System.out.println(Arrays.toString(flag));
			System.out.println(firstline);
			System.out.println(lastline);
			System.out.println(changeSum);
		}
		sc.close();
	}
}