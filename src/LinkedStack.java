// This program is a complete representation of stack using Linked List. We have done push, pop and peek.

public class LinkedStack {

	static Node top = null;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			d = data;
			next = null;
		}
	}

	void push(int x) {
		Node temp = new Node(x);
		temp.data = x;
		temp.next = top;
		top = temp;
	}
	void peek() {
		if(top == null)
			System.out.println("No top element. Stack Empty");
		else
		System.out.println("Top element in stack - "+top.data);
	}
	
	void pop() {
		top = top.next;
		if(top == null){
			System.out.println("Stack Empty");
		}
		}

	void print() {
		Node temp = top;
		System.out.print("Stack is ");
		while (temp != null) {
			System.out.print(temp.data+ "  ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		LinkedStack list = new LinkedStack();
		list.push(10);
		list.push(1);
		list.push(6);
		list.push(16);
		list.print();
		list.pop();
		list.print();
		list.push(21);
		list.print();
		list.peek();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.print();
		list.peek();
		list.push(10);
		list.push(20);
		list.push(60);
		list.push(1);
		list.print();
		list.peek();
		list.pop();
		list.print();
	}

}
