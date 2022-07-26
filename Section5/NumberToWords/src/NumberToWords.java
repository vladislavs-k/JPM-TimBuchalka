public class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }else {

            int revNumber = reverse(number);

            for (int i = 0; i < getDigitCount(number); i++){

                int digit = revNumber % 10;
                revNumber /= 10;

                switch (digit){
                    case 1: System.out.println("One"); break;
                    case 2: System.out.println("Two"); break;
                    case 3: System.out.println("Three"); break;
                    case 4: System.out.println("Four"); break;
                    case 5: System.out.println("Five"); break;
                    case 6: System.out.println("Six"); break;
                    case 7: System.out.println("Seven"); break;
                    case 8: System.out.println("Eight"); break;
                    case 9: System.out.println("Nine"); break;
                    default:System.out.println("Zero"); break;
                }

            }

        }

    }

    public static int reverse(int number){
        int sign;
        if(number < 0){
            sign = -1;
        }else {
            sign = 1;
        }

        int fwdNum = number * sign;
        int revNum = 0;

        while (fwdNum > 0) {
            revNum += fwdNum % 10;
            fwdNum /= 10;
            if (fwdNum > 0){
                revNum *= 10;
            }
        }

        return revNum * sign;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        int count = 0;

        do {
            number /= 10;
            count++;
        }while(number > 0);

        return count;

    }
}
