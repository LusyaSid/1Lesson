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
        lenInitial(10, "Привет");
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 9;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
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
    }

    public static void compareNumbers() {
        int a = 35;
        int b = 49;
        if (a >= b) {
            System.out.println ("a>=b");
        } else {
            System.out.println ("a<b");
        }
    }

    public static void trueFalse(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void positiveNegative(int number) {
        if (number >=0) {
            System.out.println ("положительное");
        } else {
            System.out.println ("отрицательное");
        }

    }

    public static void trueNegative(int number) {
        if (number <0) {
            System.out.println ("true");
        }else {
            System.out.println ("false");
        }
    }

    public static void printStringWords() {
        String word = "Учиться";
        int number = 7;
        for (int i =0; i < number; i ++ ) {
            System.out.println (word);
        }
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
    }

    public static void oneHundred() {
        int [] array = new int [100];
        for (int i = 0; i < array.length; i ++ ) {
            array [i]=i +1;
            System.out.println (array[i]);
        }
    }

    public static void multiplyByTwo () {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] *= 2;
            }
            System.out.println(nums[i]);
        }
    }


    public static void squareTabl(){
        int[] [] square = new int [6] [6];
        for (int i = 0; i < square.length; i ++) {
            for (int j = 0; j < square[i].length; j++) {
                square[i][i]= 2;
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void lenInitial (int len, String initialValue) {
        String[] value = new String[len];
        for (int i =0; i < len; i++) {
            value[i] = initialValue;
            System.out.print(value[i] + "  ");
        }
        System.out.println();
    }
}



