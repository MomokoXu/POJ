/*
package momoko;
import java.util.Scanner;
public class POJ1003 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			double input = scan.nextFloat();
			if (input == 0.0) {
				return;
				}
			if (input <= 0.5) {
				System.out.println("1 card(s)");
				continue;
				}
			double sum = 0.5;
			int base = 2;
			int res = 1;
			while(sum < input){
				base++;
				res++;
				sum+= 1.0 / base;
				}
			System.out.println(res + " card(s)");	
			}
		scan.close();
		}
	}
*/

import java.util.Scanner;

public class POJ1003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			double num = input.nextDouble();
			if(num == 0.0) break;
			double total = 0.0;
			int count = 0;
			while (total < num) {
				total += 1.0 / (count + 2);
				count++;
			}

			System.out.println(count + " card(s)");
		}
	}
}




































