public class Stack {

	int top = -1;
	int a[] = new int[4];

	void push(int x) {
		if(top == 3) {
			System.out.println("Stack Full. No more space to PUSH");
			return;
		}
		top = top + 1;
		a[top] = x;
		System.out.println("Push "+a[top]+ " is inserted");
	}
	
	int min() {
		int min = a[top];
		for (int i = 0; i <= top; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}

	void pop() {
		if (top ==-1) {
			System.out.println("Stack Empty");
			return;
		}
		System.out.println("Pop "+a[top]+ " is removed");
	//	a[top] = 0;
		top = top - 1;
}

	int peek() {
		return a[top];
	}
	
	boolean isEmpty() {
		
		if(top == -1)
			return true;
		else return false;
		
	}
	
	void print() {
		System.out.print("Stack = ");
		for (int i = 0; i <=top; i++)
		System.out.print(a[i] + "  ");
		System.out.println();
	}

	public static void main(String[] args) {

		Stack obj1 = new Stack();
		obj1.push(4);
		obj1.push(2);
		obj1.push(8);
		obj1.pop();
		obj1.push(5);
		obj1.push(7);
		obj1.print();
		System.out.println("Top Element in stack is = "+obj1.peek());
		obj1.pop();
		obj1.pop();
		obj1.print();
		obj1.pop();
		obj1.pop();
		System.out.println("Is Stack Empty ? "+obj1.isEmpty());
		obj1.push(10);
		System.out.println("Minimum Element ="+obj1.min());
		obj1.push(20);
		obj1.push(30);
		obj1.push(50);
		obj1.push(5);
		obj1.print();
		System.out.println("Top Element in stack is = "+obj1.peek());
		System.out.println("Minimum Element ="+obj1.min());
		
		}

}
