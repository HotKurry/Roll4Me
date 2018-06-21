package play;

import java.awt.Color;
import java.awt.Graphics;

public class Tile extends GameObject {
	protected int points;
	protected int ID;
	protected String title;
	protected Power p1, p2, p3, p4;
	protected Color c;
	protected Color gr = new Color(27, 94, 32);
	protected Color br = new Color(62, 39, 35);
	protected Color bl = new Color(128,222,234);
	protected Color pu = new Color(49,27,146);
	protected Color re = new Color(183,28,28);
	
	
	public Tile(int x, int y, ID id, int ID) {
		super(x, y, id);
		this.ID =ID;
		getSTATS(ID);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	
	protected void getSTATS(int numb) {
		if(numb==0) {
			c = Color.yellow;
			points = 1;
			p1 = new Power(13);

			return;
		}else if(numb==1) {
			c = br;
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
			c = bl;
			points = 2;
			p1 = new Power(15);

		}else if(numb==6) {
			c = gr;
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
			
		}else if(numb==9) {
			c=gr;
			points=3;
			p1 = new Power(21);
			p2 = new Power(11);
			p3 = new Power(3);
			
		}else if(numb==10) {
			c = null;
			points = 3;
			p1=new Power(26);
			p2=new Power(27);
			
		}else if(numb==11) {
			c= bl;
			points=1;
			p1=new Power(7);
		}else if(numb==12) {
			c = null;
			points =6;
			p1 = new Power(49);
			//2+VP per Brown Team!!!
		}else if(numb==13) {
			c=br;
			points=2;
			p1=new Power(8);
		}else if(numb==14) {
			c = null;
			points = 4;
			p1=new Power(70);
		}else if(numb==15) {
			c= Color.white;
			points=2;
			p1=new Power(2);
			p2=new Power(2);

		}else if(numb==16) {
			c = null;
			points = 6;
			p1=new Power(55);
			//ADD HALF total blue team DP
		}else if(numb==17) {
			c= Color.white;
			points = 3;
			p1=new Power(5);
		}else if(numb==18) {
			//Blank
			c = null;
		}else if(numb==19) {
			//Blank
			
		}else if(numb==20) {
			//Blank
			c = null;

		}else if(numb==21) {
			//Blank
		}else if(numb==22) {
			c = null;
		}else if(numb==23) {
			//Blank
		}else if(numb==24) {
			c = null;
		}else if(numb==25) {
			//Blank
		}else if(numb==26) {
			c = null;
		}else if(numb==27) {
			//Blank
		}else if(numb==28) {
			c = null;
		}else if(numb==29) {
			//Blank
			
		}else if(numb==30) {
			c = null;
		}else if(numb==31) {
			//Blank
		}else if(numb==32) {
			c = null;
		}else if(numb==33) {
			//Blank
		}else if(numb==34) {
			c = null;
		}else if(numb==35) {
			//Blank
		}else if(numb==36) {
			c = null;
		}else if(numb==37) {
			//Blank
		}else if(numb==38) {
			c = null;
		}else if(numb==39) {
			//Blank
			
		}else if(numb==40) {
			c = null;
		}else if(numb==41) {
			//Blank
		}else if(numb==42) {
			c = null;
		}else if(numb==43) {
			//Blank
		}else if(numb==44) {
			c = null;
		}else if(numb==45) {
			//Blank
		}else if(numb==46) {
			c = null;
		}else if(numb==47) {
			//Blank
		}else if(numb==48) {
			c = null;
		}else if(numb==49) {
			//Blank
			
		}else if(numb==50) {
			//Blank
			c = null;
		}else if(numb==51) {
			//Blank
			
		}else if(numb==52) {
			c = null;
			//Blank
		}else if(numb==53) {
			//Blank
		}else if(numb==54) {
			//Blank
			c = null;
		}else if(numb==55) {
			//Blank
		}else if(numb==56) {
			//Blank
			c = null;
		}else if(numb==57) {
			//Blank
		}else if(numb==58) {
			//Blank
			c = null;
		}else if(numb==59) {
			//Blank
			
		}else if(numb==60) {
			//Blank
			c = null;
			return;
		}else if(numb==61) {
			//Blank
		}else if(numb==62) {
			//Blank
			c = null;
		}else if(numb==63) {
			//Blank
		}else if(numb==64) {
			//Blank
			c = null;
		}else if(numb==65) {
			//Blank
		}else if(numb==66) {
			//Blank
			c = null;
		}else if(numb==67) {
			//Blank
		}else if(numb==68) {
			//Blank
			c = null;
		}else if(numb==69) {
			//Blank
			
		}else if(numb==70) {
			//Blank
			c = null;
			return;
		}else if(numb==71) {
			//Blank
		}else if(numb==72) {
			//Blank
			c = null;
		}else if(numb==73) {
			//Blank
		}else if(numb==74) {
			//Blank
			c = null;
		}else if(numb==75) {
			//Blank
		}else if(numb==76) {
			//Blank
			c = null;
		}else if(numb==77) {
			//Blank
		}else if(numb==78) {
			//Blank
			c = null;
		}else if(numb==79) {
			//Blank
			
		}else if(numb==80) {
			//Blank
			c = null;
			return;
		}else if(numb==81) {
			//Blank
		}else if(numb==82) {
			//Blank
			c = null;
		}else if(numb==83) {
			//Blank
		}else if(numb==84) {
			//Blank
			c = null;
		}else if(numb==85) {
			//Blank
		}else if(numb==86) {
			//Blank
			c = null;
		}else if(numb==87) {
			//Blank
		}else if(numb==88) {
			//Blank
			c = null;
		}else if(numb==89) {
			//Blank
			
		}else if(numb==90) {
			//Blank
			c = null;
			return;
		}else if(numb==91) {
			//Blank
		}else if(numb==92) {
			//Blank
			c = null;
		}else if(numb==93) {
			//Blank
		}else if(numb==94) {
			//Blank
			c = null;
		}else if(numb==95) {
			//Blank
		}else if(numb==96) {
			//Blank
			c = null;
		}else if(numb==97) {
			//Blank
		}else if(numb==98) {
			//Blank
			c = null;
		}else if(numb==99) {
			//Blank
			
		}else if(numb==100) {
			//Blank
			c = null;
			return;
		}else if(numb==101) {
			//Blank
		}else if(numb==102) {
			//Blank
			c = null;
		}else if(numb==103) {
			//Blank
		}else if(numb==104) {
			//Blank
			c = null;
		}else if(numb==105) {
			//Blank
		}else if(numb==106) {
			//Blank
			c = null;
		}else if(numb==107) {
			//Blank
		}else if(numb==108) {
			//Blank
			c = null;
		}else if(numb==109) {
			//Blank
			
		}else if(numb==110) {
			//Blank
			c = null;
			return;
		}else if(numb==111) {
			//Blank
		}else if(numb==112) {
			//Blank
			c = null;
		}else if(numb==113) {
			//Blank
		}else if(numb==114) {
			//Blank
			c = null;
		}else if(numb==115) {
			//Blank
		}else if(numb==116) {
			//Blank
			c = null;
		}else if(numb==117) {
			//Blank
		}else if(numb==118) {
			//Blank
			c = null;
		}else if(numb==119) {
			//Blank
			
		}else if(numb==120) {
			//Blank
			c = null;
			return;
		}else if(numb==121) {
			//Blank
		}else if(numb==122) {
			//Blank
		}else if(numb==123) {
			//Blank
		}else if(numb==124) {
			//Blank
		}else if(numb==125) {
			//Blank
		}else if(numb==126) {
			//Blank
		}else if(numb==127) {
			//Blank
		}else if(numb==128) {
			//Blank
		}else if(numb==129) {
			//Blank
			
		}else if(numb==130) {
			//Blank
			return;
		}else if(numb==131) {
			//Blank
		}else if(numb==132) {
			//Blank
		}else if(numb==133) {
			//Blank
		}else if(numb==134) {
			//Blank
		}else if(numb==135) {
			//Blank
		}else if(numb==136) {
			//Blank
		}else if(numb==137) {
			//Blank
		}else if(numb==138) {
			//Blank
		}else if(numb==139) {
			//Blank
			
		}
	}
	
	
	
	
	
	
	
	
}
