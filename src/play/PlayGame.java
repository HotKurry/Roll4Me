package play;

import java.awt.Canvas;

public class PlayGame extends Canvas implements Runnable {
	
	private static final long serialVersionUID = -2555372242485882138L;
	public static final int WIDTH = 1280, HEIGHT = WIDTH / 12* 9;

	private Thread thread;
	private boolean running = false;
	
	public PlayGame() {
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
		
	}
	

	public static void main(String[] args) {
		new PlayGame();
	}

}
