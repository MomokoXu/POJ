import java.util.Scanner;
// time limit exceed
/*
public class POJ2499 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int t = 1; t <= n; t++) {
			int i = input.nextInt();
			int j = input.nextInt();
			int leftCount = 0;
			int rightCount = 0;
			while (i > 1 || j > 1) {
				if (i > j) {
					leftCount++;
					i -= j;
				} else {
					rightCount++;
					j -= i;
				}
			}
			System.out.println("Scenario #" + t + ":");
			System.out.println(leftCount + " " + rightCount);
			System.out.println();
		}
	}
}
*/

//use division 

public class POJ2499 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int t = 1; t <= n; t++) {
			int i = input.nextInt();
			int j = input.nextInt();
			int leftCount = 0;
			int rightCount = 0;
			int tmp = 0;
			while (!(i == 1 && j == 1)) {
				if (i > j) {
					if (j == 1) tmp = i - 1;
					else tmp = i / j;
					leftCount += tmp;
					i -= tmp * j;
				} else {
					if (i == 1) tmp = j - 1;
					else tmp = j / i;
					rightCount += tmp;
					j -= tmp * i;
				}
			}
			System.out.println("Scenario #" + t + ":");
			System.out.println(leftCount + " " + rightCount);
			System.out.println();
		}
	}
}