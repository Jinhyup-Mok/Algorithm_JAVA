import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 수정렬하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> num = new ArrayList<>();
        for(int i=0; i<n; i++) {
            num.add(scan.nextInt());
        }
        Collections.sort(num);
        for(int i=1; i<num.size(); i++) {
            if(num.get(i) == num.get(i-1)) {
                num.set(i-1, 0); 
            }
        }
        for(int i=0; i<num.size(); i++) {
            if(num.get(i) != 0) System.out.println(num.get(i));
        }

    }
}
