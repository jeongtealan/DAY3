import java.util.Scanner;
public class test7 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("N의 값을 입력하세요.");
	int a = in.nextInt();
	
	in.close();
	
	for(int i = 1; i<10;i++) {
		System.out.println(a+" * "+i+" = "+(a*i));
	}
}
}
