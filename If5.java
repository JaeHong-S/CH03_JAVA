package ch03;

public class If5 {
	public static void main(String[] args) {
		 int money = Integer.parseInt(args[0]);
		 String msg = "";
		 if (money >= 1000000) msg = "비행기";
		 else if (money >= 100000) msg = "KTX";
		 else if (money >= 50000) msg = "택시";
		 else if (money >= 1000) msg = "버스";
		 else msg = "신발";
		 System.out.println(msg+"타세요");
	}
}
