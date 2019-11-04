package com.company;

import java.awt.*;

public abstract class Shape implements Draw {
    protected Point pos;
    protected Color col;

    public Shape(Point initPos, Color col) {
        pos=initPos;
        this.col=col;
    }

}