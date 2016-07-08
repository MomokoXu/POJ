package momoko;
import java.util.Scanner;

public class POJ1004 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] money = new double[12];
		double sum = 0.00;
		double arg = 0.00;
		for (int i = 0; i < 12; i++){
			money[i] = input.nextDouble();
			sum += money[i]; 
			}
		arg = sum / 12;
		System.out.print("$" + Math.round(arg * 100) / 100.0);
		input.close();
		}
	}
