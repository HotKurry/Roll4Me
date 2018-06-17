package play;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class StartingWorld extends Tile {

	public StartingWorld(int x, int y, ID id, int ID) {
		super(x, y, id);
		this.ID=ID;
		getSTATS(ID);
		
	}
	private void getSTATS(int numb) {
		if(numb==0) {
			c = Color.yellow;
			points = 1;
			p1 = new Power(13);

			return;
		}else if(numb==1) {
			c = new Color(62, 39, 35);
			points = 1;
			p1 = new Power(16);

		}else if(numb==2) {
			c= Color.white;
			points = 2;
			p1 = new Power(2);

		}else if(numb==3) {
			c= Color.white;
			points = 0;
			p1 = new Power(20);

		}else if(numb==4) {
			c= Color.white;
			points = 3;
			p1 = new Power(5);

		}else if(numb==5) {
			c = new Color(128, 222, 234);
			points = 2;
			p1 = new Power(15);

		}else if(numb==6) {
			c = new Color(27, 94, 32);
			points = 0;
			p1 = new Power(17);

		}else if(numb==7) {
			c = Color.white;
			points = 2;
			p1 = new Power(3);
			p2 = new Power(7);
		}else if(numb==8) {
			c= Color.white;
			points = 2;
			p1 = new Power(3);
			p2 = new Power(3);
			
		}
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
