package three;
import java.util.Scanner;

public class nineteen {

	public static void main(String[] args) {
		int a,b,c;
		int sum;
		Scanner input = new Scanner(System.in);
		a= input.nextInt();
		b= input.nextInt();
		c= input.nextInt();
		if((a+b<=c)||(a+c<=b)||(b+c<=a)) {
			System.out.print("���벻�Ϸ�");
			
		}
		sum=a+b+c;
		System.out.print("�����ε��ܳ�Ϊ:"+sum);
	}
}
