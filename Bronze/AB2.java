import java.util.Scanner;

public class AB2     {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test, A, B;        
        test = scan.nextInt();
        int[] ab2 = new int[test];
        for(int i=0; i<test; i++) {
            A = scan.nextInt();
            B = scan.nextInt();
            ab2[i] = A + B;
        }
        for(int i=0; i<test; i++) {
            System.out.printf("Case #%d: %d\n", i+1, ab2[i]);
        }
    }
}
