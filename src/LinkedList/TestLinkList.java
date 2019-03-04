package LinkedList;

import sort.redix;

/**
 * ��������
 * 
 * @author xyg
 *
 */
public class TestLinkList {
	static Node head = new Node();

	/**
	 * �������������
	 *
	 * @param value
	 *            Ҫ��ӵ�����
	 */
	public static void addData(int value) {

		// ��ʼ��Ҫ����Ľڵ�
		Node newNode = new Node(value);

		// ��ʱ�ڵ�
		Node temp = head;

		// �ҵ�β�ڵ�
		while (temp.next != null) {
			temp = temp.next;
		}

		// �Ѿ�������ͷ�ڵ�.nextΪnull������ˡ�
		temp.next = newNode;

	}

	/**
	 * ��������
	 *
	 * @param head
	 *            ͷ�ڵ�
	 */
	public static void traverse(Node head) {

		// ��ʱ�ڵ㣬���׽ڵ㿪ʼ
		Node temp = head.next;

		while (temp != null) {

			System.out.println(temp.data);

			// ������һ��
			temp = temp.next;
		}
	}

	/**
	 * ��������
	 * 
	 * @param head
	 *            ͷ�ڵ�
	 * @return ������
	 */
	public static int length(Node head) {
		int len = 0;
		Node temp = head;
		while (temp.next != null) {
			len++;
			temp = temp.next;
		}
		return len;
	}

	/**
	 * �����������������ڵ�
	 * 
	 * @param head
	 *            ͷ�ڵ�
	 * @param index
	 *            Ҫ�����λ��
	 * @param value
	 *            Ҫ�����ֵ
	 */
	public static void insertNode(Node head, int index, int value) {
		// ��������ֵ�ķ�Χ
		if (index < 1 || index > length(head)) {
			System.err.println("����ֵ��Ч");
			return;
		}
		// ��ʱ�ڵ㣬ָ��ͷ�ڵ�
		Node temp = head;
		// Ҫ����Ľڵ�
		Node insNode = new Node(value);
		// ��¼��ǰ�ڵ�����
		int current = 0;
		// ����
		while (temp.next != null) {
			// �ҵ�����Ϊindex-1�Ľڵ㣬��ǰ����
			if (current == index - 1) {
				// �ı�ָ��
				insNode.next = temp.next;
				temp.next = insNode;
				return;
			}
			// �����Ĳ���
			current++;
			temp = temp.next;
		}
	}

	/**
	 * ��������ɾ������ڵ�
	 * 
	 * @param head
	 *            ͷ�ڵ�
	 * @param index
	 *            Ҫɾ��������
	 */
	public static void delNode(Node head, int index) {
		// ��������ֵ�ķ�Χ
		if (index < 1 || index > length(head)) {
			System.err.println("����ֵ��Ч");
			return;
		}
		Node temp = head;
		int current = 0;
		// ����
		while (temp.next != null) {
			// �ҵ���ɾ���ڵ����һ�ڵ�
			if (current == (index - 1)) {
				// �ı�ڵ��ָ���ϵ
				temp.next = temp.next.next;
				return;
			}
			current++;
			temp = temp.next;
		}
	}

	/**
	 * ��������
	 * 
	 * @param head
	 *            ͷ�ڵ�
	 */
	public static void sort(Node head) {
		Node i = null;
		Node j = null;
		for (i = head.next; i.next != null; i = i.next) {
			for (j = head.next; j.next != null; j = j.next) {
				if(j.data>j.next.data){
					int temp = j.data;
					j.data = j.next.data;
					j.next.data = temp;
				}
			}
		}
	}
	
	public static void reverse(Node head){
		
	}

	public static void main(String[] args) {
		addData(5);
		addData(4);
		addData(3);
		addData(2);
		addData(1);
		//insertNode(head, 5, 0);
		//sort(head);
		// delNode(head, 0);
		traverse(head);
		length(head);
	}
}
