package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        getDurationString(61, 59);

        getDurationString(3661);
    }

    public static void getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            System.out.println("Invalid value");
        } else {
            int hours = minutes / 60;
            minutes = minutes % 60;

            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
        }else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            getDurationString(minutes, seconds);
        }
    }

}
