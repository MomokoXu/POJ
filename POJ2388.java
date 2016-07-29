import java.util.Scanner;
//sort
public class POJ2388 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] milkAmounts = new int[n];
		for (int i = 0; i < n; i++) {
			milkAmounts[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (milkAmounts[i] >= milkAmounts[j]) {
					int tmp = milkAmounts[i];
					milkAmounts[i] = milkAmounts[j];
					milkAmounts[j] = tmp;
				} 
			}
		}
		int mid = n / 2;
		System.out.println(milkAmounts[mid]);		
	} 
}