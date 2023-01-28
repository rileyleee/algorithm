package SWEA;
import java.util.Scanner;

public class AG_swea_2043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int k = sc.nextInt();

		int cnt = 0;
		for (int i = k; i < p + 1; i++)
			cnt++;
		System.out.println(cnt);
		sc.close();
	}
}