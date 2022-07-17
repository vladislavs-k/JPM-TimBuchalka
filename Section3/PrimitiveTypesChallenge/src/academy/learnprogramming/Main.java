package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 100;
        short myShortValue = 20000;
        int myIntValue = 300000;

        long myFinalLongValue = 50000 + 10 * (myByteValue + myShortValue + myIntValue);
        System.out.println(myFinalLongValue);
    }
}
