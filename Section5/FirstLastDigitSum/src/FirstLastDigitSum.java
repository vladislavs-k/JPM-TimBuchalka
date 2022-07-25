public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }

        int firstNum = 0;
        int lastNum = number % 10;
        do {
            firstNum = number;
            number /= 10;
        }while (number > 0);

        return firstNum + lastNum;
    }
}
