package StackProblems;

import java.util.Stack;

public class TestStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stackPush(stack);
    //stackPop(stack);
    stackPush(stack);
    stackPeek(stack);
    stachSearch(stack, 5);
    stachSearch(stack, 2);
    stachSearch(stack, 8);


  }

  // push to stack
  static void stackPush(Stack<Integer> stack) {
    for (int i = 0; i < 10; i++) {
      stack.push(i);
    }
  }

  // Pop from stack
  static void stackPop(Stack<Integer> stack) {
    System.out.println("this poped: ");
    for(int i = 0; i < 10; i++) {
      Integer y = (Integer) stack.pop();
      System.out.println(y);
    }
  }

  // show element on TOP of stack
  static void stackPeek(Stack<Integer> stack) {
    Integer data = (Integer) stack.peek();
    System.out.println("this is top of stack: " + data);
  }

  // search stack
  static void stachSearch(Stack<Integer> stack, int data) {
    Integer position = (Integer) stack.search(data);

    if( position == -1) {
      System.out.println("data not in stack: ");
    } else {
      System.out.println("Data is in position: " + position);
    }
  }

}
