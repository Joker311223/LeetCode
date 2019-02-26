package leetCode;

import java.util.HashMap;

public class LeetCode003 {
	public int lengthOfLongestSubstring(String s) {
		int result = 0, start = 0, end = 0;
		int sLen = s.length();
		HashMap<Character, Integer> map = new HashMap<>();// key���ַ���value���ַ����ڵ�λ��
		while (start < sLen && end < sLen) {
			if (map.containsKey(s.charAt(end))) {
				start = Math.max(map.get(s.charAt(end)) + 1, start);// ���ǵ����ĵ����
			}
			map.put(s.charAt(end), end);
			result = Math.max(result, end - start + 1);
			end++;
		}
		return result;
	}
}
