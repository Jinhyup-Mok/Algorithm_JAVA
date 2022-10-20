import java.util.Scanner;

public class _2007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int sum = 0;

        for (int i = 0; i < x - 1; i++) {
            sum += month[i]; // 전달 누적 날짜 받기
        }
        sum += y;
        System.out.println(days[sum % 7]);
        // 요일 구하기
        // 누적 날짜를 7로 나눈 나머지로 요일 판단한다 !
    }
}
