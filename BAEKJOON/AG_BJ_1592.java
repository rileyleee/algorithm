package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_1592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(); // 사람수
		int m = sc.nextInt(); // 게임종료 조건
		int l = sc.nextInt(); // + 또는 - 하는 정도

		int[] cnt = new int[p];
		// 사람이 0번부터 시작한다고 가정
		// 공을 받는 카운트 어느 하나라도 M이 되면 게임 종료
		// 공을 받을 때 마다 +1 된다.
		int s = 0;
		int ball = 0;
		cnt[0] = 1; // 처음에 공을 받는 0번
		outer: while (true) {
			for (int c = 0; c < cnt.length; c++) {
				if (cnt[c] >= m) {
					break outer;
				}
			}
			if (cnt[s] % 2 == 1) { // 지금까지 받은 횟수가 홀수면
				s = (s + l) % p; // 양방향으로 전달하는데 인원수를 넘지 않도록 나머지 연산자 이용
				cnt[s]++; // 받은 횟수 더해주기
				ball++; // 던진 횟수 더해주기
			} else if (cnt[s] % 2 == 0) {// 지금까지 받은 횟수가 짝수면
				s = (s - l) % p;// 음방향으로 전달하는데 인원수를 넘지 않도록 나머지 연산자 이용
				if (s < 0) { // 음수까지 작아지는 경우
					s += p; // 양수로 돌아오도록
				}
				cnt[s]++; // 받은 횟수 더해주기
				ball++; // 던진 횟수 더해주기
			}
		}
		System.out.println(ball);
	}
}