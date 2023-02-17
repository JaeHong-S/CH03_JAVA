package ch03;

public class While2 {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		//while문을 이용하여 1부터 10까지 합게
		while (i <= 10) {
			sum += i;
			i++;
			System.out.printf("%d 까지 합계 : %d\n", i - 1, sum);
		}
		System.out.printf("10까지 합계 : %d", sum);
	}

}
