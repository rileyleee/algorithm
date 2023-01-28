package SWEA;
import java.util.Scanner;

public class AG_swea_2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alpha = sc.next();
		for (int i = 0; i < alpha.length(); i++) {
			System.out.print(((int) alpha.charAt(i) - 64) + " ");
		} //uppercase로 대문자 변환하자. 
		sc.close();
	}
}
