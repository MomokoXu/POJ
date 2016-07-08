package momoko;
import java.util.Scanner;
public class POJ1005 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 0; i < input; i++) {
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			double r = (double)Math.sqrt(x * x + y * y);
			double s = (double)(Math.PI * r * r);
			int result = (int)s / 50 /2;
			System.out.println("Property " + (i + 1) + ": This property will begin eroding in year " + (result + 1) + ".");
		}
		System.out.println("END OF OUTPUT.");
		scan.close();
	}

}

