import java.util.Scanner;
public class test10 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int money, a, b, c, d, e, f, g;
	
	System.out.println("�ݾ��� �Է��Ͻÿ�>>");
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

System.out.println("��������"+a+"��");
System.out.println("������"+b+"��");
System.out.println("õ����"+c+"��");
System.out.println("���"+d+"��");
System.out.println("���ʿ�"+e+"��");
System.out.println("�ʿ�"+f+"��");
System.out.println("�Ͽ�"+g+"��");

scanner.close();
}
}
