import java.util.Scanner;

public class 부녀회장 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] answer_ = new int[T];
        for(int i=0; i<T; i++){
            int k = scan.nextInt();
            int n = scan.nextInt();
            answer_[i] = house(k, n);           
        }
        for(int i=0; i<T; i++){
            System.out.println(answer_[i]);
        }

    }
    public static int house(int k_, int n_){
        int[][] ab = new int[k_+1][n_+1];
        int cnt = 0, answer = 0;
        for(int i=0; i<n_; i++){
            ab[0][i] = i + 1;
        }
        for(int i=1; i<=n_; i++){
            answer += ab[0][i-1];
        }
        if(k_ > 0){
            k_ = k_ -1;
            for(int i=1; i<=n_; i++){
                if(k_ >= 1) {
                    cnt += ab[0][i-1];
                    answer += cnt;
                } else {
                    answer += ab[0][i-1];
                }
            }
            return house(k_, n_);
        }
        return answer;
    }
}
