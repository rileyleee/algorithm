package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_사전테스트1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String memory = sc.next();
		String[] memoryArr = memory.split("");

		int[] arr = new int[memoryArr.length];

		for (int i = 0; i < memoryArr.length; i++) {
			int digit = Integer.parseInt(memoryArr[i]);
			arr[i] = digit;
		}
		int flag = 0;
		int cnt = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != 0) {
				for (int j = i; j < arr.length - i; j++) {
					arr[j] = 0;
				}
				cnt++;

			}else if (arr[i]==0){
				
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(cnt);
		sc.close();
	}

}
