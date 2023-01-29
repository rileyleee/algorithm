package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		for (int i =0; i < T; i++) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int maxl = 0;
		int minl = 0;

		if (n >= m) {
			maxl = n;
			minl = m;
		} else {
			maxl = m;
			minl = n;
		}

		int[] minArr = new int[minl];
		int[] maxArr = new int[maxl];

		for (int j = 0; j < n; j++) {
			nArr[j] = sc.nextInt();
		}
		for (int j = 0; j < m; j++) {
			mArr[j] = sc.nextInt();
		}

		int [][] multi = new int [minl][minl];
		
		for (int j = 0; j < minl; j++) {			
			for(int k = j; k < minl; k++) {
				multi[][] = 
				
		
			}}
		
		
		for (int j = 0; j < nArr.length; j++) {
			for (int k = 0; k < nArr.length; k++) {
				int multi = nArr[j] * mArr[k];
				total += multi;
			}
			System.out.println(total);
		}

//	}
//	sc.close();
	}
}
