import java.util.Scanner;

public class 반복문2번 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test, A, B;
        test = scan.nextInt();
        int[] plus = new int[test]; // 배열의 크기 지정
        for(int i=0; i<test; i++) {
            A = scan.nextInt();
            B = scan.nextInt();
            plus[i] = A + B; // 반복문을 이용하여 배열에 값 저장
        }
        // 배열의 크기: 배열이름.length
        for(int i=0; i<plus.length; i++){
            System.out.println(plus[i]);
        } // 반복문을 이용하여 배열에 저장된 값 하나씩 출력
    }
}
