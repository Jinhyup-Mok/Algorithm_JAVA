import java.util.Scanner;

public class 소수구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt(), N = scan.nextInt();
        int[] answer = new int[N+1];
        for(int i=M; i<=N; i++){
            int cnt = 0;
            if(i!=1){
                for(int j=2; j<= i; j++){
                    if(i%j == 0) cnt++;
                }
            }
            if(cnt == 1) answer[i] = i;
        }
        for(int i=0; i<answer.length;i++){
            if(answer[i] != 0) System.out.println(answer[i]);
        }
    }
}
