package practice;

public class LinkedListPractice {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	void traverse() {
		Node n = head;
		while(n !=null) {
			System.out.print(n.data +" -> ");
			n = n.next;
		}
	}

//Insert node at the beginning of the linked list	
	Node insertHead(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
		return newNode;
		
	}
	
//Insert node at the tail of the linked list	
	Node insertTail (int l) {
		Node last = new Node(l);
	
		Node n =head;
		while (n.next != null) {
			n = n.next;
		}
		 n.next = last;
		return n;
	}

//Insert node at any nth node of the linked list	
	Node insertNthNode(int data, int n) {
		Node temp1 = new Node(data);
		Node temp2 = head;
		for (int i = 0; i < n -2; i++) {
			temp2 = temp2.next;
		}
		temp1.next = temp2.next;
		temp2.next = temp1;
		return temp2;
	}
	
//Delete nth Node
	
	Node deleteNode(int n) {
		
		if(n == 1) {
			Node temp = head;
			temp = temp.next;
			head = temp;
			return temp;
		}
		else {
			
		Node temp1 = head;
				
		for(int i = 0; i <  n - 2; i++) {
			temp1 = temp1.next;
		}
		Node temp2 = temp1.next;
		temp1.next = temp2.next;
		
		return temp1;
	}
	}
	
	public static void main(String[] args) {

		LinkedListPractice list = new LinkedListPractice();
		
		list.head = new Node(2);
		Node second = new Node(4);
		Node third = new Node(6);
		
		list.head.next = second;
		second.next = third;
		
		//list.traverse();
		
		list.insertTail(10);
		
	//	list.traverse();

		list.insertHead(1);

		//list.traverse();
		
		list.insertNthNode(5, 3);
		
		list.deleteNode(5);
		list.traverse();
	}
}
