/*  This class was created additionally because
    UDEMY exercise code checker didn't want to accept it
    due to "Extra method were detected" even though
    output of the code works as required
 */

public class LargestPrimeBetterCode {
    public static int getLargestPrime(int number){

        if (number < 2){
            return -1;
        }

        int largestPrime = 0;

        for (int i = number; i > 0; i--){

            if(isPrime(i) && (number % i == 0) && i > largestPrime){
                largestPrime = i;
            }
        }

        return largestPrime;

    }


    private static boolean isPrime(int number){
        int count = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                count++;
            }
        }
        return count == 2;
    }

}
