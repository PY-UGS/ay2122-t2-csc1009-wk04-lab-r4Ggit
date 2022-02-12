package com.company;

public class IntegerStack{

    public static void main(String[] args) {
                int size = 10;

                Stack stack = new Stack(size);

                for (int i = 0; i < size; i++) {
                    stack.push(i);
                }

                while (!stack.empty()) {
                    System.out.print(stack.pop() + " ");
                }
            }
        }
