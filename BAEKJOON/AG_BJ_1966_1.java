package algorithm.BAEKJOON;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class AG_BJ_1966_1 {

    public static void main(String[] args) { //윤영님 코드
        Scanner sc = new Scanner(System.in);
        //테케수
        int T = sc.nextInt();
        //테케 반복
        for (int t = 0; t < T; t++) {
            //Queue생성 ! 안에 값을 Print객체로 받기
            Queue<Print> printList = new LinkedList<>();
            int N = sc.nextInt();
            int M = sc.nextInt();
            //카운팅배열. 우선순위 0~9이기 때문에 얘네를 셀 카운팅배열
            //포인터 사용할 예정. (프린트 목록의 우선 순위 중 가장 큰 값을 가리킬 때 쓰일 배열)
            int[] cntArr = new int[10];
            //우선순위 입력받기
            for (int i = 0; i < N; i++) {
                int priority = sc.nextInt();
                //카운팅 배열 입력
                cntArr[priority]++;
                //객체 만들기
                Print p = new Print(i, priority);
                //객체를 큐에 담기
                printList.add(p);
            }
            //포인터 준비(카운팅 배열 중에 현재 있는 가장 큰 우선순위 값을 가리킴)
            //배열의 값이 0이 아닌 가장 큰 index를 가리킴.
            int pointer = findpt(cntArr, 9);
            int cnt = 0;
            while (!printList.isEmpty()) {
                //뒤에 더 큰 우선순위를 가진 프린트물이 하나라도 존재한다는 의미
                if (printList.peek().priority < pointer) {
                    //빼서 다시 뒤로 보냅니다.
                    printList.add(printList.poll());

                } else {
                    //내가 원하는 놈인지를 확인하고 맞다면 cnt++하고 while문 종료
                    if (printList.peek().idx == M) {
                        cnt++;
                        break;
                        //삭제를시킴(프린트를 했다는 뜻), cnt++
                        //우선순위가 가장 큰놈이 나온 거니까
                        //카운팅배열에서 해당 인덱스의 값을 하나 감소
                        //findpt메서드를 이용해서 포인터 이동시킬지 말지를 결정해서 pointer값을 재정의 합니다.
                    } else {
                        printList.poll();
                        cnt++;
                        cntArr[pointer]--;
                        pointer = findpt(cntArr, pointer);

                    }
            
                }
            }
            System.out.println(cnt);

        }
    }

    //0~9 
    public static int findpt(int[] cntArr, int p) {
        if (p == 0) {
            return 0;
        }
        while (cntArr[p] == 0) {
            p--;
            //p=1
            //[0,1,0,0,0,...]
            if(p==0) {
                break;
            }
        }
        return p;
    }
}
//index값이랑 priority 변수로 들어가는 class
class Print {
    int idx;
    int priority;
//생성자
    public Print(int idx, int priority) {
        this.idx = idx;
        this.priority = priority;
    }
}
