package algorithm.BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AG_BJ_2564 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String box = br.readLine();
		StringTokenizer st = new StringTokenizer(box);

		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());

		int sNum = Integer.parseInt(br.readLine());

		int[][] arr = new int[sNum][2];

		for (int i = 0; i < sNum; i++) {
			String store = br.readLine();
			st = new StringTokenizer(store);
			int dir = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			arr[i][0] = dir;
			arr[i][1] = dist;
		}

		String dong = br.readLine();
		st = new StringTokenizer(dong);
		int Ddir = Integer.parseInt(st.nextToken());
		int Ddist = Integer.parseInt(st.nextToken());

		int[] diff = new int[sNum + 1];

		// 지도를 일렬로 펼쳤을 때 0,0에서부터의 거리를 측정
		for (int i = 0; i < sNum; i++) {
			int distance = 0;
			if (arr[i][0] == 1) {
				distance = arr[i][1];
				diff[i] = distance;
			} else if (arr[i][0] == 2) {
				distance = width + height + (width - arr[i][1]);
				diff[i] = distance;
			} else if (arr[i][0] == 3) {
				distance = (width * 2) + height + (height - arr[i][1]);
				diff[i] = distance;
			} else {
				distance = width + arr[i][1];
				diff[i] = distance;
			}
		}

		// 동근이 위치
		int Ddistance = 0;
		if (Ddir == 1) {
			Ddistance = Ddist;
			diff[sNum] = Ddistance;
		} else if (Ddir == 2) {
			Ddistance = width + height + (width - Ddist);
			diff[sNum] = Ddistance;
		} else if (Ddir == 3) {
			Ddistance = (width * 2) + height + (height - Ddist);
			diff[sNum] = Ddistance;
		} else {
			Ddistance = width + Ddist;
			diff[sNum] = Ddistance;
		}

		int total = 0;
		for (int i = 0; i < diff.length - 1; i++) {
			int result = 0;
			result = Math.abs(diff[i] - diff[diff.length - 1]);
			if (result > (width + height)) {
				result = 2 * (width + height) - result;
			}
			total += result;
		}
		System.out.println(total);
	}
}
