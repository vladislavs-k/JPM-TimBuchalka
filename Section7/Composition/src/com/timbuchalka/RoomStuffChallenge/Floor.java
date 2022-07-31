package com.timbuchalka.RoomStuffChallenge;

public class Floor {
    private String floorSurfaceType;
    private String floorSurfaceColor;

    public Floor(String floorSurfaceType, String floorSurfaceColor) {
        this.floorSurfaceType = floorSurfaceType;
        this.floorSurfaceColor = floorSurfaceColor;
    }

    public void paintTheFloor(String floorSurfaceColor) {
        this.floorSurfaceColor = floorSurfaceColor;
        System.out.println("The floor's color has been changed. New color is: " + this.floorSurfaceColor);
    }

    public void changeFloorSurface(String floorSurfaceType) {
        this.floorSurfaceType = floorSurfaceType;
        System.out.println("Floor type has been changed. Please set floor's color!");
        this.floorSurfaceColor = "Raw surface color";
    }

    public String getFloorSurfaceType() {
        return floorSurfaceType;
    }

    public String getFloorSurfaceColor() {
        return floorSurfaceColor;
    }
}
