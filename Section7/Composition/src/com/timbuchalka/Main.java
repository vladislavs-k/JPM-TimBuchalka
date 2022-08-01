package com.timbuchalka;

import com.timbuchalka.Composition.*;
import com.timbuchalka.RoomStuffChallenge.*;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell",
//                "240", dimensions);
//
//        Monitor monitor = new Monitor("27in Beast", "Acer",
//                27, new Resolution(2540, 1440));
//
//        Motherboard motherboard = new Motherboard("BJ-200", "Asus",
//                4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, monitor, motherboard);
//        thePC.powerUp();




        // !!!!!Challenge!!!!!
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Ceiling ceiling = new Ceiling("Stretch ceiling", "White");
        Wall northWall = new Wall("North", "Wallpaper", "Brown");
        Wall southWall = new Wall("South", "Concrete", "Grey");
        Wall eastWall = new Wall("East", "Painted Wall", "Yellow");
        Wall westWall = new Wall("West", "Painted Wall", "Blue");
        Floor floor = new Floor("Laminate flooring", "Wooden");
        InnerSurfaces innerSurfaces = new InnerSurfaces(ceiling, northWall, southWall, eastWall, westWall, floor);

        Furniture furniture = new Furniture(new Chair("Office", "Plastic"), new Sofa("Fabric", "Grey"));

        Room room = new Room(innerSurfaces, furniture);


        System.out.println("Floor type is: " + room.getInnerSurfaces().getFloor().getFloorSurfaceType());
        System.out.println("Floor color is: " + room.getInnerSurfaces().getFloor().getFloorSurfaceColor());
        room.getInnerSurfaces().getFloor().changeFloorSurface("Linoleum");
        System.out.println("New floor color is: " + room.getInnerSurfaces().getFloor().getFloorSurfaceColor());
        room.getInnerSurfaces().getFloor().paintTheFloor("White brown");
        System.out.println("New floor color is: " + room.getInnerSurfaces().getFloor().getFloorSurfaceColor());

        System.out.println();

        room.getInnerSurfaces().checkCeilingTypeAndColor();
        room.getInnerSurfaces().changeCeilingType("Office 'false' ceiling", "Black");
        room.getInnerSurfaces().checkCeilingTypeAndColor();

        System.out.println();

        System.out.println("Chair form factor is: " + room.getFurniture().getChair().getFormFactor());
        System.out.println("Sofa type: " + room.getFurniture().getSofa().getMaterial());
        System.out.println("Sofa color: " + room.getFurniture().getSofa().getColor());

        System.out.println();

        room.getFurniture().getChair().sitDown();

    }

}
