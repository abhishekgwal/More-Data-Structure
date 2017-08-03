package practice;

import java.util.Stack;
public class SetOfStacks<T> {

	
	private final int numOfStacks;
    private final int stackCapacity;
    private Stack<T>[] stackArr;
    private int cur;

    public SetOfStacks() {
        numOfStacks = 10;
        stackCapacity = 3;
        stackArr = new Stack[numOfStacks];
        cur = 0;
        stackArr[cur] = new Stack<T>();
    }

    public boolean push(T obj) {
        if(cur == numOfStacks-1 && stackArr[cur].size() == stackCapacity) {
            return false;
        }
        if(stackArr[cur].size() == stackCapacity) {
            stackArr[++cur] = new Stack<T>();
        }
        stackArr[cur].push(obj);
        return true;
    }

    public T pop() {
        // here we add the consideration of empty stack caused by popAt()
        while(cur >= 0 && stackArr[cur].size() == 0) {
            stackArr[cur--] = null;
        }
        if(cur == -1) {
            return null;
        }
        return  stackArr[cur].pop();
    }

    public T popAt(int index) {
        if(index < 0 || index > numOfStacks-1) {
            return null;
        }
        return stackArr[index]==null?null:stackArr[index].pop();
    }

    public static void main(String[] args) {
        SetOfStacks<Integer> sos = new SetOfStacks<Integer>();
        sos.push(1);
        sos.push(2);
        sos.push(3);
        sos.push(4);
        sos.push(5);
        sos.push(6);
        sos.push(7);
        sos.push(8);
        sos.push(9);
        System.out.println(sos.popAt(1));
        System.out.println(sos.pop());
        sos.push(5);
        sos.push(6);
        System.out.println(sos.popAt(0));
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }
}