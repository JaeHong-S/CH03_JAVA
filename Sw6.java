package ch03;

public class Sw6 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		int etc = score / 10;
		
		switch(etc) {
		case 10 : case 9 : {
			grade = "A";
			break;
		}
		case 8 : {
			grade = "B";
			break;
		}
		case 7 : {
			grade = "C";
			break;
		}
		case 6 : {
			grade = "D";
			break;
		}
		default:
			grade = "F";
		}
		System.out.println(grade);
	}

}
