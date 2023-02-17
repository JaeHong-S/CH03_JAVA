package ch03;

import java.io.IOException;

public class Do3 {
	public static void main(String[] args) throws IOException {
		int num = 0;
//		do-while을 사용하면 원하는 짝수를 구할 때까지 반복하여 사용
		do {
//			 7을 입력하고 enter를 사용, \r(CR)\n(LF)
//			CR(13) : 커서를 맨 앞으로, LF(10) 줄바꿈
//			num = System.in.read() - '0'; 문자 하나만 입력
			System.out.println("짝수를 입력하세요");
			num = System.in.read() - '0';
			System.in.read();
			System.in.read();
			System.out.println(num);
		}
		while (num % 2 != 0); // 짝수면 종료해라
		System.out.println("입력한 짝수 : " +num);
	}
}
