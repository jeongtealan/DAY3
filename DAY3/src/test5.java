import java.util.Scanner;
public class test5 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.println("x�� ���� �Է��ϼ���.");
int x = in.nextInt();
System.out.println("y�� ���� �Է��ϼ���.");
int y = in.nextInt();

if(x > 0) {
	if(y > 0)
		System.out.println(1);
	else if(y < 0)
		System.out.println(4);
}
else {
	if(x < 0)
		if(y > 0)
			System.out.println(2);
		else if(y < 0)
			System.out.println(3);
}
}
}
