package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Первый метод
        printThreeWords();
        //Второй метод
        checkSumSign();
        //Третий метод
        printColor();
        //Четвёртый метод
        compareNumbers();
        //Пятый метод
        trueFalse(5,9);
        //Шестой метод
        positiveNegative(-8);
        //Седьмой метод
        trueNegative(-88);
        //Восьмой метод
        printStringWords();
        //Девятый метод
        leapYear(2000);
        //Десятый метод
        zeroOne();
        //Одинадцатый метод
        oneHundred ();
        // Двенадцатый метод
        multiplyByTwo ();
        //Треннадцатый метод
        squareTabl();
        //Четырнадцатый метод
        lenInitialString(10, "Привет");
        lenInitialInt(10, -1);
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("Первое задание");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 9;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("Второе задание");
    }

    public static void printColor() {
        int  value = 50;
        if  (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else  {
            System.out.println("Зелёный");
        }
        System.out.println("Третье задание");
    }

    public static void compareNumbers() {
        int a = 35;
        int b = 49;
        if (a >= b) {
            System.out.println ("a>=b");
        } else {
            System.out.println ("a<b");
        }
        System.out.println("Четвёртое задание");
    }

    public static void trueFalse (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("Пятое задание");
    }

    public static void positiveNegative (int number) {
        if (number >=0) {
            System.out.println ("положительное");
        } else {
            System.out.println ("отрицательное");
        }
        System.out.println("Шестое задание");
    }

    public static void trueNegative (int number) {
        if (number <0) {
            System.out.println ("true");
        }else {
            System.out.println ("false");
        }
        System.out.println("Седьмое задание");
    }

    public static void printStringWords() {
        String word = "Учиться";
        int number = 7;
        for (int i =0; i < number; i ++ ) {
            System.out.println (word);
        }
        System.out.println("Восьмое задание");
    }

    public static void leapYear(int year) {
        if (year % 4 != 0) {
            System.out.println("false");
        }
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
        System.out.println("Девятое выполнено");
    }

    public static void zeroOne() {
        int [] code = {1,1,0,0,1,0,1,1,0,0};
        for (int i=0; i < code.length; i++) {
            if (code [i] == 1) {
                code [i]= 0;
            } else {
                code [i] =1;
            }
            System.out.println (code[i]);
        }
        System.out.println("Десятое задание");
    }

    public static void oneHundred() {
        int [] array = new int [100];
        for (int i = 0; i < array.length; i ++ ) {
            array [i]=i +1;
            System.out.println ("array["+i+"]="+ array[i]);
        }
        System.out.println("Одиннацатое задание");

    }

    public static void multiplyByTwo () {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] *= 2;
            }
            System.out.println(nums[i]);
        }
        System.out.println("Двенадцатое задание");
    }


    public static void squareTabl(){
        int[] [] square = new int [6] [6];
        for (int i = 0; i < square.length; i ++) {
            square[i][i]= 1;
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Тренадцатое задание");
    }

    public static void lenInitialString (int len, String initialValue) {
        String[] value = new String[len];
        for (int i =0; i < len; i++) {
            value[i] = initialValue;
            System.out.print(value[i] + "  ");
        }
        System.out.println();
        System.out.println("Четырнадцатое задание");
    }

    public static void lenInitialInt(int len, int initialValue) {
        int[] value = new int [len];
        for (int i =0; i < len; i++) {
            value[i] = initialValue;
            System.out.print(value[i] + "  ");
        }
        System.out.println();
        System.out.println("Четырнадцатое задание");
    }
}



