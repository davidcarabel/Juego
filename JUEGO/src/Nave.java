import java.awt.Graphics2D;

public class Nave extends ElementoVisual {
	public Nave() {
		x = 30;
		y = 30;
		w = 200;
		h = 200;

	}

	public void pintar(Graphics2D g) {
		super.pintar(g);
		g.setColor(color);
		g.fillRect(x, y, w, h);
	}
	public void procesarGravedad(int gravedad,int limiteSuelo){
		if(y+h<limiteSuelo)y+=gravedad;
	}
}