package com.timbuchalka;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 1));
        System.out.println(getDurationString(3661));
    }

    private static String  getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        } else {
            int hours = minutes / 60;
            minutes = minutes % 60;

            return  addLeadingZero(hours) + "h "+
                    addLeadingZero(minutes) + "m " +
                    addLeadingZero(seconds) + "s ";
        }
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }else {
            int minutes = seconds / 60;
            seconds = seconds % 60;

            return getDurationString(minutes, seconds);
        }
    }

    private static String addLeadingZero(int number){
        if (number < 10) {
            return "0" + number;
        }
        return Integer.toString(number);
    }

}
