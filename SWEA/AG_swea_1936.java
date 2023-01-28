package SWEA;
import java.util.Scanner;

public class AG_swea_1936 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a + b == 3 || a + b == 5) { //4를 먼저 작성하면 짧게 작성 가능
			if (a > b) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		} else {
			if (a > b) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}
		}
		sc.close();
	}
}
