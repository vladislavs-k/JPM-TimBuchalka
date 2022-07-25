public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number;
        }

        int forwardNumber = number;
        int reversNumber = 0;
        while (forwardNumber > 0) {
            reversNumber += forwardNumber % 10;
            forwardNumber /= 10;
            if (forwardNumber > 0){
                reversNumber *= 10;
            }
        }

        return reversNumber == number;
    }
}
