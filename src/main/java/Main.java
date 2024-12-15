public class Main {
    public static void main(String[] args) throws MyArraySizeException,MyArrayDataException {
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "89"},
                {"13", "14", "15", "16"}
        };

        String[][] array2 = {
                {"1", "2", "3", "6"},
                {"4", "5", "6", "5"},
                {"7", "8", "R", "4"},
                {"13", "14", "15", "16"}
        };

        String[][] array3 = {
                {"1", "2", "3", "6"},
                {"4", "5", "6", "5"},
                {"7", "8", "0", "4"},
        };

        String[][] array4 = {
                {"1", "500", "3", "4"},
                {"5", "0", "HELLO", "8"},
                {"9", "10", "100", "89"},
                {"13", "14", "15", "16"},
        };

        result(array1);
        result(array2);
        result(array3);
        result(array4);
    }

    public static void result(String[][] array) {
        try {
            CorrectArray.correctArraySize(array);
            int sum= CorrectArray.sumArrayElements(array);
            System.out.println("сумма элементов:"+sum);
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}




























