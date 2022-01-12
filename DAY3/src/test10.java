import java.util.Scanner;
public class test10 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int money, a, b, c, d, e, f, g;
	
	System.out.println("금액을 입력하시오>>");
money = scanner.nextInt();

a = money / 50000;
money = money - (a * 50000);

b = money / 10000;
money = money - (b * 10000);
	
c = money / 1000;
money = money - (c * 1000);

d = money / 100;
money = money - (d * 100);

e = money / 50;
money = money - (e * 50);

f = money / 10;
money = money - (f * 10);

g = money;

System.out.println("오만원권"+a+"매");
System.out.println("만원권"+b+"매");
System.out.println("천원권"+c+"매");
System.out.println("백원"+d+"매");
System.out.println("오십원"+e+"매");
System.out.println("십원"+f+"매");
System.out.println("일원"+g+"매");

scanner.close();
}
}
