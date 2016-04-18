import java.awt.*;
import java.util.ArrayList;
public class MyCanvas extends Canvas {
	public static int IESTADO_MENU = 1;
	public static int IESTADO_JUEGO = 2;
	public int IESTADO_ACTUAL = IESTADO_MENU;
	public int iposicion_menu = 0;
	ArrayList<ElementoVisual> EV;

	public MyCanvas() {
		super();
		EV = new ArrayList<ElementoVisual>();
	}

	public void setAñadirElementoVisual(ElementoVisual element) {
		EV.add(element);
	}

	public void setIESTADO_ACTUAL(int IESTADO_ACTUAL) {
		this.IESTADO_ACTUAL = IESTADO_ACTUAL;
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graphics2D = (Graphics2D) g;

		if (IESTADO_ACTUAL == IESTADO_MENU) {
			PaintMenu(graphics2D);
		} else if (IESTADO_ACTUAL == IESTADO_JUEGO) {
			PaintJuego(graphics2D);
		}

		for (int i = 0; i < EV.size(); i++) {
			((ElementoVisual) EV.get(i)).pintar((Graphics2D) g);
		}

	}

	public void setPosicionMenu(int iposm) {
		iposicion_menu = iposm;
		repaint();
	}

	public void BajarMenu() {
		iposicion_menu++;
		if (iposicion_menu > 3)
			iposicion_menu = 0;
		repaint();
	}

	public void SubirMenu() {
		iposicion_menu--;
		if (iposicion_menu < 0)
			iposicion_menu = 3;
		repaint();
	}

	public void PaintMenu(Graphics2D p) {
		setBackground(Color.blue);
		p.setColor(Color.black);
		if (iposicion_menu == 0)
			p.setColor(Color.RED);
		p.drawString("START", 350, 350);
		p.setColor(Color.black);

		if (iposicion_menu == 1)
			p.setColor(Color.RED);
		p.drawString("SETTINGS", 350, 370);
		p.setColor(Color.black);

		if (iposicion_menu == 2)
			p.setColor(Color.RED);
		p.drawString("NO SIRVE", 350, 390);
		p.setColor(Color.black);

		if (iposicion_menu == 3)
			p.setColor(Color.RED);
		p.drawString("EXIT", 350, 410);
		p.setColor(Color.black);
	}

	public void PaintJuego(Graphics2D q) {
		setBackground(Color.black);
		q.setColor(Color.GREEN);
		q.drawString("JUEGO", 350, 390);
	}
}