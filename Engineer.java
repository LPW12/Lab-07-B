import java.awt.*;
import java.applet.*;

class Engineer
{
    public static void drawHead(Graphics g) //draws the engineer's head
    {
        Expo.setColor(g,Expo.black);
        Expo.fillCircle(g,175,200,30);
    }
    public static void drawBody(Graphics g) //draws the body of the engineer
    {
        Expo.setColor(g,Expo.black);
        Expo.fillRectangle(g,165,200,185,275);
    }
    public static void drawArm (Graphics g) //draws the waving arm of the engineer
    {
        Expo.setColor(g,Expo.black);
        Expo.fillArc(g,185,220,30,40,90,180);
        Expo.setColor(g,Expo.white);
        Expo.fillArc(g,186,220,20,30,90,180);
    }
}