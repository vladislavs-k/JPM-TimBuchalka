public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if( !isValid(num1) || !isValid(num2) || !isValid(num3) ){
            return false;
        }

        int lastOfNum1 = num1 % 10;
        int lastOfNum2 = num2 % 10;
        int lastOgNum3 = num3 % 10;

        if (lastOfNum1 == lastOfNum2 ||
            lastOfNum1 == lastOgNum3 ||
            lastOfNum2 == lastOgNum3){
            return true;
        }else {
            return false;
        }


    }

    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }

}
