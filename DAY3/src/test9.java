import java.util.Scanner;
public class test9 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("A����");
	int A = scanner.nextInt();
	System.out.println("B����");
	int B = scanner.nextInt();
	System.out.println("C����");
	int C = scanner.nextInt();
	
	if((A<B&&B<C)||(C<B&&B<A)){
		System.out.println("�߰�����"+B);
	}
		else if((B<A&&A<C)||(C<A&&A<B)) {
			System.out.println("�߰�����"+A);
		}
			else {
				System.out.println("�߰�����"+C);
			}
			
			scanner.close();
		}
	}
