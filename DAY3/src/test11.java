import java.util.Scanner;
public class test11 {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	int num;
	System.out.println("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
	num = a.nextInt();
	if(num == 3 || num == 6 || num == 9) {
		System.out.println("¹Ú¼öÂ¦");
	}
	else if(num >= 10) {
		if((num %10) == 3||(num %10) == 6||(num %10) == 9) {
			if(num/10 == 3||num/10 == 6||num/10 == 9)
				System.out.println("¹Ú¼öÂ¦Â¦");
			else
				System.out.println("¹Ú¼öÂ¦");
		}
		else if(num/10 == 3||num/10 == 6||num/10 == 9)
			System.out.println("¹Ú¼öÂ¦");
	}
	
}
}
