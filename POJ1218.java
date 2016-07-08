import java.util.Scanner;
public class POJ1218 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int numOfLines = input.nextInt();
		for (int k = 0; k < numOfLines; k++) {
			int numOfCells = input.nextInt();
			boolean[] cellStatus = new boolean[numOfCells + 1];
			for (int i = 1; i <= numOfCells; i++) {
				cellStatus[i] = true;
			}
			for(int i = 2; i <= numOfCells; i++) {
				for (int j = i; j <= numOfCells; j+= i) {
					if (cellStatus[j]) {
						cellStatus[j] = false;
					} else {
						cellStatus[j] = true;
					}
				}
			}
			int count = 0;
			for (int i = 1; i <= numOfCells; i++) {
				if (cellStatus[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}