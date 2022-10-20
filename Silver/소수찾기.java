import java.util.Scanner;

public class 소수찾기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0, prime = 0;
        int[] num = new int[N];
        for(int i=0; i<N; i++){
            cnt = 0; // cnt 초기화
            num[i] = scan.nextInt();
            for(int j=2; j<= num[i]; j++) {
                if(num[i] % j == 0) cnt++; // 자기 자신으로 나눌때만 cnt + 1 : 소수 !
            }
            if(cnt == 1) prime++;
        }
        System.out.println(prime);
    }
}
