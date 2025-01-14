package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroomIns =
                new Bedroom("Bedroom Instance",
                new Wall("left"), new Wall("right"), new Wall("up"), new Wall("down"),
                new Ceiling(2, PaintColor.RED),
                new Bed("French",2,1,2,1),
                new Lamp(LampType.NEON,true, 5),
                new Wardrobe(3,2,50),
                new Carpet(5,7,PaintColor.GREEN)
                );


        Room roomInstance = new Room("Kitchen (Room Instance)",
                new Wall("N"), new Wall("S"), new Wall("W"), new Wall("E"),
                new Ceiling(3,PaintColor.WHITE),
                new Lamp(LampType.NORMAL, false, 1),
                new Carpet(5,5,PaintColor.WHITE)
        );

        GamingRoom gamingRoom = new GamingRoom("Gamer Room",
                new Wall("kuzey"), new Wall("güney"), new Wall("doğu"), new Wall("batı"),
                new Ceiling(3,PaintColor.GREEN), new Lamp(LampType.LAVA, true, 4),
                new Carpet(5,5, PaintColor.RED),true, false, true, PaintColor.RED);

        System.out.println(bedroomIns);
        System.out.println(roomInstance);
        System.out.println(gamingRoom);
    }



}