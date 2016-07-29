public class POJ1316 {
	public static void main(String[] args) {
		boolean[] nums = new boolean[10000];
		for (int i = 1; i < 10000; i++) {
			int tmp = i + i%10 + (i/10)%10 + (i/100)%10 + i/1000;
			if (tmp < 10000) nums[tmp] = true;
		}

		for (int i = 1; i < 10000; i++) {
			if (nums[i] == false) System.out.println(i);
		}
	}
}