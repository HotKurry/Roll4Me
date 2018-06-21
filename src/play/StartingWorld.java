package play;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class StartingWorld extends Tile {

	public StartingWorld(int x, int y, ID id, int ID) {
		super(x, y, id, ID);

		
	}

	public void tick() {
		
	}
	
	public void render(Graphics g) {
		Font fnt = new Font("arial", 1, 20);
		Font fnt2 = new Font("arial",1,60);

		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawRect(x, y, 650, 200);
		g.drawString(p1.getInfo(), x+10, y+100);

		if(p2!=null) {
			g.drawString(p2.getInfo(), x+10, y+130);
			if(p3!=null) {
				g.drawString(p3.getInfo(), x+10, y+160);
				if(p4!=null) {
					g.drawString(p4.getInfo(), x+10, y+190);
				}
			}
		}
		g.setFont(fnt2);
		g.drawString(""+points, x+15, y+65);
		g.setColor(c);
		g.fillOval(x+550, y+10, 90, 90);

	}
	
	
	
	
	
	
	
	

}
