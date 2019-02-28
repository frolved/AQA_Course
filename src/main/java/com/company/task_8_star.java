package com.company;

import java.util.ArrayList;

public class task_8_star {

    public static void main(String[]args) {
      String str = "Hello world";
        StringBuilder sb = new StringBuilder();
        for (char g : str.toCharArray()) {
            sb.append((int) g + " ");
        }

        String[] result = sb.toString().split(" ");

        for (String s : result) {
            printList(transformintToChar(Integer.parseInt(s)));
        }

    }

    public static ArrayList<Character> transformintToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i : values) {
            buffer.add((char) i);
        }
        return buffer;

    }

    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }

}