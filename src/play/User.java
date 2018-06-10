package play;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class User {
	public int[] dice;
	private int vp, dp, cash;
	public FactionTile faction;

	
	public User(int[] dice, int vp, int cash, int dp) {
		super();
		this.dice = dice;
		this.dp = dp;
		this.vp = vp;
		this.cash = cash;
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
		
	}

	public FactionTile getFaction() {
		return faction;
	}

	public void setFaction(FactionTile faction) {
		this.faction = faction;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}
	
	
	
}
