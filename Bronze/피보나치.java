import java.util.Scanner;

public class 피보나치 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] fibo = new int[21]; // 11개의 자리 0 ~ 10 번째 칸
        // int[] new int[n] 여기서 n의 의미는 배열의 자리 개수 !!
        // 10이면 인덱스 0 ~ 9 까지 !
        fibo[0] = 0; 
        fibo[1] = 1;
        if(n > 1) {
            for(int i=2; i<n+1; i++) {
                fibo[i] = fibo[i-1] + fibo[i-2]; 
            }
        }
        System.out.println(fibo[n]);
    }
}
