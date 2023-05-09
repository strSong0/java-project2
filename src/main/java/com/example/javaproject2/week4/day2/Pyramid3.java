package com.example.javaproject2.week4.day2;

public class Pyramid3 {
    private String spaceChar = "0";

    public Pyramid3(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        // 기능이 3가지
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }


    public static void main(String[] args) {
        Pyramid3 pyramid2 = new Pyramid3(" "); // argument " "를 넘겨서 초기화
        Pyramid3 pyramidSpaceZero = new Pyramid3("0"); // argument "0"을 넘겨서 초기화
        pyramid2.printPyramidWithSpaceChar(4, " ");
        pyramidSpaceZero.printPyramidWithSpaceChar(5, "0");
    }
}
