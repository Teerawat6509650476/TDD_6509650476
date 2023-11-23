package core;

public interface IStack {
	int getSize();//TC1
	boolean isEmpty();//TC1
	boolean isFull(); //TC2, TC5
	Object top(); //TC2
	void push (Object elm) throws Exception; //TC2, TC3
	Object pop()throws Exception;//TC4

}