import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, n, a, b;
        int price = 0;
        x = scan.nextInt();
        n = scan.nextInt();
        for(int i=0; i<n; i++) {
            a = scan.nextInt();
            b = scan.nextInt(); // 그냥 띄어쓰기하고 입력하면 a, b로 입력됨
            price += a * b;
        }
        if( x == price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
