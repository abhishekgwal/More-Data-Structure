// Linked List Palindrome

public class LinkedListPalindrome {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}


	Node reverse(Node node) {

		Node head = null;
		while (node != null) {
			Node n = new Node(node.data);
			n.next = head;
			head = n;
			node = node.next;
		}
		return head;

	}

	boolean isEqual(Node LinkedList1, Node LinkedList2) {
		
		System.out.println(LinkedList2.data);
		System.out.println(LinkedList2.next.data);
		System.out.println(LinkedList2.next.next.data);
		System.out.println(LinkedList2.next.next.next.data);
		System.out.println(LinkedList2.next.next.next.next.data);
		//System.out.println(LinkedList2.next.next.next.next.next.data);
		
		while (LinkedList1 != null && LinkedList2 != null) {
			
			System.out.println("Linked List 1 - "+LinkedList1.data);
			System.out.println("Linked List 2 - "+LinkedList2.data);
			
			if (LinkedList1.data != LinkedList2.data)
				return false;
			else {
				LinkedList1 = LinkedList1.next;
				LinkedList2 = LinkedList2.next;
			}

		}
		return true;

	}
// LL1 : head --> 2 --> 4 --> 6 --> 1 --> 5 --> null
	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		LinkedListPalindrome list = new LinkedListPalindrome();
		list.head = new Node(3);
		Node second = new Node(2);
		Node third = new Node(1);
		Node fourth = new Node(4);
		Node fifth = new Node(6);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Orignal List ");
		list.printList(head);

		System.out.println("Reverse List ");
		Node res = list.reverse(head);
		list.printList(res);
		
		boolean palindrome = list.isEqual(head, res);
		System.out.println(palindrome);

	}

}
