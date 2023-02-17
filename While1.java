package ch03;

public class While1 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) { //조건 참이면
			System.out.println(i + "안녕");
			i++; // 조건을 변경하는 문장이 없으면 무한 반복
		}
		
	}

}
