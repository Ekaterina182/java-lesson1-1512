package com.geekbr;

public class Homework1512 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
            }

    public static void checkSumSing() {
        int a = -5;
        int b = 4;
        int c = (a + b);
        System.out.println(c);
        if (c >= 0){
            System.out.println("Сумма положительная");
                    }
        if (c < 0){
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("Желтый");
                    }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers () {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }

    }
}
