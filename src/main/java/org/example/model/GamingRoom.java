package org.example.model;

import org.example.model.enums.PaintColor;

public class GamingRoom extends Room{
    private boolean hasPc;
    private boolean console;
    private boolean gamingChair;
    private PaintColor wallsColor;


    public GamingRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet,
                      boolean hasPc, boolean console, boolean gamingChair, PaintColor wallsColor) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp, carpet);
        this.hasPc = hasPc;
        this.console = console;
        this.gamingChair = gamingChair;
        this.wallsColor = wallsColor;
    }

    public boolean isHasPc() {
        return hasPc;
    }

    public boolean isConsole() {
        return console;
    }

    public boolean isGamingChair() {
        return gamingChair;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Gaming Room >>> " +
             " hasPC " + hasPc +
               " hasConsole " + console +
               " hasGamingChair " + gamingChair +
               " walls are " + wallsColor;

    }
}
