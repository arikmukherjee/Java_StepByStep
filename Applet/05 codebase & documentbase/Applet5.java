import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.net.*;
public class Applet5 extends Applet
{
public void paint(Graphics g)
{
    URL url = getCodeBase();
    g.drawString(url.toString(),50,50);

    URL url1 = getDocumentBase();
    g.drawString(url1.toString(),50,100);
}
}