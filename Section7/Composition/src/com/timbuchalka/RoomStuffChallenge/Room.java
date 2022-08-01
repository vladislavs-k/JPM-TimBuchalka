package com.timbuchalka.RoomStuffChallenge;

public class Room {
    private InnerSurfaces innerSurfaces;
    private Furniture furniture;

    public Room(InnerSurfaces innerSurfaces, Furniture furniture) {
        this.innerSurfaces = innerSurfaces;
        this.furniture = furniture;
    }

    public InnerSurfaces getInnerSurfaces() {
        return innerSurfaces;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
