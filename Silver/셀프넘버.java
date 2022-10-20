public class 셀프넘버 {
    public static void main(String[] args) {
        int[] num = new int[10036];
        for(int i=1; i<10000; i++){
            num[answer(i)] = 1;
            if(num[i]!=1) System.out.println(i);
        } // 이런식으로 결과에 영향을 미치지 않는 특정한 값으로 경우를 나눈다!
    }
    public static int answer(int i) {
        int n = i;
        if(i >= 10000) {n += i / 10000; i %= 10000;}
        if(i >= 1000) {n += i / 1000; i %= 1000;}
        if(i >= 100) {n += i / 100; i %= 100;}
        if(i >= 10) {n += i / 10; i %= 10;}
        return n += i;
    }
}
// 복습 !