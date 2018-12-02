package leetCode;

public class LeetCode019 {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode firstNode = head, secondNode = head;// firstNodeָ����ǵ�����n���ڵ��ǰһ���ڵ�
		int i = 1;
		while (i < n + 1) {
			if (secondNode.next != null) {
				secondNode = secondNode.next;
				i++;
			} else {// ��Ϊ������n��֤����Ч�ģ�������㣺������������û�е�������k���ڵ�ʱ��ֱ��ɾ��ͷ�ڵ㲢����
				head = head.next;
				return head;
			}
		}
		while (secondNode.next != null) {
			firstNode = firstNode.next;
			secondNode = secondNode.next;
		}
		firstNode.next = firstNode.next.next;
		return head;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		ListNode node = removeNthFromEnd(a, 1);
		while (node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
	}
}
