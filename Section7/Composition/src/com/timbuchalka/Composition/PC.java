package com.timbuchalka.Composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void  powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
//        getMonitor().drawPixelAt(120, 50, "yellow");
        monitor.drawPixelAt(120, 50, " yellow");
    }

}
