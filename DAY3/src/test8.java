import java.util.Scanner;
public class test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, a, b;
		
		System.out.println("2자리수 정수 입력(10~99)>>");
		num = scanner.nextInt();
		
		a = num / 10;
		b = num % 10;
		
		if(a==b) {
			System.out.println("Yse! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		scanner.close();
	}

}
