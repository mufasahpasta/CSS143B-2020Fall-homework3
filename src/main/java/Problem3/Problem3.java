package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        // !!! must use your ArrayStack or LinkedListStack in problem 1
        // print with the following format. System.out.println() will not pass test.
        ListNode head = list.next;
        Stack<Integer> stack = new LinkedListStack<Integer>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (stack.size() > 0) {
            print.println(stack.pop());
        }
    }
}
