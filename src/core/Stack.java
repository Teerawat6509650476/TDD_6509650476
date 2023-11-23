package core;

public class Stack implements IStack {

	/*@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}*/
	private Object[] elements;
    private int size;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            return null; // or throw an exception based on your design
        }
        return elements[size - 1];
    }

    @Override
    public void push(Object elm) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is Full.");
        }

        if (size > 0 && !elm.getClass().equals(elements[size - 1].getClass())) {
            throw new Exception("All elements in the stack must be of the same type.");
        }

        elements[size] = elm;
        size++;
    }
    
    @Override
    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        Object poppedElement = elements[size - 1];
        size--;
        return poppedElement;
    }

}

