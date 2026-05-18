import java.awt.*;
import java.applet.*;
public class LifeCycle extends Applet 
{
    String msg = "";
	public void init()
	{
		System.out.println("Applet initialized");
        msg = "Applet initialized";
	}
	public void start()
	{
		System.out.println("Applet execution started");
        msg += "\nApplet execution started";
	}
    public void paint(Graphics g)
	{
		System.out.println("Painting...");
        msg += "\nPainting...";
        g.drawString(msg, 20, 20);
	}
	public void stop()
	{
		System.out.println("Applet execution stopped");

	}
	
	public void destroy()
	{
		System.out.println("Applet destroyed");
	}
}