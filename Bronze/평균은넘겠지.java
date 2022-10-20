import java.util.Scanner;

public class 평균은넘겠지 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        double[] answer = new double[C];
        for(int i=0; i<C; i++){
            int cnt = 0, sum = 0, avg = 0; // 변수 초기화에 주의하자 !!!!
            int N = scan.nextInt();
            int[] score = new int[N];

            for(int j=0; j<N; j++){
                score[j] = scan.nextInt();
                sum += score[j];
            }
            avg = sum / N; // 하나의 케이스 끝나고 초기화 필요 !!
            for(int j=0; j<N; j++){
                if(score[j] > avg) cnt += 1; // 평균 넘는 점수 개수 저장!
            }
            answer[i] = (double)cnt / (double)N * 100.0;
            // 백분율, 퍼센트를 표현하려면 double형으로 계산해야한다!
        }
        for(int i=0;i<C;i++){
            System.out.printf("%.3f%%\n", answer[i]);
            // 소수점 %.2f, %.3f, %기호표시 %% 두개 쓴다 !
        }
    }
}
