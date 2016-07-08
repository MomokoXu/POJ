import java.util.Scanner

public class POJ1979 {

	public static void main(String[] args) {
		while (True) {
			Scanner input = new Scanner(System.in);
			// read in W and H
			int numberOfTilesInXDirection = input.nextInt();
			int numberOfTilesInYDirection = input.nextInt();
			if (numberOfTilesInXDirection == 0 && numberOfTilesInYDirection == 0)  break;
			// read in data
			String[] dataSet = new String[numberOfTilesInYDirection];
			for (int i = 0; i < numberOfTilesInYDirection; i++) {
				dataSet[i] = input.nextLine();
			}


		}
	}
}