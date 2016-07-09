import java.util.Scanner;
public class POJ1046 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int[][] RGBTarget = new int[16][3];
		while (input.hasNext()) {
			int R = input.nextInt();
			int G = input.nextInt();
			int B = input.nextInt();
			if (R == -1 && G == -1 && B == -1) break;
			if (count < 16) {
				RGBTarget[count][0] = R;
				RGBTarget[count][1] = G;
				RGBTarget[count][2] = B;
				count++;
			} else {
				int[] c = new int[3];
				c[0] = R;
				c[1] = G;
				c[2] = B;
				double min = 99999;
				int[] map = new int[3];
				for (int i = 0; i < 16; i++) {
					int[] target = new int[3];
					for (int j = 0; j < 3; j++) {
						target[j] = RGBTarget[i][j];
					}
					double dist = getDistance(c, target);
					if (dist < min) {
						min = dist;
						map = target;
					}
				}
				System.out.println("(" + R + "," + G + "," + B + ")"+ " maps to " + "(" + map[0] + "," + map[1] + "," + map[2] + ")");
			}

		}	

	}

	public static double getDistance(int[] c1, int[] c2) {
		return Math.sqrt(Math.pow(c1[0] - c2[0], 2) + Math.pow(c1[1] - c2[1], 2) + Math.pow(c1[2] - c2[2], 2));
	}
}