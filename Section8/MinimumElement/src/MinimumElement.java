import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }


    // As in the exercise description it
    // was required to define methods as private:
    // You can use the following methods to test the
    // functionality in the Main class, main() method
    public static int rI(){
        return readInteger();
    }

    public static int[] rE(int size){
        return readElements(size);
    }

    public static int fM(int[] array){
        return findMin(array);
    }
}
