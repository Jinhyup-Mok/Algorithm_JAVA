import java.util.Scanner;

public class 소수구하기_ {
	public static void main(String[] args){

		int i,j; // 반복문 변수 선언
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt(); // 작은 값
		int N = scan.nextInt(); // 큰 값
		
		int [] arr = new int [N + 1];
		//큰 값에 맍는 배열 크기를 선언해준다.
		
		for(i = 0; i <= N; i++) {
			arr[i] = 0;
		}//배열값 초기화
		
		arr[1] = 1; // 1은 소수가 아님
		//때문에 소수의 배수들을 모두 1로 바꿈
		
		for (i = 2; i < N + 1; i++) {
			if(arr[i] == 0) { // 배열값이 0이면 소수의 가능성 있음
				if((int)Math.pow(i, 2) > 1000000){
					break; // 해당 i의 값을 제곱하여 범위가 넘어가면 비교 불필요 종료
				} else {
					for (j = (int)Math.pow(i,2); j < N + 1; j = j + i) {
						// j 값은 i의 제곱수로 초기화함
						// 최대범위까지 체크
						// 이후 j를 다시 배수값을 더해서 초기화
						arr[j] = 1; 
						// 1은 소수가 아님
						// 1이 되는 값은 출력안함
					}// j ->for문 종료
				}
			}
		}// i ->for문 종료
		//초기 주어진 작은수 부터 큰수까지 1이 아닌 위치를 출력
		for (i = M; i < N + 1; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}

