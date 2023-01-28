package SWEA;
import java.util.Scanner;

public class AG_swea_2056_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i < t + 1; i++) {
			String date = sc.next();

			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6);
			int m = Integer.parseInt(month);
			int d = Integer.parseInt(day);

			if (m == 00 || m > 12) {
				System.out.println("#" + i + " " + "-1");
			} else {
				switch (month) {
				case "01":
				case "03":
				case "05":
				case "07":
				case "08":
				case "10":
				case "12":
					if (day == "00" || d > 31) {
						System.out.println("#" + i + " " + "-1");
					} else {
						System.out.println("#" + i + " " + year + "/" + month + "/" + day);
					}
					break;
				case "04":
				case "06":
				case "09":
				case "11":
					if (day == "00" || d > 30) {
						System.out.println("-1");
					} else {
						System.out.println("#" + i + " " + year + "/" + month + "/" + day);
					}
					break;
				case "02":
					if (day == "00" || d > 28) {
						System.out.println("#" + i + " " + "-1");
					} else {
						System.out.println("#" + i + " " + year + "/" + month + "/" + day);
					}
					break;
				default:
					System.out.println("#" + i + " " + year + "/" + month + "/" + day);
				}
			}
		}
		sc.close();
	}
}
