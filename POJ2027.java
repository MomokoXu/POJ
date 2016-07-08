package momoko;
import java.util.Scanner;

public class POJ2027 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			if(a < b) {
				System.out.println("NO BRAINS");
			}
			else {
				System.out.println("MMM BRAINS");
			}
		}
		input.close();
	}
}
