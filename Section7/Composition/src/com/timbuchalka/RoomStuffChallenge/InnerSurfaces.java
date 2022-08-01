package com.timbuchalka.RoomStuffChallenge;

public class InnerSurfaces {
    private Ceiling ceiling;
    private Wall northWall;
    private Wall southWall;
    private Wall eastWall;
    private Wall westWall;
    private Floor floor;

    public InnerSurfaces(Ceiling ceiling, Wall northWall,
                         Wall southWall, Wall eastWall,
                         Wall westWall, Floor floor) {
        this.ceiling = ceiling;
        this.northWall = northWall;
        this.southWall = southWall;
        this.eastWall = eastWall;
        this.westWall = westWall;
        this.floor = floor;
    }


    public void checkCeilingTypeAndColor() {
        System.out.println("Ceiling type is: " + ceiling.getCeilingSurfaceType());
        System.out.println("Ceiling color is: " + ceiling.getCeilingSurfaceColor());
    }

    public void changeCeilingType(String surfaceType, String surfaceColor) {
        ceiling.changeCeilingSurface(surfaceType);
        ceiling.paintTheCeiling(surfaceColor);
        System.out.println("Ceiling type and as well color has been changed");
    }

//    public Ceiling getCeiling() {
//        return ceiling;
//    }


    public Wall getNorthWall() {
        return northWall;
    }

    public Wall getSouthWall() {
        return southWall;
    }

    public Wall getEastWall() {
        return eastWall;
    }

    public Wall getWestWall() {
        return westWall;
    }

    public Floor getFloor() {
        return floor;
    }
}
