import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner =  new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true){
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                sum += scanner.nextInt();;
                count++;
            } else {
                break;
            }
        }


        long avg = Math.round( (double) sum / (double) count );
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
