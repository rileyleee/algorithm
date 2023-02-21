package algorithm.SWEA;

import java.util.Scanner;
 
public class AG_swea_1223_3 { //정혜영님 코드 //스택 사용하지 않고 배열로 구현
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int T = sc.nextInt();
            char[] stack = new char[T];
            int top = -1;
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < T; i++) {
                char c = s.charAt(i);
                if (c >= 48 && c <= 57)
                    sb.append(c);
                else {
                    int pri = priority(c);
                    while (top != -1) {
                        if (priority(stack[top]) >= pri) sb.append(stack[top--]);
                        else {
                            stack[++top] = c;
                            break;
                        }
                    }
                    if (top == -1) stack[++top] = c;
                }
            }
            while (top != -1) sb.append(stack[top--]);
            String str = sb.toString();
             
            int[] stack2 = new int[T];
            int top2 = -1;
            sb.setLength(0);
            for(int i = 0; i < T; i++) {
                char c = str.charAt(i);
                if (c >= 48 && c <= 57) stack2[++top2] = c - '0';
                else {
                    if(c == '+') {
                        int b = stack2[top2--];
                        int a = stack2[top2--];
                        stack2[++top2] = a + b;
                    }
                    else {
                        int b = stack2[top2--];
                        int a = stack2[top2--];
                        stack2[++top2] = a * b;
                    }
                     
                }
            }
            System.out.printf("#%d %d\n", tc, stack2[top2]);
        }
    }
 
    private static int priority(char c) {
        if (c == '+') return 1;
        else return 2;
    }
}