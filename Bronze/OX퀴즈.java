import java.util.Scanner;

public class OX퀴즈 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] ox = new String[80];
        for(int i=0;i<ox.length;i++){ // 배열의 길이 length로 모두 구하자!
            ox[i] = scan.next();
        }
        int[] sum = new int[ox.length];
        int answer = 0;

        for(int i=1;i<=ox.length;i++){
            if(ox[i-1] == "X") sum[i-1] = 0;
            else sum[i-1] += 1;
            answer += sum[i-1];
        }
        System.out.println(answer);
    }
}
