public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double decimalOne, double decimalTwo){
        int roundDecOne = (int) (decimalOne * 1000);
        int roundDecTwo = (int) (decimalTwo * 1000);

        if (roundDecOne == roundDecTwo){
            return true;
        }

        return false;
    }
}
