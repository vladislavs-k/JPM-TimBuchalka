public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo){
        if (numOne < 10 || numOne > 99 ||numTwo < 10 || numTwo > 99){
            return false;
        }

        int numOneSubNumOne = numOne % 10;
        int numOneSubNumTwo = numOne / 10;
        int numTwoSubNumOne = numTwo % 10;
        int numTwoSubNumTwo = numTwo / 10;

        if (numOneSubNumOne == numTwoSubNumOne || numOneSubNumOne == numTwoSubNumTwo ||
            numOneSubNumTwo == numTwoSubNumOne || numOneSubNumTwo == numTwoSubNumTwo){
            return true;
        }else{
            return false;
        }

    }
}
