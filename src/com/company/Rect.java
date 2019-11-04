package com.company;

import java.awt.*;

public class Rect extends Shape {
    private int w;
    private int h;

    public Rect(Point initPos, Color col, int width, int height){
        super(initPos, col);
        w = width;
        h = height;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, w, h);
    }


}
