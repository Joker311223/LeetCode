package leetCode;

import java.util.LinkedList;

public class LeetCode009 {
	// ��˫�˶���
	public boolean isPalindromeQueue(int x) {
		if (x < 0) {
			return false;
		}
		LinkedList<Integer> queue = new LinkedList<Integer>();
		while (x != 0) {
			queue.offer(new Integer(x % 10));
			x /= 10;
		}
		while (!queue.isEmpty() && (int) queue.peekFirst() == (int) queue.peekLast()) {
			queue.pollFirst();
			queue.pollLast();
		}
		if (queue.size() <= 1) {
			return true;
		} else {
			return false;
		}
	}

	// ��ת��벿������
	public boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0)) {
			return false;
		}
		int reverseNum = 0;
		while (reverseNum < x) {
			reverseNum = reverseNum * 10 + x % 10;
			x /= 10;
		}
		return reverseNum == x || reverseNum / 10 == x;
	}

}
