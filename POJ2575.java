package momoko;
import java.util.Scanner;

public class POJ2575 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			int n = scan.nextInt();
			int[] arr = new int[n];
			for  (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			boolean res = true;
			int[] count = new int[n];
			int diff = 0;
			int diffAb = 0;
			for (int i = 0; i < n - 1; i++) {
				diff = arr[i + 1] - arr[i];
				if (diff > 0) diffAb = diff;
				else diffAb = - diff;
				
				if (diffAb > n - 1) {
					res = false;
					break;
				}
				else count[diffAb]++;	
				if (count[diffAb] != 1) {
					res = false;
				}
			}
			if (res) System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
		scan.close();
	}
}


///poj3299,poj2159,poj2739,poj1083,poj2262,poj1503,poj3006,poj2255,poj3094