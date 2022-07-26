public class LargestPrime {
    public static int getLargestPrime(int number){

        if (number < 2){
            return -1;
        }

        int largestPrime = 0;

        for (int i = number; i > 0; i--){

            int count = 0;
            for (int prime = 1; prime <= i; prime++){
                if (i % prime == 0){
                    count++;
                }
            }

            if(count != 2){
                continue;
            }

            if((number % i == 0) && i > largestPrime){
                largestPrime = i;
            }
        }

        return largestPrime;

    }

}
