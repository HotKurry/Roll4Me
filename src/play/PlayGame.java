package play;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class PlayGame extends Canvas implements Runnable {
	
	private static final long serialVersionUID = -2555372242485882138L;
	public static final int WIDTH = 1280, HEIGHT = WIDTH / 12* 9;

	private Thread thread;
	private boolean running = false;
	private Handler handler;
	private Menu menu;
	
	
	public enum STATE{
		Menu,
		Settings,
		Game,
	};
	public STATE gameState = STATE.Menu;
	
	public PlayGame() {
		handler = new Handler();
		menu = new Menu(this, handler);
		this.addMouseListener(menu);
		new Window(WIDTH, HEIGHT, "Roll For Something", this);
		


	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running) {
			long now = System.nanoTime();
			delta += (now- lastTime)/ns;
			lastTime = now;
			while(delta >=1) {
				tick();
				delta--;
			}
			if(running) 
				render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: "+ frames);
				frames = 0;
			}
		}
		stop();
	}
	public void tick() {
		handler.tick();
		if(gameState ==STATE.Game) {
			//Do stuff in game state
		}else if(gameState==STATE.Menu) {
			menu.tick();
		}
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs==null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		handler.render(g);
		if(gameState==STATE.Game) {
			//do stuff in game State
		}else if(gameState==STATE.Menu ||gameState==STATE.Settings ){
			menu.render(g);
		}
		
		
		g.dispose();
		bs.show();
	}
	
	
	
	public static void main(String[] args) {
		new PlayGame();
	}

}
