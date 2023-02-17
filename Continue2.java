package ch03;

public class Continue2 {
	public static void main(String[] args) {
		k : for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.println("안녕 j : " + j);
//				if (j > 2) continue; //안에 있는 for 의 증감으로 간다
				if (j > 2) continue k;
				System.out.println("안쪽 j : " + j);
			}
			System.out.println("바깥 i : " + i);
		}
	}

}
