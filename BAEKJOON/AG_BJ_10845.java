package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class AG_BJ_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> qu = new LinkedList<>();

		int command = Integer.parseInt(br.readLine());
		int last = 0;

		for (int c = 0; c < command; c++) {
			String commands = br.readLine();

			if (commands.equals("front")) {
				if (!qu.isEmpty()) {
					System.out.println(qu.peek());
				} else {
					System.out.println(-1);
				}

			} else if (commands.equals("back")) {
				if (!qu.isEmpty()) {
					System.out.println(last); 
					// 마지막 값을 출력하는 매서드는 없기에 push할 때마다 변수에 넣도록
				} else {
					System.out.println(-1);
				}

			} else if (commands.equals("size")) {
				System.out.println(qu.size());

			} else if (commands.equals("empty")) {
				if (qu.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

			} else if (commands.equals("pop")) {
				if (!qu.isEmpty()) {
					System.out.println(qu.poll());
				} else {
					System.out.println(-1);
				}

			} else if (commands.contains("push")) {

				StringTokenizer st = new StringTokenizer(commands);
				String com = st.nextToken();

				int num = Integer.parseInt(st.nextToken());
				qu.offer(num);
				last = num;
			}
		}
	}
}