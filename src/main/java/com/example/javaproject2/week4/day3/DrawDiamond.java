package com.example.javaproject2.week4.day3;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot){
            return String.format("%s%s\n", getRepeatedSymbol("0", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        int h = 7;
        for (int i = 0; i < h; i++) {
            System.out.print(makeALine(h, i));
        }
    }
}
