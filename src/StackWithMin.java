public class StackWithMin {
    private static final int max = 100;
    private int[] raData = new int[max];
    private int top;
    private int[] raMin = new int[max];
    private int topMin;
    
    public void push(int n) {
        raData[top++] = n;
        if (topMin == 0 || raMin[topMin - 1] > n) {
            raMin[topMin++] = n;
        }
    }
    public int pop() {
        int n = -1;
        if (top > 0) {
            n = raData[--top];
            raData[top] = 0;
            if (raMin[topMin - 1] == n) {
                raMin[topMin--] = 0;
            }
        }
        return n;
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public int min() {
        return topMin > 1 ? raMin[topMin - 1] : -1;
    }
    
    public static void main(String[] args) {
        StackWithMin s = new StackWithMin();
        s.push(30);
        s.push(6);
        s.push(8);
        s.push(10);
        s.pop();
        System.out.println("Min: " + s.min());
        s.push(15);
        s.push(7);
        s.pop();
        s.push(4);
        System.out.println("Min: " + s.min());
    }
}