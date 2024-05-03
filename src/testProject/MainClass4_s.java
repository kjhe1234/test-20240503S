package testProject;

public class MainClass4_s {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		int result1 = ++x;  // x = x+1
		int result2 = y++;  // y = y+1
		
						
		
		System.out.println(result1);  // 11
		System.out.println(x);  // 11
		System.out.println(result2);  // 20
		System.out.println(y);  // 21
		
		int a = 1;
		int b = 1;
		int result3 = ++a + 10;
		System.out.println(result3);  // 12
		System.out.println(a);  // 2
		
		int result4 = b++ + 10;
		System.out.println(result4);  // 11
		System.out.println(b);  // 2
		
		int sum = 0;
		int i = 10;
		
		sum = sum + i;
		sum += i; // sum = sum + i;
		
		sum = sum * i;
		sum *= i; // sum = sum * i
		
		
		
		int x1 = 10;
		int y1 = 5;
		
		System.out.println((x1>7) && (y1<=5));     // true
		System.out.println((x1%3 == 2) || (y1%2 !=1));  // false
		
		
		
		
		

	}

}
