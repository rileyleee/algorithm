package SWEA;
import java.util.Scanner;

public class AG_swea_2070_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[2];

		for (int i = 1; i < t + 1; i++) {
			String result = null;
			
			for (int j = 0; j < 2; j++) {
				arr[j] = sc.nextInt();
			}
			
			if (arr[0] > arr[1]) {
				result = ">";
			} else if (arr[0] < arr[1]) {
				result = "<";
			} else {
				result = "=";
			}
			
			System.out.println("#" + i + " " + result);
		}
		sc.close();
	}
}