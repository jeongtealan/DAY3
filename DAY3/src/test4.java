import java.util.Scanner;
public class test4 {
public static void main(String[] args) {
	int a;
	String c;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("점수를 입력하세요.");
	a = scanner.nextInt();
	
	if(a >= 90) {
		System.out.println("A");
	}
	else if(a >= 80) {
		System.out.println("B");
	}
	else if(a >= 70) {
		System.out.println("C");
	}
	else if(a >= 60) {
		System.out.println("D");
	}
	else {
		System.out.println("F");
	}
}
}
