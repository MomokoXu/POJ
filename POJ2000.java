import java.util.Scanner;

public class POJ2000 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			if (n == 0) break; 
			int total = 0;
			int flag = 0;
			int i;						
			for (i = 1; i + flag <= n; i++) {
				total += (i * i); 	
				flag+=i;				
			}
			total += (n - flag ) * i;		
			System.out.println(n + " " + total);		
		}
	}
}