import java.util.Scanner;
import java.util.Arrays;

public class POJ1248 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int num = input.nextInt();
			String code = input.next();
			if (num == 0 && code.equals("END")) break;

			char[] codeCharArray = code.toCharArray();
			Arrays.sort(codeCharArray);
			char[] tmp = new char[5];
			boolean flag = false;
			String result = new String();
			for (int i = codeCharArray.length - 1; i >= 0; i--) {
				tmp[4] = codeCharArray[i];
				for (int j = codeCharArray.length - 1; j >= 0; j--) {
					tmp[3] = codeCharArray[j];
					for (int p = codeCharArray.length - 1; p >= 0; p--){
						tmp[2] = codeCharArray[p];
						for (int q = codeCharArray.length - 1; q >= 0; q--) {
							tmp[1] = codeCharArray[q];
							for (int t = codeCharArray.length - 1; t >= 0; t--) {
								tmp[0] = codeCharArray[t];
								if (isCombination(num, tmp)) {
									if (tmp[4] == tmp[3] || tmp[3] == tmp[2] || tmp[2] == tmp[1] || tmp[1] == tmp[0]) {
										continue;
									} else {
										flag = true;
										result = new String(tmp);
										result = new StringBuffer(result).reverse().toString();

										break;
									}	
								}
								if (flag) break;
							}
							if (flag) break;
						}
						if (flag) break;
					}
					if (flag) break;
				}
				if (flag) break;
			}
			if (flag) System.out.println(result);
			else System.out.println("no solution");
		}
	}

	public static boolean isCombination (int tar, char[] charArray) {
		if (charArray.length > 5) return false;
		if (tar == ((int)charArray[4] - 64) - (Math.pow((int)charArray[3] - 64, 2)) 
			+ (Math.pow((int)charArray[2] - 64, 3)) - (Math.pow((int)charArray[1] - 64, 4)) 
			+ (Math.pow((int)charArray[0] - 64, 5))) return true;
		else return false;
	}

}