package play;

import java.awt.Color;

public class Teams {
	protected Color c;
	protected Color die;
	protected Color die2;

	
	public Teams(Color c, int proj) {
		super();
		this.c = c;

	}
	
	public Color getC() {
		return c;
	}
	
	public void setC(Color c) {
		this.c = c;
	}

	public Color getDie() {
		return die;
	}

	public void setDie(Color die) {
		this.die = die;
	}

	public Color getDie2() {
		return die2;
	}

	public void setDie2(Color die2) {
		this.die2 = die2;
	}

}
