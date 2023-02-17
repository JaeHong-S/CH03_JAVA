package ch03;
import java.util.Scanner; // import 9장
public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("문자열을 입력하세요");
			str = sc.nextLine(); //한 줄 단위로 읽음, enter 포함
			System.out.println("입력한 문자열 : "+str);
			if(str.equals("x")) //equals : 문자열이 같다. ('==' 는 숫자)ㅇ
				break; // 반복문 종료 
		}
		while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}

}
