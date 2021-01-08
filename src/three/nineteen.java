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
			System.out.print("输入不合法");
			
		}
		sum=a+b+c;
		System.out.print("三角形的周长为:"+sum);
	}
}
