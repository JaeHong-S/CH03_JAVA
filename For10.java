package ch03;

import java.util.Scanner;

public class For10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("몇단을 출력하실래요");
			num = sc.nextInt(); //지역변수
			if (num >= 2 && num <= 9) {
				for(int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %d\n", num, i, num*i);
				}
			}
		}
		while(num != 0);
		System.out.println("프로그램 종료");
		sc.close();
		
	}
	
}
