import java.util.Scanner;

public class 수들의합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long S = scan.nextLong();
        long num = 0;
        long cnt = 0;
        for(long i=1; i<=S; i++) {
            num += i;
            cnt++;
            if(num > S) break;
        }
        System.out.println(cnt-1);
    }
}



