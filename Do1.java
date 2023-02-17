package ch03;

public class Do1 {
	public static void main(String[] args) {
		int i = 0;
		do {// 조건에 관계없이 일단 실행
			System.out.printf("안녕%d\n", i);
			i++; // 조건을 변경하지 않으면 무한 루프
		}
		while(i < 10); // 조건이 참이면 계속 실행하고 거짓이면 종료
		
	}

}
