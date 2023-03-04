package algorithm.BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class AG_BJ_2304 //시행착오

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int colNum = sc.nextInt();

		Stack<int[]> wStk = new Stack<>();
		Stack<int[]> hStk = new Stack<>();

		int wMax = -1;
		int wMaxidx = -1;
		int wMin = 1001;
		int wMinidx = -1;
		int hMax = -1;
		int hMaxidx = -1;

		for (int f = 0; f < colNum; f++) {
			wStk.push(new int[] { f, sc.nextInt() });
			hStk.push(new int[] { f, sc.nextInt() });
			// 왼쪽 벽과 가장 멀리있는 값과 가장 가까이 있는 값 구하고 그 때의 인덱스 구하기
			int[] wCheck = wStk.peek();
			if (wCheck[1] > wMax) {
				wMax = wCheck[1];
				wMaxidx = wCheck[0];
			}
			if (wCheck[1] < wMin) {
				wMin = wCheck[1];
				wMinidx = wCheck[0];
			}
			// 최대 높이와 그 때의 인덱스 구하기
			int[] hCheck = hStk.peek();
			if (hCheck[1] > hMax) {
				hMax = hCheck[1];
				hMaxidx = hCheck[0];
			}
		}
//		System.out.println(wMax);
//		System.out.println(wMaxidx);
//		System.out.println(wMin);
//		System.out.println(wMinidx);
//		System.out.println(hMax);
//		System.out.println(hMaxidx);
		// 사각형 너비 구하기
		int space = (wMax - wMin + 1) * hMax;
		System.out.println(space);
		// 가장 높은 기둥을 기준으로 좌 우 구분하여 면적 빼주기:)
		space = space - ((hMax - hStk.elementAt(wMinidx)[1]) * (wStk.elementAt(hMaxidx)[1] - wMin))
				- ((hMax - hStk.elementAt(wMaxidx)[1]) * (wMax - wStk.elementAt(hMaxidx)[1]));
		// 왼쪽 애보다 인덱스가 크면서 높이가 높은 경우, 가장 높은 기둥과의 높이 차이 및 너비 차이를 곱해 더해준다.

	
		
		// 오른쪽 애보다 인덱스가 작으면서 높이가 높은 경우, 가장 높은 기둥광의 높이 차이 및 너비 차이를 곱해 더해준다.
		
		
		
		System.out.println(space);
		sc.close();
	}

}
