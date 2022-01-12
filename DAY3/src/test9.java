import java.util.Scanner;
public class test9 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("A값은");
	int A = scanner.nextInt();
	System.out.println("B값은");
	int B = scanner.nextInt();
	System.out.println("C값은");
	int C = scanner.nextInt();
	
	if((A<B&&B<C)||(C<B&&B<A)){
		System.out.println("중간값은"+B);
	}
		else if((B<A&&A<C)||(C<A&&A<B)) {
			System.out.println("중간값은"+A);
		}
			else {
				System.out.println("중간값은"+C);
			}
			
			scanner.close();
		}
	}
