package com.example.javaproject2.week7;

public class Print369 {
    public static void main(String[] args) {
        for (int i = 0; i <= 99; i++) {
            play369(i);
        }
    }

    private static void play369(int number) {
        String str = String.valueOf(number);

        if (str.contains("3") || str.contains("6") || str.contains("9")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
                    sb.append("*");
                }
            }
            System.out.println(sb.toString());
        } else {
            System.out.println(String.format("%02d", number));
        }
    }
}
