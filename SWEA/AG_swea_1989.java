package SWEA;
import java.util.Scanner;

public class AG_swea_1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String letter = sc.next();
			String sletter = letter.toLowerCase();

			StringBuffer str = new StringBuffer(sletter);
			String rvstr = str.reverse().toString();
			// 참조값을 호출하는 대신 문자열로 전환

			if (sletter.equals(rvstr)) {
				System.out.println("#" + (i + 1) + " " + 1);
			} else {
				System.out.println("#" + (i + 1) + " " + 0);
			}
		}
		sc.close();
	}
}