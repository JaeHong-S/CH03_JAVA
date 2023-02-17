package ch03;

import java.util.Scanner;

public class For4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요");
		int num = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		
		sc.close();
		}

	}
}
