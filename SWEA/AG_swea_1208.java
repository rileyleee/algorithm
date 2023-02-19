package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AG_swea_1208 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 0; t < 10; t++) {
			int fNum = Integer.parseInt(br.readLine());

			int[] arr = new int[100];

			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			for (int b = 0; b < arr.length; b++) {
				arr[b] = Integer.parseInt(st.nextToken());
			}

			int[] cnt = new int[101];

			for (int i = 0; i < arr.length; i++) {
				cnt[arr[i]] += 1;
			}

//			System.out.println(Arrays.toString(cnt));

			int h = 100;
			int l = 0;

			while (fNum > 0) {
				if (cnt[l] > 0 && cnt[h] > 0) {
					cnt[l]--;
					cnt[l + 1]++;
					cnt[h]--;
					cnt[h - 1]++;
					fNum--; // 덤프를 수행한 것은 한 번이 맞음 -> 이 배열은 특정 층을 가진 박스의 개수의 변화를 보여주는 것이기 때문임
					// 덤프의 결과로 가장 큰 층과 가장 작은 층이 한 개씩 사라진 대신 그보다 하나 작고 큰 층이 하나씩 들어나게 된 것
				}
				if (cnt[l] == 0) {
					l++;
				}
				if (cnt[h] == 0) {
					h--;
				}
			}
			System.out.println("#" + (t + 1) + " " + (h - l));
		}
	}
}
