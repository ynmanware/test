package com.ynm.gms;

import java.util.Stack;

/**
 * @Auther Yogesh Manware
 */
public class WordMachine {

    private Stack<Integer> stack = new Stack<>();

    public String process(String input) throws Exception {
        String[] tokens = input.split("\\s+");

        for (int i = 0; i < tokens.length; i++) {
            //if number, push it
            if (tokens[i].matches("\\d+")) {
                this.stack.push(Integer.valueOf(tokens[i]));
                continue;
            }
            //if duplicate
            if (tokens[i].equals("DUP")) {
                if (!this.stack.empty()) {
                    this.stack.push(this.stack.peek());
                } else {
                    throw new Exception("Stack is Empty, cannot duplicate number");
                }
                continue;
            }

            //if POP
            if (tokens[i].equals("POP")) {
                if (!this.stack.empty()) {
                    this.stack.pop();
                } else {
                    throw new Exception("Stack is Empty, cannot pop");
                }
                continue;
            }

            //if addition
            if (tokens[i].equals("+")) {
                if (this.stack.size() < 2) {
                    throw new Exception("Stack is Empty, cannot pop");
                }
                stack.push(stack.pop() + stack.pop());
                continue;
            }

            //if substraction
            if (tokens[i].equals("-")) {
                if (this.stack.size() < 2) {
                    throw new Exception("Stack is Empty, cannot pop");
                }
                stack.push(stack.pop() - stack.pop());
                continue;
            }

            throw new Exception("Uknown token.");
        }
        return stack.toString();
    }
}