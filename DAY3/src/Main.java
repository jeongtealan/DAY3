import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("A�� ����?");
	int A = in.nextInt();
	System.out.println("B�� ����?");
	int B = in.nextInt();
	
	in.close();
	
	System.out.println("��� ����"+(A+B));
	System.out.println("��� ����"+(A-B));
	System.out.println("��� ����"+(A*B));
	System.out.println("��� ����"+(A/B));
	System.out.println("��� ����"+(A%B));
}
}
