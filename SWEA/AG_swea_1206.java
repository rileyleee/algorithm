package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AG_swea_1206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 0; t < 10; t++) {

			int bNum = Integer.parseInt(br.readLine());
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int[] bArr = new int[bNum];
			
			for (int f = 0; f < bArr.length; f++) {
				bArr[f] = Integer.parseInt(st.nextToken());
			}

			// 기준 빌딩과 양 옆 2개 씩 총 4개 빌딩의 건물 층 수 차이를 비교하고, 최소 차이를 해당 빌딩의 조망권 세대 수로 산정한다.

			int[] minArr = new int[4];
			int i = 0;
			int sum = 0;
			for (int b = 2; b < bArr.length - 2; b++) {
				minArr[i++] = bArr[b] - bArr[b - 2];
				minArr[i++] = bArr[b] - bArr[b - 1];
				minArr[i++] = bArr[b] - bArr[b + 1];
				minArr[i] = bArr[b] - bArr[b + 2];

				Arrays.sort(minArr);
				if (minArr[0] > 0) {
					sum += minArr[0];
				}
				i = 0;
			}
			System.out.println("#" + (t + 1) + " " + sum);
		}
	}
}