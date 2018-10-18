package leetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode870 {
	public static int[] advantageCount(int[] A, int[] B) {
		int length = A.length, left = 0, right = length - 1;
		int[] result = new int[length];
		Arrays.sort(A);// ��A����
		PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {// ����һ���Ƚ�����ͨ������ĵ�һ��Ԫ�صĴ�С���бȽ�
			public int compare(int[] o1, int[] o2) {
				return o2[0] - o1[0];
			}
		});
		for (int i = 0; i < length; i++) {// ������ƴ洢B��Ԫ�ؼ�����
			queue.add(new int[] { B[i], i });
		}
		while (!queue.isEmpty()) {
			int[] member = queue.poll();
			int number = member[0], index = member[1];
			if (A[right] > number) {
				result[index] = A[right--];
			} else {
				result[index] = A[left++];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int A[] = { 12, 24, 8, 32 }, B[] = { 13, 25, 32, 11 };
		System.out.println(Arrays.toString(advantageCount(A, B)));
	}
}
