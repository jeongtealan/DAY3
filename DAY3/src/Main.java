import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("A의 값은?");
	int A = in.nextInt();
	System.out.println("B의 값은?");
	int B = in.nextInt();
	
	in.close();
	
	System.out.println("결과 값은"+(A+B));
	System.out.println("결과 값은"+(A-B));
	System.out.println("결과 값은"+(A*B));
	System.out.println("결과 값은"+(A/B));
	System.out.println("결과 값은"+(A%B));
}
}
