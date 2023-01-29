package algorithm.SWEA;


public class AG_swea_2027 {
	public static void main(String[] args) {
		String[] text = new String[] { "+", "+", "+", "+", "+" };

		for (int j = 0; j < 5; j++) {
			text[j] = "#";
			
			for (int i = 0; i < 5; i++) {
				System.out.print(text[i]);
			}
			System.out.println();
			for (int i = 0; i < 5; i++) {
				if (text[i] == "#")
					text[i] = "+";
			}
		}
	}
}