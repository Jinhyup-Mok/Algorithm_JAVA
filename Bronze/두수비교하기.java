import java.util.Scanner;

class 두수비교하기 {
    public static void main(String[] args) {
        int A, B;
        try (Scanner scanner = new Scanner(System.in)) {
            A = scanner.nextInt();
            B = scanner.nextInt();
        }
        if(A > B) {
            System.out.println(">");
        }else if(A < B) {
            System.out.println("<");
        }else if(A == B) {
            System.out.println("==");
        }
    }
}