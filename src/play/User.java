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
	public ArrayList<Teams> teams;
	
	
	public User(int[] dice, int vp, int cash, int dp) {
		super();
		this.dice = new int[] {3,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		this.dp = dp;
		this.vp = vp;
		this.cash = cash;
		teams = new ArrayList<Teams>();
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
		Font fnt3 = new Font("arial", 1, 14);
		
		//DP, VP and cash tracking
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
		
		
		
		//Dice Generator
		int shifter = 0;
		g.setFont(fnt2);
		for(int j = 0; j<dice.length-3;j+=2) {
			if(j>=12) {
				g.setColor(Color.yellow);
			}else if(j>=10) {
				//green
				g.setColor(new Color(27, 94, 32));
			}else if(j>=8) {
				g.setColor(new Color(62, 39, 35));
				//brown
			}else if(j>=6) {
				//teal
				g.setColor(new Color(128, 222, 234));
			}else if(j>=4) {
				//purple
				g.setColor(new Color(49, 27, 146));
			}else if(j>=2) {
				//red
				g.setColor(new Color(183, 28, 28));
			}
			
			g.fillRect(700+shifter, 10, 50, 50);
			g.fillRect(700+shifter, 80, 50, 50);
			if(j<2  || j>11 || j==6) {			
				g.setColor(Color.black);
			}else {
				g.setColor(Color.white);
			}
			g.drawString(""+dice[j], 715+shifter, 50);
			g.drawString(""+dice[j+1], 715+shifter, 120);
			
			shifter+=80;
			
		}
		int slider = 0;
		//World Generator
		for(Teams t: teams) {
			g.setColor(t.c);
			g.fillOval(10+slider,850,50, 50);
			if(t.die2!=null) {
				g.setColor(t.die);
				g.fillRect(12+slider, 820, 20, 20);
				g.setColor(t.die2);
				g.fillRect(42+slider, 820, 20, 20);
			}else if(t.die!=null) {
				g.setColor(t.die);
				g.fillRect(25+slider, 820, 25, 25);
				
			}
			slider+=70;
		}
		shifter = 0;
		//PowerList
		g.setColor(Color.white);
		g.setFont(fnt3);
		for(String s: powList) {
			g.drawString(s, 10, 150+shifter);
			shifter+=30;
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
		Tile tempT= tiles.get(tiles.size()-1);
		if(tempT.c!=null && !tempT.c.equals(Color.white)) {
			teams.add(new Teams(tempT.c,0));
		}
		
	}
	public void pwrCode(Power p) {
		int i = p.getId();
		if(i<14) {
			dice[i]+=1;
		}else if(i==14) {
			//red
			teams.get(teams.size()-1).setDie(new Color(183, 28, 28));
		}else if(i==15) {
			//cyan
			teams.get(teams.size()-1).setDie(new Color(128, 222, 234));
		}else if(i==16) {
			//brown
			teams.get(teams.size()-1).setDie(new Color(62, 39, 35));
		}else if(i==17) {
			//green
			teams.get(teams.size()-1).setDie(new Color(27, 94, 32));
		}else if(i==18) {
			//yellow
			teams.get(teams.size()-1).setDie(Color.yellow);
		}else if(i ==19) {
			cash +=1;
		}else if(i==20) {
			cash=8;
		}else {
			powList.add(p.getInfo());
		}
		
		
		
		
	}
	
	
	
}
