package ch03;

public class Sw4 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch(month) {
		case 12: case 1 : case 2 : //중첩 switch
			switch(month) {
			case 12 : season = "초"; break;
			case 1 : season = "찐"; break;
			case 2 : season = "늦"; break;
			}
			season += "겨울입니다" ; break;
		case 3 : case 4:  case 5 :
			switch(month) {
			case 3 : season = "초"; break;
			case 4 : season = "찐"; break;
			case 5 : season = "늦"; break;
			}
			season += "봄입니다"; break;
		case 6 : case 7:  case 8 :
			switch(month) {
			case 6 : season = "초"; break;
			case 7 : season = "찐"; break;
			case 8 : season = "늦"; break;
			}
			season += "여름입니다"; break;
			
		case 9 : case 10: case 11 : 
			switch(month) {
			case 6 : season = "초"; break;
			case 7 : season = "찐"; break;
			case 8 : season = "늦"; break;
			}
			season += "겨울입니다"; break;
		default: season = "없는 월입니다";		
		}
		System.out.println("월은 "+month+"이고 계절은 "+season);
	}
}


