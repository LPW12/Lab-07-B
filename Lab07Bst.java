// Lab07Bst.java
// The OOP Graphics Program
// This is the student, starting file for Lab 07B.
// This is an "Open-Ended" asignment.


import java.awt.*;
import java.applet.*;

public class Lab07Bst extends Applet
{
    public void paint(Graphics g) //camands that call on other classes
    {
        Background.drawSky(g);
        Background.drawPlatform(g);
        Background.drawGround(g);
        Train.drawCab(g);
        Train.drawWindow(g);
        Train.drawTank(g);
        Train.drawStack(g);
        Train.drawDrive(g);
        Train.drawDome(g);
        Background.drawTrack(g);
        Engineer.drawBody(g);
        Engineer.drawArm(g);
        Engineer.drawHead(g);
    }
}

        