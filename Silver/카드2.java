import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> card = new LinkedList<>();
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            card.add(i);
        }
        while(card.size() > 1) {
            card.remove(); // 큐의 첫번째 값 삭제
            card.add(card.poll()); // 첫번째 값을 맨뒤로 옮김, poll()로 첫번째 값 추출 -> add()로 큐의 맨뒤에 삽입
        }
        System.out.println(card.poll()); // poll() 로 마지막으로 남은 숫자 반환
    }
}

