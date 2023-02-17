package ch03;

public class Break2 {
	public static void main(String[] args) {
		k : for(int i = 1; i <= 10; i++) { //k : label
			for(int j = 1; j <= 10; j++) {
				if(j > 4) break k;
				System.out.println("대박 : " + j);
//				if(j > 4) break; //안쪽 for만 종료
				//if(j > 4) break k;
			}
			System.out.println("사건 : " + i );
		}
	}

}
