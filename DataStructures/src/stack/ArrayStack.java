package stack;


public class ArrayStack<E> implements Stack<E>{
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    public ArrayStack(){this(CAPACITY);}
    public ArrayStack(int capacity){

        data = (E[]) new Object[capacity];
    }
    public int size(){return (t+1);}
    public boolean isEmpty() {return (t==-1);}
    public void push(E e) throws IllegalStateException{
        if (size() == data.length) throw new IllegalStateException("stack.stack is full");
        data[++t] =e;
    }
    public E top(){
        if (isEmpty()) return null;
        return data[t];
    }
    public E pop(){
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
    public static <E> void reverse(E[] a){
        Stack<E> buffer = new ArrayStack<>(a.length);
        for (int i=0;i<a.length;i++)
            buffer.push(a[i]);
        for (int i=0;i<a.length;i++)
            a[i] = buffer.pop();
    }
}
