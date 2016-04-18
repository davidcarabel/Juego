import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Menu implements KeyListener {
	MyCanvas myCanvas;

	public Menu(MyCanvas myCanvas) {
		this.myCanvas = myCanvas;
		this.myCanvas.addKeyListener(this);

	}

	public void menuPrincipal(MyCanvas myCanvas) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == 'a') {
			myCanvas.setIESTADO_ACTUAL(MyCanvas.IESTADO_JUEGO);
		} else if (e.getKeyChar() == 'b') {
			myCanvas.setIESTADO_ACTUAL(MyCanvas.IESTADO_MENU);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == 38) {
			myCanvas.SubirMenu();

		} else if (e.getKeyCode() == 40) {
			myCanvas.BajarMenu();

		} else if (e.getKeyCode() == 10 && this.myCanvas.iposicion_menu == 0) {
			myCanvas.setIESTADO_ACTUAL(myCanvas.IESTADO_JUEGO);

		} else if (e.getKeyCode() == 10 && this.myCanvas.iposicion_menu == 3) {
			System.exit(0);
		}

	}
}