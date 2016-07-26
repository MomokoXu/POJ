import java.util.Scanner;

public class POJ1207 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			int x = input.nextInt();
			int y = input.nextInt();
			int i,j;
			if (x < y) {
				i = x;
				j = y;
			}
			else {
				i = y;
				j = x;
			} 
			int tmp;
			int count;
			int max = Integer.MIN_VALUE;
			for (int t = i; t <= j; t++) {
				if (t == 1) {
					max = 1;
				} else {
					tmp = t;
					count = 1;
					while (tmp != 1) {
						if (tmp % 2 == 0) {
							tmp = tmp / 2;
							count++;
						}
						else {
							tmp = 3 * tmp + 1;
							count++;
						}
					}
					if (count > max) max = count;
				}
			}
			System.out.println(x + " " + y + " " + max);
		}
	}
}