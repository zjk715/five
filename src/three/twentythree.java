package three;
import java.util.Scanner;

public class twentythree {

	public static void main(String[] args) {
		double x,y;
		Scanner input = new Scanner(System.in);
		
		x=input.nextDouble();
		y=input.nextDouble();
		System.out.print("Enter a point with two coordinates:");
		
		if (x<=5&&x>=-5&&y<=2.5&&y>=-2.5) {
			System.out.print("point ("+x+","+y+") is in the rectangle");
		}
		else {
			System.out.print("point ("+x+","+y+") is not in the rectangle");
		}
}

}
