package SWEA;
import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_2063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] scores = new int[n];

		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		
		Arrays.sort(scores);
		int midnum = scores[n/2];
		System.out.println(midnum);
		sc.close();
	}
}
