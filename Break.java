package ch03;

public class Break {
	public static void main(String[] args) {
		int sum = 0, i =1;
		while(true) {
			sum += i;
			i++;
			if(i > 50)
			break;
		}
		System.out.println("50까지의 합 : " + sum);
	}
}
