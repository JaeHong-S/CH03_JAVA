package ch03;
public class If3 {
	public static void main(String[] args) { 
//		Integer.parseInt args[0]에 들어있는 값을 정수로 변경하라
		int score = Integer.parseInt(args[0]); // 6, -6
		if (score > 60) { 
			System.out.println("합격 : "+score);
			System.out.println("축하");
		} else {
			System.out.println("불합격 : "+score);
			System.out.println("꺼져");
		}
	}
}