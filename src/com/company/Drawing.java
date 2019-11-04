
package com.company;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {
    static GraphicsConfiguration gc;
    Circle C;
    Rect R;
    private Frame f;
    Point p=new Point(200,200);
    Point pr=new Point(100,100);
    Point p3=new Point(50,50);
    Point p4=new Point(350,350);

    Color c=new Color(0x990D7A);
    Color cr=new Color(0x991B0C);
    Color c3=new Color(0x990D7A);
    Color c4=new Color(0x991B0C);
    ArrayList<Shape> listOfShapes = new ArrayList<Shape>();

    public Drawing() {

        C = new Circle(p,c,60);
        R = new Rect(pr,cr,20,20);
        Circle CC = new Circle(p3, c3, 20);
        Rect RR = new Rect(p4,c4,10, 10);

        listOfShapes.add(C);
        listOfShapes.add(R);
        listOfShapes.add(CC);
        listOfShapes.add(RR);

        //setupFrame();
        setupJFrame();
        setupCanvas();
    }

    private void setupJFrame(){
        //Attempt to write add canvas to frame
        JFrame frame= new JFrame(gc); // Create a new JFrame
        frame.setLayout(new GridLayout(2,2)); // One row, one column
        frame.setSize(500,500);
        frame.add(this);
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setupCanvas() {
        setBackground(Color.BLACK); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    /*private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }*/

    public void paint(Graphics g) {
        for(int i=0; i<4; i++){
            listOfShapes.get(i).draw(g);
        }
    }
}
