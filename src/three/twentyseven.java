package three;
import java.util.Scanner;
public class twentyseven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point`s x- and y-cooordinates:  ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double a = (200 - x ) / 200 * 100;
		double b = (100 - y ) / 100 * 200;
		if(x <= b && y <= a)
			System.out.println("The point is in the triangle");
		else
			
		    System.out.println("The point is not in the triangle");
	}
}
