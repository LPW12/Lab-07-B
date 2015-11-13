import java.awt.*;
import java.applet.*;

class Background
{
    public static void drawSky(Graphics g) //draws the blue sky
    {
        Expo.setColor(g,Expo.lightBlue);
        Expo.fillRectangle(g,0,0,999,400);
        
    }
    public static void drawPlatform(Graphics g) //draws the stations platform
    {
        Expo.setColor(g,Expo.darkGray);
        Expo.fillRectangle(g,0,400,999,550);
    }
    public static void drawGround(Graphics g) //draw the ground
    {
        Expo.setColor(g,Expo.yellow);
        Expo.fillRectangle(g,0,550,999,650);
    }
    public static void drawTrack(Graphics g) //draws the train track
    {
        int x1 = 0;
        int y1 = 610;
        int x2 = 50;
        int y2 = 625;
        for(int line = 1; line <= 25; line++)
        {
            Expo.setColor(g,Expo.brown);
            x1 +=125;
            x2 +=125;
            Expo.fillRectangle(g,x1,y1,x2,y2);
        }
        Expo.setColor(g,Expo.darkGrey);
        Expo.fillRectangle(g,0,600,999,610);
    }
}