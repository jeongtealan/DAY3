import java.util.Scanner;
public class test6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�ð��� �Է��ϼ���.");
		int H = in.nextInt();
		System.out.println("���� �Է��ϼ���.");
		int M = in.nextInt();
		in.close();
		
		if(M < 45) {
			H--;
			M= 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
	}
		else {System.out.println(H + " " + (M - 45));
		}
	}
}
