import java.util.Scanner;
public class test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, a, b;
		
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		num = scanner.nextInt();
		
		a = num / 10;
		b = num % 10;
		
		if(a==b) {
			System.out.println("Yse! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		scanner.close();
	}

}
