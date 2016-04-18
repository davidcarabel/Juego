import java.awt.Color;

public class Juego {

	MyCanvas myCanvas;
	Nave nav1,nav2,nav3,nav4;
	int iGravedad=5;

	public Juego(MyCanvas miCanvas) {
		this.myCanvas = miCanvas;
		initNaves();
	}

	private void initNaves() {
		nav1 = new Nave();
		nav1.setCordenadas(150, 180);
		nav1.setAnchoAlto(95, 65);
		nav1.setColor(Color.RED);
		myCanvas.setAñadirElementoVisual(nav1);
		nav2 = new Nave();
		nav2.setCordenadas(85, 30);
		nav2.setAnchoAlto(85, 35);
		nav2.setColor(Color.PINK);
		myCanvas.setAñadirElementoVisual(nav2);
		nav3 = new Nave();
		nav3.setCordenadas(15, 90);
		nav3.setAnchoAlto(15, 25);
		nav3.setColor(Color.BLACK);
		myCanvas.setAñadirElementoVisual(nav3);
		nav4 = new Nave();
		nav4.setCordenadas(260, 145);
		nav4.setAnchoAlto(190, 155);
		nav4.setColor(Color.GRAY);
		myCanvas.setAñadirElementoVisual(nav4);
	}
	public void procesarJuego() {
		nav1.procesarGravedad(5,myCanvas.getHeight());
		nav2.procesarGravedad(10,myCanvas.getHeight());
		nav3.procesarGravedad(15,myCanvas.getHeight());
		nav4.procesarGravedad(25,myCanvas.getHeight());
	}

}
