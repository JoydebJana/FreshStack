/*
Implementation of Your own Stack Using Linked List
*/
import java.util.*;

public class UsingLinkedList{
    
    static class Stack{
        
        class Node{
            int data;
            Node next;
        }
        Node top;
        // Constructor BcZ when we are gonna to create an Object of "Stack" class Then it will initialized the Size of Your Stack
        Stack(){
            top = null;
        }
        // Push Function 
        void push(int data){
            Node temp = new Node();
            if(temp!=null){
                temp.data = data;
                temp.next = top;
                top = temp;
            }
            else{
                System.out.println("Stack Overflow");
            }
        }
        //Pop Function 
        void pop(){
            if(top==null){
                System.out.println("Stack Underflow");
                return;
            }
            else{
                top = top.next;
            }
        }
        // Peek Function
        int peek(){
            if(top==null){
                return -1;
            }
            else{
                return top.data;
            }
        }
        boolean isEmpty(){
            return (top==null);
        }
        //print Function
        void print(){
            Node temp = top;
            if(temp==null){
                System.out.println("Empty Stack");
                return;
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main (String[] args) {
    Stack st = new Stack();
    st.push(5);
    st.push(6);
    st.print();
    }
}