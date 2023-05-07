package InflearnAlgorethm.StackQueue;

import java.util.Scanner;

public class ArrayStack {
    //스택 구현 연습

    int top;
    int size;
    int[] stack;

    public ArrayStack(int size){
        this.size=size;
        stack=new int[size];
        top = -1;
    }

    public void push(int item){
        stack[++top] = item;
        System.out.println(stack[top] + " Posh! ");
    }

    public void pop(){
        System.out.println(stack[top] + " POP! ");
        int pop = stack[top];
        stack[top--] = 0;
    }

    public void peek(){
        System.out.println(stack[top] + "Peek!");
    }




    public static void main(String[] args) {
        ArrayStack T = new ArrayStack(5);
        //1. 스캐너로 첫번째 값 받아오기

        for (int i = 0; i < 5; i++) {
            T.push(i);
        }
        for (int i = 0; i < 5; i++) {
            T.pop();
        }
    }
}
