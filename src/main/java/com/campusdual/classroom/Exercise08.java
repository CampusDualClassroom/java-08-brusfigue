package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop(5);
    }

    public static void whileLoop(int num) {
        int x = 0;
        while (x < num) {
            System.out.println(x + " < " + num + ". El proximo ciclo valdra: " + (x + 1));
            x = x + 1;
        }
    }
}