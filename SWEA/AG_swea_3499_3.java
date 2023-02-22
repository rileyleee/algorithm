package algorithm.SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

public class AG_swea_3499_3 { //정의민님 코드

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			Queue<String> evenQ = new LinkedList<>();
			Queue<String> oddQ = new LinkedList<>();

			for (int i = 0; i < n; i++) {
				String num = st.nextToken();
				if ((n + 1) / 2 > i)
					evenQ.add(num);
				else
					oddQ.add(num);
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0)
					System.out.print(evenQ.poll() + " ");
				else
					System.out.print(oddQ.poll() + " ");
			}
			System.out.println();
		}
	}
}
