package com.timbuchalka.RoomStuffChallenge;

public class Wall {
    private String wallLocation;
    private String wallSurfaceType;
    private String wallSurfaceColor;

    public Wall(String wallLocation, String wallSurfaceType, String wallSurfaceColor) {
        this.wallLocation = wallLocation;
        this.wallSurfaceType = wallSurfaceType;
        this.wallSurfaceColor = wallSurfaceColor;
    }

    public void painTheWall(String wallLocation){
        this.wallSurfaceColor = wallLocation;
    }

    public void changeWallSurface(String wallSurfaceType){
        this.wallSurfaceType = wallSurfaceType;
        this.wallSurfaceColor = "Raw surface color";
    }

    public String getWallLocation() {
        return wallLocation;
    }

    public String getWallSurfaceType() {
        return wallSurfaceType;
    }

    public String getWallSurfaceColor() {
        return wallSurfaceColor;
    }
}
