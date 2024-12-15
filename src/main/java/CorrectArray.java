public class CorrectArray {
    public static void correctArraySize(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4 ) {
            throw new MyArraySizeException ("размер массива должен быть 4x4");
        }
    }

    public static int sumArrayElements(String[][]array) throws MyArrayDataException {
        int sum=0;
        for(int i=0; i<array.length;i++){
            for (int j=0; j<array[i].length;j++){
                try{
                    sum+=Integer.parseInt(array[i] [j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("неверные данные["+(i+1)+","+(j+1)+"]");
                }
            }
        }
        return sum;
    }
}
