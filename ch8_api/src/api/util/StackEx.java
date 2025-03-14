package api.util;

import java.util.List;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        List<String> list = new Stack<>();// List 메서드
        // List 메서드

        Stack<String> stack = new Stack<>();

        stack.push("사과");
        stack.push("감");
        stack.push("바나나");
        stack.push("딸기");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

}
