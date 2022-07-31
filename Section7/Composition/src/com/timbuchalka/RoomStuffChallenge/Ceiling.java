package com.timbuchalka.RoomStuffChallenge;

public class Ceiling {
    private String ceilingSurfaceType;
    private String ceilingSurfaceColor;

    public Ceiling(String ceilingSurfaceType, String ceilingSurfaceColor) {
        this.ceilingSurfaceType = ceilingSurfaceType;
        this.ceilingSurfaceColor = ceilingSurfaceColor;
    }

    public void paintTheCeiling(String ceilingSurfaceColor){
        this.ceilingSurfaceColor = ceilingSurfaceColor;
    }

    public void changeCeilingSurface(String ceilingSurfaceType){
        this.ceilingSurfaceType = ceilingSurfaceType;
        this.ceilingSurfaceColor = "Raw surface color";
    }

    public String getCeilingSurfaceType() {
        return ceilingSurfaceType;
    }

    public String getCeilingSurfaceColor() {
        return ceilingSurfaceColor;
    }
}
