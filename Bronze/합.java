import java.util.Scanner;

public class 합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum = 0; // sum값 초기화
        n = scan.nextInt();
        for(int i=1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
