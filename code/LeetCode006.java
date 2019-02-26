package leetCode;

public class LeetCode006 {
	public String convert(String s, int numRows) {
		if (numRows <= 1) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		int margin = 2 * numRows - 2;
		int strLen = s.length();
		for (int i = 0; i < numRows; i++) { // ����
			for (int j = 0; i + j * margin < strLen; j++) {
				sb.append(s.charAt(i + j * margin));
				if (i > 0 && i < numRows - 1 && (j + 1) * margin - i < strLen) {// ��������0��(numRows-1)֮��ʱ
					sb.append(s.charAt((j + 1) * margin - i));
				}
			}
		}
		return sb.toString();
	}
}
