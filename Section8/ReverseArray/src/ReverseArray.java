import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array){
        int[] reverseArray = new int[array.length];

        System.out.println("Array = " + Arrays.toString(array));

        for (int i = 0; i < reverseArray.length; i++){
            reverseArray[i] = array[array.length - 1 - i];
        }

        System.out.println("Reversed array = " + Arrays.toString(reverseArray));

    }

    public static void rv(int[] array){
        reverse(array);
    }
}
