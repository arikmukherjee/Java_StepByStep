import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;

public class Applet2 extends Applet {
    public void paint(Graphics g) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        g.drawString(input, 20, 20);
    }
}
