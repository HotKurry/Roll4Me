package play;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends MouseAdapter {

	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		Font fnt = new Font("arial", 1, 120);
		Font fnt2 = new Font("arial",1,60);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Roll 4 Me", 375, 150);
		g.setFont(fnt2);
		g.drawRect(440, 250, 400, 100);
		g.drawString("Play", 575, 320);
		g.drawRect(440, 450, 400, 100);
		g.drawString("Settings", 525, 520);
		g.drawRect(440, 650, 400, 100);
		g.drawString("Quit", 575, 720);
	}
	
	
}
