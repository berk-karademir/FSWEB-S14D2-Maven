package org.example.model;

public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Lamp lamp;
    private Carpet carpet;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                Ceiling ceiling, Lamp lamp, Carpet carpet) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.carpet = carpet;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", ceiling=" + ceiling +
                ", lamp=" + lamp +
                ", carpet=" + carpet +
                '}';
    }
}