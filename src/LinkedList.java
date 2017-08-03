// Java program to delete a given node in linked list under given constraints

class LinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static Node reverseLinkedList(Node p) {
		if (p.next == null) {
			head = p;
			return p;
		}

		Node q = reverseLinkedList(p.next);
		p.next.next = p;
		p.next = null;
		return q;
	}

	public static void printList(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.head = new Node(7);
		Node second = new Node(3);
		Node third = new Node(1);
		Node fourth = new Node(6);
		Node fifth = new Node(9);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("List 1 ");
		Node LinkedList1 = head;
		printList(LinkedList1);

		System.out.println("Reverse List ");
		head = list.reverseLinkedList(head);
		list.printList(head);

	}

}
