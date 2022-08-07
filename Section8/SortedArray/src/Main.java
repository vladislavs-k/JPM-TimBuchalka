public class Main {
    public static void main(String[] args) {

        System.out.println("Enter you 'int' numbers: ");
        int[] inputArray = SortedArray.getIntegers(5);

        System.out.println("Unsorted array: ");
        SortedArray.printArray(inputArray);

        System.out.println();

        System.out.println("----------Sorting----------");
        int[] sortedArray = SortedArray.sortIntegers(inputArray);

        System.out.println("Unsorted array: ");
        SortedArray.printArray(inputArray);

        System.out.println();

        System.out.println("Descending sorted array: ");
        SortedArray.printArray(sortedArray);

    }
}
