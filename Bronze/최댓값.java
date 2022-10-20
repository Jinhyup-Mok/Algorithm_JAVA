import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[9];
        for(int i=0;i<9;i++) {
            num[i] = scan.nextInt();
        }
        int max = num[0];
        int cnt = 1; // 첫번쨰 숫자가 최댓값일때를 고려해야함 index 0부터
        for(int j=0;j<9;j++) {
            if(num[j] > max) {
                max = num[j];
                cnt = j+1;
            }
        }
        System.out.println(max + "\n" + cnt);
    }
}
