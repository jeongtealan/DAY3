import java.util.Scanner;
public class test3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("A����?");
	int A = in.nextInt();
	System.out.println("B����?");
	int B = in.nextInt();
	
	if(A>B)
	{
		System.out.println(">");
	}
	else if(A<B)
	{
		System.out.println("<");
	}
	else
	{
		System.out.println("==");
	}
}
}
