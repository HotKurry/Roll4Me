package play;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import play.PlayGame.STATE;

public class Menu extends MouseAdapter {

	private PlayGame game;
	private Handler handler;
	private int i1, i2, i3;
	private User user;
	
	
	public Menu(PlayGame game, Handler handler, User user) {
		this.game = game;
		this.handler = handler;
		this.user = user;
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		if(game.gameState==STATE.Menu) {
		
		//play Button
		if(mouseOver(mx,my,440, 250, 400, 100)) {
			game.gameState = STATE.Game;
			Random r = new Random();
			i1 = 1+ r.nextInt(9);

			handler.addObject(new FactionTile(50,200,ID.faction,i1));
			i2 = 1+ r.nextInt(9);
			handler.addObject(new FactionTile(440,200,ID.faction,i2));
			i3 = 1+ r.nextInt(9);
			handler.addObject(new FactionTile(830,200,ID.faction,i3));
			game.gameState = STATE.FactionSelect;
		}
		
		//Settings Button
		if(mouseOver(mx,my, 440, 450, 400, 100)) {

			game.gameState = STATE.Settings;
		}
		
		//Quit Button
		if(mouseOver(mx,my,440, 650, 400, 100)) {
			System.exit(1);
		}
		}else if(game.gameState==STATE.Settings) {
			if(mouseOver(mx,my,80, 750, 200, 100)) {
				game.gameState = STATE.Menu;
			}
		}else if(game.gameState==STATE.FactionSelect) {
			if(mouseOver(mx,my,50, 200, 380, 600)) {
				user.setFaction(new FactionTile(50,200,ID.faction,i1));
				user.setDp(user.getFaction().points);
				handler.clearObjects();
			}else if(mouseOver(mx,my,440, 200, 380, 600)) {
				user.setFaction(new FactionTile(50,200,ID.faction,i2));
				user.setDp(user.getFaction().points);
				handler.clearObjects();
			}else if(mouseOver(mx,my,830, 200, 380, 600)) {
				user.setFaction(new FactionTile(50,200,ID.faction,i3));
				user.setDp(user.getFaction().points);
				handler.clearObjects();
			}
			
		}
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if (mx > x && mx < x + width) {
			if(my > y && my < y + height) {
				return true;
			}else return false;
		}else return false;
	}
	
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		if(game.gameState == STATE.Menu) {
			
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
		}else if(game.gameState == STATE.Settings){
			Font fnt = new Font("arial", 1, 120);
			Font fnt2 = new Font("arial",1,60);
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Settings", 375, 150);
			g.setFont(fnt2);
			g.drawRect(80, 750, 200, 100);
			g.drawString("Back", 110, 820);
		}

	}
	
	
}
