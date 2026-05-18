import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
public class Applet4 extends Applet
{
public void init()
{
    setBackground(Color.YELLOW);
    setForeground(Color.RED);
}
public void paint(Graphics g)
{
g.drawLine(10,10,100,100);
}
}