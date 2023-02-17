package ch03;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int sum = 0;
			System.out.println("몇부터 10까지 더할까요");
			int i = sc.nextInt();
			for(; i <= 10; i++) {
				sum += i;
			}
System.out.println(sum);
sc.close();
		}
	}

}
