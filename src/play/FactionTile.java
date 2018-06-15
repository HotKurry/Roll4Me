package play;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.text.*;

import javax.swing.*;
import javax.swing.JPanel;

public class FactionTile extends Tile {

	private Color c;
	public FactionTile(int x, int y, play.ID id, int ID) {
		super(x, y, id);
		this.ID =ID;
		getSTATS(ID);

	}

	private void getSTATS(int numb) {
		if(numb==1) {
			c = Color.white;
			points = 2;
			p1 = new Power(3);
			p2 = new Power(50);
			return;
		}else if(numb==2) {
			c= Color.white;
			points = 2;
			p1 = new Power(13);
			p2=new Power(23);
		}else if(numb==3) {
			c = new Color(128, 222, 234);
			points = 3;
			p1 = new Power(6);
			p2 = new Power(45);
		}else if(numb==4) {
			c = new Color(62, 39, 35);
			points = 5;
			p1 = new Power(8);
		}else if(numb==5) {
			c = new Color(27, 94, 32);
			points = 2;
			p1 = new Power(11);
		}else if(numb==6) {
			c = new Color(128, 222, 234);
			points = 5;
			p1 = new Power(15);
		}else if(numb==7) {
			c = Color.white;
			points = 4;
			p1 = new Power(10);
		}else if(numb==8) {
			c = new Color(62, 39, 35);
			points = 3;
			p1 = new Power(9);
			
		}else if(numb==9) {
			c = Color.yellow;
			points = 3;
			p1 = new Power(4);
			p2 = new Power(3);
		}
		
		
		
	}
	
	public void tick() {
	
		
	}
	public void render(Graphics g) {
		Font fnt = new Font("arial", 1, 20);
		Font fnt2 = new Font("arial",1,60);
		Font fnt3 = new Font("arial", 1, 15);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawRect(x, y, 380, 600);
		g.setFont(fnt3);
		g.drawString(p1.getInfo(), x+10, y+400);

		if(p2!=null) {
			g.drawString(p2.getInfo(), x+10, y+440);
			if(p3!=null) {
				g.drawString(p3.getInfo(), x+10, y+480);
				if(p4!=null) {
					g.drawString(p4.getInfo(), x+10, y+520);
				}
			}
		}
		g.setFont(fnt2);
		g.drawString(""+points, x+15, y+65);
		g.setColor(c);
		g.fillOval(x+275, y+10, 90, 90);

	}

	
	

}
