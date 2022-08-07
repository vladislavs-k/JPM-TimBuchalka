public class ReverseArray {

    private static void reverse(int[] array){

        //Version 1:
//        int[] reverseArray = new int[array.length];
//
//        System.out.println("Array = " + Arrays.toString(array));
//
//        for (int i = 0; i < reverseArray.length; i++){
//            reverseArray[i] = array[array.length - 1 - i];
//        }
//
//        System.out.println("Reversed array = " + Arrays.toString(reverseArray));


        //Version 2:
        int halfArraySize = array.length / 2;
        int lastArrayElement = array.length - 1;

        for (int i = 0; i < halfArraySize; i++){
            int temp = array[i];
            array[i] = array[lastArrayElement - i];
            array[lastArrayElement - i] = temp;
        }

    }

    public static void rv(int[] array){
        reverse(array);
    }
}
