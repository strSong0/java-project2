package com.example.javaproject2.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {
    public static int[] arr = new int[10000];
    private int pointer = 0; //index

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public int push(int value) {
        return this.arr[pointer++] = value;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer];
    }

    public int peek() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        System.out.println(st.push(10));
        System.out.println(st.push(20));
        System.out.println(Arrays.toString(arr));
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
