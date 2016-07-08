
import java.util.Scanner;
public class POJ2017 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			if (n == -1) break;
			int t = 0;
			int distance = 0;		
			for (int i = 0; i < n; i++) {
				int speed = input.nextInt();
				int hrs = input.nextInt();
				distance += speed * (hrs - t);
				t = hrs;
			}
			System.out.println(distance + " " + "miles");
		}
	}	
}