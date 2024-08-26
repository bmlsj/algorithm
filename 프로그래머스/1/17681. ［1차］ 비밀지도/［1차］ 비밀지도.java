class Solution {
   public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < arr1.length; i++) {
			String binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
			String binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');

			StringBuilder tmp = new StringBuilder();

			for (int j = 0; j < binary1.length(); j++) {
				if (binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
					tmp.append('#');
				} else {
					tmp.append(' ');
				}
			}

			answer[i] = tmp.toString();
		}
		return answer;
	}
}