package ch03;

public class Math1 {
	public static void main(String[] args) {
		System.out.println((int)(Math.random()* 100) + 1);
//		math.random 0과 1사이의 랜덤 실수(0<= 값 < 1), 출력할때 마다 바뀐다. 랜덤이니까
//		math.random * 100 : 0 ~ 99
//		math.random * 100 + 1 : 1 ~ 100
	}

}
