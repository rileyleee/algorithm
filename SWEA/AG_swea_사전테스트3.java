package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_�����׽�Ʈ3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ������ �Է� �ޱ�
		int N = sc.nextInt();
		int L = sc.nextInt();
		int[] taste = new int[N];
		int[] cal = new int[N];

		for (int i = 0; i < N; i++) {
			taste[i] = sc.nextInt();
			cal[i] = sc.nextInt();
		}
//		System.out.println(N);
//		System.out.println(L);

		// ���� ���� �򰡿� Į�θ� �������� �����ϱ�
		for (int n = 0; n < N; n++) {
			for (int i = 0; i < (taste.length - 1); i++) {
				if (taste[i] > taste[i + 1]) {
					int f = taste[i];
					int b = taste[i + 1];
					taste[i] = b;
					taste[i + 1] = f;
				}
			}
			for (int i = 0; i < (cal.length - 1); i++) {
				if (cal[i] > cal[i + 1]) {
					int f = cal[i];
					int b = cal[i + 1];
					cal[i] = b;
					cal[i + 1] = f;
				}
			}
		}
//		System.out.println(Arrays.toString(taste));
//		System.out.println(Arrays.toString(calo));

		// �����ִ� ��� ���� �ݺ��� ����

		for (int n = 1; n < N + 1; n++) {
			// ������ ��� ������ ���� �����ͼ� ���ϱ�
			for (int m = 0; m < n; m++) {
			
				for (int l = m; l < N; l++) {
			
				}
			}

		}

		sc.close();
	}
}
