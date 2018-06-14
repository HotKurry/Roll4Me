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
	public ArrayList<String> powList;
	
	public User(int[] dice, int vp, int cash, int dp) {
		super();
		this.dice = new int[] {3,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		this.dp = dp;
		this.vp = vp;
		this.cash = cash;
		tiles = new ArrayList<Tile>();
		powList = new ArrayList<String>();

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
		Font fnt2 = new Font("arial", 1, 40);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("VP:", 40, 50);
		g.drawString(""+vp, 95, 50);
		g.drawString("DP:", 160, 50);
		g.drawString(""+dp, 215, 50);
		g.drawString("Cash:", 40, 90);
		g.drawString(""+cash, 120, 90);
		g.drawString("Devs", 620, 45);
		g.drawString("Fans", 620, 115);
		int shifter = 0;
		g.setFont(fnt2);
		for(int j = 0; j<dice.length-3;j+=2) {
			if(j>=12) {
				g.setColor(Color.yellow);
			}else if(j>=10) {
				g.setColor(Color.green);
			}else if(j>=8) {
				g.setColor(Color.orange);
			}else if(j>=6) {
				g.setColor(Color.cyan);
			}else if(j>=4) {
				g.setColor(Color.magenta);
			}else if(j>=2) {
				g.setColor(Color.red);
			}
			
			g.fillRect(700+shifter, 10, 50, 50);
			g.fillRect(700+shifter, 80, 50, 50);
			g.setColor(Color.black);
			g.drawString(""+dice[j], 715+shifter, 50);
			g.drawString(""+dice[j+1], 715+shifter, 120);
			
			shifter+=80;
			
		}
		
		
		
		//if(faction!=null) {
		//g.drawString(faction.p1.getInfo(), 100, 800);
		//g.fillOval(50, 800, 50, 50);
		//}
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
		pwrCode(tempT.p1);
		if(tempT.p2!=null) {
			pwrCode(tempT.p2);
			if(tempT.p3!=null) {
				pwrCode(tempT.p3);
				if(tempT.p4!=null) {
					pwrCode(tempT.p4);
					
				}
			}
		}
		
		
	}
	public void AddWrlds(){
		
		
	}
	public void pwrCode(Power p) {
		int i = p.getId();
		if(i<14) {
			dice[i]+=1;
		}else if(i ==19) {
			cash +=1;
		}else if(i==20) {
			cash=8;
		}else {
			powList.add(p.getInfo());
		}
		
		
		
		
	}
	
	
	
}
