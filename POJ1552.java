import java.util.Scanner;

public class POJ1552 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			if (n == -1) break;
			int count = 0;
			int[] numList = new int[16];
			numList[0] = n;
			for (int i = 1; i < 16; i++) {
				int nextNum = input.nextInt();
				numList[i] = nextNum; 				
				if (nextNum == 0) break;
			}
			for (int i = 0; i < 16; i++) {
				int prev = numList[i];		
				if (prev == 0) break;
				for (int j = i + 1; j < 16; j++) {
					int next = numList[j];		
					if (next == 0) break;
					if (prev == next * 2 || next == 2 * prev) count++;
				}
			}
			System.out.println(count);
		}
	}
}