package play;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

public class User {
	public int[] dice;
	private int vp, dp, cash;
	public FactionTile faction;
	public ArrayList<Tile> tiles;
	
	public User(int[] dice, int vp, int cash, int dp) {
		super();
		this.dice = dice;
		this.dp = dp;
		this.vp = vp;
		this.cash = cash;
		tiles = new ArrayList<Tile>();
		if (dice==null) {
			dice = new int[] {3,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		}
	}
	
	public void reset() {
		vp = 0;
		cash = 1;
		dice = new int[] {3,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	}

	public int getVp() {
		return vp;
	}

	public void setVp(int vp) {
		this.vp = vp;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
	public void tick() {
		
	}
	public void render(Graphics g) {
		Font fnt = new Font("arial", 1, 26);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("VP:", 40, 50);
		g.drawString(""+vp, 95, 50);
		g.drawString("DP:", 160, 50);
		g.drawString(""+dp, 215, 50);
		g.drawString("Cash:", 40, 90);
		g.drawString(""+cash, 120, 90);
		if(faction!=null) {
		g.drawString(faction.p1.getInfo(), 100, 800);
		g.fillOval(50, 800, 50, 50);
		
		}
	}

	public FactionTile getFaction() {
		return faction;
	}

	public void setFaction(FactionTile faction) {
		tiles.add(faction);
		this.faction = faction;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}
	public void AddPwr() {
		Tile tempT= tiles.get(tiles.size()-1);
		
		
	}
	public void AddWrlds(){
		
		
		
	}
	public void pwrCode() {
		
	}
	
	
	
}
