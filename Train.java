import java.awt.*;
import java.applet.*;

class Train
{
    public static void drawCab(Graphics g) //draws the cab of the train
    {
        Expo.setColor(g,Expo.darkGreen);
        Expo.fillRectangle(g,75,125,275,475);
    }
    public static void drawWindow(Graphics g) //draws the window in the cab
    {
        Expo.setColor(g,Expo.white);
        Expo.fillRectangle(g,90,150,260,275);
    }
    public static void drawTank(Graphics g) //draws the train's water tank
    {
        Expo.setColor(g,Expo.darkGreen);
        Expo.fillRectangle(g,270,275,750,475);
        Expo.fillArc(g,750,375,50,100,0,180);
    }
    public static void drawStack(Graphics g) //draws the smoke stack 
    {
        Expo.setColor(g,Expo.black);
        Expo.fillRectangle(g,690,275,600,240);
        Expo.fillRectangle(g,550,150,740,240);
        Expo.fillPolygon(g,550,150,616,125,679,125,740,150);
        Expo.setColor(g,Expo.lightBlue);
        Expo.fillArc(g,550,245,50,75,0,90);
        Expo.fillArc(g,741,245,50,75,270,0);
    }
    public static void drawDome(Graphics g) 
    {
        Expo.setColor(g,Expo.gold);
        Expo.fillRectangle(g,525,275,475,245);
        Expo.fillArc(g,500,245,25,20,270,90);
    }
    public static void drawDrive(Graphics g) //draws the drive wheels of the train
    {
        Expo.setColor(g,Expo.grey);
        Expo.fillCircle(g,200,500,110);
        Expo.fillCircle(g,625,500,110);
        Expo.setColor(g,Expo.black);
        Expo.fillCircle(g,200,500,25);
        Expo.fillCircle(g,625,500,25);
        Expo.fillRectangle(g,225,430,650,445);
    }
}