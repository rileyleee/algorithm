package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		String[] base64Arr = new String[64];
		for (int i = 0; i < base64.length(); i++) {
			base64Arr[i] = base64.substring(i, i + 1);
		}

		String input = sc.next();
		int[] inputArr = new int [input.length()];

		for (int i = 0; i < input.length(); i++) {
			String find = input.substring(i, i + 1);
			for (int j = 0; j < base64Arr.length; j++) {
				if (find.equals(base64Arr[j])) {
					inputArr[i] = j;
				}
			}
		}
		//십진수 숫자배열 -> 이진수 숫자배열 변환
		String [] binary = new String[inputArr.length];
		for (int i = 0; i <inputArr.length; i++) {
			int num = inputArr[i];
			binary[i] = Integer.toString(num, 2);

		}
		//문자열 배열로 전환
		String[] binArr = new String[binary.length];
        for (int i = 0; i < binary.length; i++) {
        	binArr[i] = String.valueOf(binary[i]);
        }
        
        //문자로 변화 -> 10진수로 바꿔서 -> 아스키 코드로 읽기
		 너무 어려워

		sc.close();

	}

}
