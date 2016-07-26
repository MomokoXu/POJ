import java.util.Scanner;

public class POJ2105 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			int[] addressBinary = new int[32];
			int[] addressDecemal = new int[4];
			String address = input.next();
			for (int j = 0; j < addressBinary.length; j++) {
				addressBinary[j] = (int)(address.charAt(j) - 48);
			}

			int t;
			for (t = 0; t < 4; t++) {
			addressDecemal[t] = (int)(Math.pow(2,7)) * addressBinary[t * 8] 
			+ (int)(Math.pow(2,6)) * addressBinary[t * 8 + 1]
			+ (int)(Math.pow(2,5)) * addressBinary[t * 8 + 2]				
			+ (int)(Math.pow(2,4)) * addressBinary[t * 8 + 3]				
			+ (int)(Math.pow(2,3)) * addressBinary[t * 8 + 4]				
			+ (int)(Math.pow(2,2)) * addressBinary[t * 8 + 5]				
			+ (int)(Math.pow(2,1)) * addressBinary[t * 8 + 6]
			+ (int)(Math.pow(2,0)) * addressBinary[t * 8 + 7];				
			}
			System.out.println(addressDecemal[0] + "." + addressDecemal[1] + "." + addressDecemal[2] + "." + addressDecemal[3]);
		}
	}
}