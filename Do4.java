package ch03;

import java.io.IOException;

public class Do4 {
	public static void main(String[] args) throws IOException {
		int num = 0, i = 1;
		System.out.println("몇 단");
		num = System.in.read() - '0';
		System.out.println("구구단" + num + "단");
		do {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			i++;
		}
		while(i <= 9);
		
	}

}
