package testProject;

public class MainClass5_s {

	public static void main(String[] args) {
		
		int score = 85;
		
		if (score >= 90) {
			System.out.println("수!");
			//elif 조건:
		} else if (score >= 80) {
			System.out.println("우!");
		} else if (score >= 70) {
			System.out.println("미!");
		} else if (score >= 60) {
			System.out.println("양!");
		} else {
			System.out.println("가!");
		}

		
		int favor = 4;
		
		switch(favor) {
			case 1:
				System.out.println("안녕!");
				break;
			case 2:
				System.out.println("감사!");
				System.out.println("고맙습니다!");
				break;
			case 3:
				System.out.println("Hi!");
				break;
			default:
				System.out.println("잘가요!");
		}
		
		// 변수의 값이 분리되어 있는 경우(ex : 1,2,3, 중에 1개, A,B,C 중에 하나)
		// switch문이 if문 보다 간결하게 코드 작성 가능
		
		
		String favor1 = "A";
		
			switch(favor1) {
				case "A":
					System.out.println("안녕!");
					break;
				case "B":
					System.out.println("감사!");
					System.out.println("고맙습니다!");
					break;
				case "C":
					System.out.println("Hi!");
					break;
				default:
					System.out.println("잘가요!");
			}
		

			
		
		
		
		
		
	}

}
