import java.util.Scanner;

public class 별찍기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String star = "*";
        String blank = " ";
        for(int i=1; i<=N; i++) {
            for(int j=6; j>i; j--) {
                System.out.print(star);                
            }
            System.out.println();
        }
    }
}
