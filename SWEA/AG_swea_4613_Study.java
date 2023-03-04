package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_4613_Study {
	public static void main(String[] args) { // 깃발은 W -> B -> R순 //맨 윗줄은 w 맨 아랫줄은 반드시 R이어야 함
		// 각 행별로 각 색의 수 비교
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			// 원래 배열 받기
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
			char[] flag = new char[n];// 국기의 행별 색 저장 배열

			int changeSum = 0;
			int min = Integer.MAX_VALUE;

			for (int i = 1; i < n - 1; i++) { //w가 1개라도 들어갈 자리를 만들어주기 위해 0이 아닌 1부터 시작
				for (int j = i + 1; j < n; j++) {
					changeSum = 0;
					System.out.println(i + "," + j);
					for (int f = 0; f < n; f++) { 
						if (f < i) { //w가 한 줄이라도 있으려면  i에게 0의 자리를 남겨줘야 함
							flag[f] = 'W';
							changeSum += m - wArr[f];
						} else if (f >= i && f < j) { //만약 여기에 등호가 없으면 B가 없는 경우가 발생함
							flag[f] = 'B';
							changeSum += m - bArr[f];
						} else if (f >= j) { //등호가 있어야 R이 한개라도 들어감
							flag[f] = 'R';
							changeSum += m - rArr[f];
						}
					}
					System.out.println(changeSum);
					System.out.println(Arrays.toString(flag));
					min = Math.min(min, changeSum);
				}
			}
			System.out.println("#" + t + " " + min);
		}
		sc.close();
	}
}