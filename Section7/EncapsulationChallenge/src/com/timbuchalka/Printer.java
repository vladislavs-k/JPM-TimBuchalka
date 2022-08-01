package com.timbuchalka;

public class Printer {
    private int tonerLevel = 0;
    private int numberOfPrintedPaperSheets = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int tonerFillUp(int amount){
        tonerLevel += amount;
        if (tonerLevel > 100){
            int remainToner = tonerLevel - 100;
            tonerLevel = 100;
            return remainToner;
        }
        return 0;
    }

    public void printPage(int numberOfPages){
        if (tonerLevel > 0){
            if(duplex) {
                numberOfPrintedPaperSheets += ( (numberOfPages / 2) + (numberOfPages % 2) );
                System.out.println("Printing in duplex mode.");
            } else {
                numberOfPrintedPaperSheets += numberOfPages;
                System.out.println("Printing in simplex mode.");
            }
        } else {
            System.out.println("Printing was canceled. Check toner level!");
        }
    }

    public int getNumberOfPrintedPaperSheets() {
        return numberOfPrintedPaperSheets;
    }
}
