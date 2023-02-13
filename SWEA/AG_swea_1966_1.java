package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1966_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		// 테스트케이스 수
		for (int t = 0; t < test; t++) {

			// 숫자열 길이
			int nums = sc.nextInt();
			int[] arr = new int[nums];

			for (int i = 0; i < nums; i++) {
				arr[i] = sc.nextInt();
			}
			//버블정렬
			for (int i = 0; i < nums; i++) {
				for (int j = i + 1; j < nums; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			System.out.print("#"+(t+1)+" ");
			for(int i =0; i <nums; i++) {				
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}