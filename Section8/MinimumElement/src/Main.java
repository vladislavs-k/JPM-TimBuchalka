public class Main {
    public static void main(String[] args) {
        int size = MinimumElement.rI();
        int[] array = MinimumElement.rE(size);
        int min = MinimumElement.fM(array);
        System.out.println("The min number is: " + min);
    }
}
