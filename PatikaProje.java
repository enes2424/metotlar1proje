public class PatikaProje {

	public static void main(String[] args) {
		System.out.println(isPalindrome(9889));
	}

	private static boolean isPalindrome(int num) {
		String strNum = "" + num;
		int length = strNum.length();
		for (int i = 0; i < length / 2; i++) {
			if (strNum.charAt(i) != strNum.charAt(length - i - 1)) return false;
		}
		return true;
	}

}
