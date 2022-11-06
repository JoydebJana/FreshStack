import java.util.*;

public class UsingArray{
	static class Stack{
		static int length = 5;
		static int top;
		static int[] arr = new int[length];

		// Constructor
		Stack(){
			top = -1;
		}

		// Empty Function
		static boolean isEmpty(){
			return (top==-1);
		}

		// Push Function
		static void push(int data){
			if(top==length-1){
				System.out.println("Stack Overflow");
				return;
			}
			else{
				top++;
				arr[top] = data;
			}
		}

		//Pop Function
		static void pop(){
			if(top==-1){
				System.out.println("Stack Underflow");
				return;
			}
			else{
				System.out.println(arr[top]);
			}
		} 
		// Peek Function
		int peek(){
			if(top==-1){
				System.out.println("Stack is Empty");
				return -1;
			}
			else{
				return arr[top];
			} 
		}
		// Print Function
		static void print(){
			for(int i=top;i>-1;i--){
				System.out.print(arr[i]+" ");
			}
		}

	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.peek());
	}
}