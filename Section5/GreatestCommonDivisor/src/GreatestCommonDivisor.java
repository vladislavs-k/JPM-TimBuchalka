public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        int min;
        if (first < second){
            min = first;
        }else {
            min = second;
        }

        int divisor = 0;
        for (int i = 1; i <= min; i++){
            if(first % i == 0 && second % i == 0){
                divisor = i;
            }
        }

        return divisor;

    }
}
