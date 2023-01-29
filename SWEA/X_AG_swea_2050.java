package algorithm.SWEA;

import java.util.Scanner;

public class X_AG_swea_2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alpha = sc.next();
		String [] alphadigits = alpha.split("");
		
		int cnt = 0;
		int [] numdigits = new int[alphadigits.length];

		for (int a = 0; a < alphadigits.length; a++) {
			cnt++;
			numdigits[a] = cnt;
		}
		for (int a = 0; a < numdigits.length; a++)
			System.out.print(numdigits[a]);
		sc.close();
	}
}
//단순히 출력값을 맞추는 게 아니라 코테 의도를 알고 그 메서드를 사용해야 한다.


//import java.util.Scanner;
//
//public class Solution {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String alpha = sc.next();
//
//		String[] alphadigits = alpha.split("");
//		int cnt = 0;
//		for (int a = 0; a < alphadigits.length; a++) {
//			cnt++;
//			System.out.print(cnt );
//            
//		}
//		sc.close();
//	}
//}