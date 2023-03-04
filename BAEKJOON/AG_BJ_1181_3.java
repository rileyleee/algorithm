package algorithm.BAEKJOON;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class AG_BJ_1181_3 { // 영기님 코드
	public static void main(String[] args) throws IOException {
		// BufferedReader, BufferedWriter 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 단어의 개수 N 입력
		int N = Integer.parseInt(br.readLine());

		// 입력 받을 배열 생성
		String[] arr = new String[N];

		// 배열 요소 입력
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		// 길이가 짧은 것부터 정렬 후 사전 순으로 정렬
		Arrays.sort(arr, Comparator.comparingInt((String s) -> s.length()).thenComparing((String s) -> s.toString()));

		// 중복 제거
		int size = 0;
		for (int i = 0; i < N - 1; i++) {
			if (!arr[i].equals(arr[i + 1])) {
				arr[size++] = arr[i];
			}
		}
		arr[size++] = arr[arr.length - 1];
		arr = Arrays.copyOf(arr, size);

		// 출력
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
	}
}
