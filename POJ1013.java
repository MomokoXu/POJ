import java.util.Scanner;
//import java.util.HashMap;

public class POJ1013 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			int[] map = new int[12];
			String[][] weighting = new String[3][3];
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++)	{
					weighting[j][k] = input.next();
				}
			}

			for (String[] strArray : weighting) {
				if (strArray[2].equals("even")) {
					for (int t = 0; t < strArray[0].length(); t++) {
						map[strArray[0].charAt(t) - 'A'] = '*';
						map[strArray[1].charAt(t) - 'A']= '*';						
					}
				}
				if (strArray[2].equals("up")) {
					for (int t = 0; t < strArray[0].length(); t++) {
						if (map[strArray[0].charAt(t) - 'A'] != '*') {
							map[strArray[0].charAt(t) - 'A']++;
						}

						if (map[strArray[1].charAt(t) - 'A'] != '*') {
							map[strArray[1].charAt(t) - 'A']--;														
						}					
					}
				}
				if (strArray[2].equals("down")) {
					for (int t = 0; t < strArray[0].length(); t++) {
						if (map[strArray[0].charAt(t) - 'A'] != '*') {
							map[strArray[0].charAt(t) - 'A']--;
						}
						if (map[strArray[1].charAt(t) - 'A'] != '*') {
							map[strArray[1].charAt(t) - 'A']++;							
						}						
					}
				}									
			}

			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int max_idx = 0;
			int min_idx = 0;
			for (int k = 0; k < 12; k++) {
				if (map[k] < min && map[k] != (int)'*') {
					min = map[k];
					min_idx = k;
				}
				if (map[k] > max && map[k] != (int)'*') {
					max = map[k];
					max_idx = k;
				}
			}
			if (Math.abs(min) > max) {
				System.out.println((char)(min_idx + 'A') + " is the counterfeit coin and it is light.");

			}


			if (Math.abs(min) < max) {
				System.out.println((char)(max_idx + 'A') + " is the counterfeit coin and it is heavy.");

			}							
		}
	}
}