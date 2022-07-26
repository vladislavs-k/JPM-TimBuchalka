public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bBagVolume = 5; //bigCount is a bag, 5 kilos each
        int sBagVolume = 1;//smallCount is a bag, 1 kilo each

        int giveKiloSum = bigCount * bBagVolume + smallCount * sBagVolume;

        if (bigCount < 0 || smallCount < 0 || goal < 0 || giveKiloSum < goal) {
            return false;
        }

        int bigBagNeed = goal / bBagVolume;
        int smallBagNeed = goal % bBagVolume;

        if (bigBagNeed > bigCount) {
            smallBagNeed += (bigBagNeed - bigCount) * bBagVolume;
            bigBagNeed = bigCount;
        }

        if(bigBagNeed <= bigCount && smallBagNeed <= smallCount){
            return true;
        }else
            return false;
    }
}
