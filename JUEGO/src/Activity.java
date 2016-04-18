import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Activity extends TimerTask{
	 static JFrame jFramePrincipal;
	 Menu menu;
	 Juego juego;
	 MyCanvas myCanvas;

	public Activity() {
		jFramePrincipal = new JFrame();
		jFramePrincipal.setBounds(300, 300, 800, 800);

		 myCanvas = new MyCanvas();
		 menu=new Menu(myCanvas);
		 juego=new Juego(myCanvas);
		jFramePrincipal.add(myCanvas);
		jFramePrincipal.setVisible(true);
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(this, 0, 300);
	}

	public static void main(String[] args) {
		new Activity();

	}
	
	@Override
	public void run() {
		juego.procesarJuego();
		myCanvas.repaint();
		
	}
}