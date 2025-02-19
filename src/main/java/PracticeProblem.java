public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String in1, char in2) {
		int count = 0;
		int currPos = 0;
		while (count < 5 && currPos < in1.length()) {
			if (in1.charAt(currPos) == in2) {
				count++;
			}
			currPos++;
		}
		if (count == 5) {
			return currPos + 1;
		}
		return -1;
	}

	public static int countLetter(String in1, char in2) {
		int count = 0;
		for (int i = 0; i < in1.length(); i++) {
			if (in1.charAt(i) == in2) {
				count++;
			}
		}
		return count;
	}

	public static int oddSum(int in1, int in2) {
		int sum = 0;
		int start = Math.min(in1, in2);
		int end = Math.max(in1, in2);
		for (int i = start + 1 - (start % 2); i <= end; i += 2) {
			sum += i;
		}
		return sum;
	}
}
