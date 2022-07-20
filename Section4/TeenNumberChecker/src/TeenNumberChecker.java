public class TeenNumberChecker {
    public static boolean hasTeen(int teenOne, int teenTwo, int teenThree){
        return isTeen(teenOne) || isTeen(teenTwo) || isTeen(teenThree);
    }

    public static boolean isTeen(int teen){
        return teen >= 13 && teen <= 19;
    }
}
