import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int arraySize){

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){

        int[] sortedArray = array.clone();

        for (int i = 0; i < sortedArray.length - 1 ; i++){
            for (int j = 0; j < sortedArray.length - 1 - i; j++){
                if (sortedArray[j] < sortedArray[j + 1]){
                    int temp = sortedArray[j + 1];
                    sortedArray[j + 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
    }

}
