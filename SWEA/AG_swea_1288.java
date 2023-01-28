package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		String[] finalArr = new String[100];
		String[] digitsArr = N.split("");
		
		Arrays.sort(digitsArr);
		
		//배열 출력문
		for (int i = 0; i < digitsArr.length; i++) {
			System.out.print(digitsArr[i]); }
		
//		for (int i =0; i < digitsArr.length; i++) {
//			for (int j = i+1; j <digitsArr.length-(i+1); j++) {
//				if (digitsArr[i].equals(digitsArr[j])) {
//					System.out.println(j);
//				}
//			}
//		}

		
		sc.close();
	}

}

//배열 출력문
//for (int i = 0; i < digitsArr.length; i++) {
//	System.out.print(digitsArr[i]); }