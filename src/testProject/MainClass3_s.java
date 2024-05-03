package testProject;

public class MainClass3_s {

	public static void main(String[] args) {
		
		// java의 if 문 형식
//		if  (10 > 50) {
//			System.out.println("10은 5보다 크다");
//		} else {
//			System.out.println("10은 50보다 작다");
//		}

		int num1 = 100;
		int num2 = 100;
		if (num1== num2) {    // 숫자값을 비교할때는 부등호를 사용(==)
			System.out.println("축하합니다! 100점 입니다!");
		} 
		
		String str1 = "KOREA";
		String str2 = "KOREA";
		
		if  (str1.equals(str2))  {   // 문자열을 비교할때는 == 쓰지말고, equals()로 비교 해야함
			System.out.println("당신은 한국인 입니다!");
		}

	}

}
