
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

	Drone d;
	public KeyInput(Drone d) {
		this.d = d;
	}
	public void keyPressed(KeyEvent e) {
		d.keyPressed(e); // this will call the function keyPressed in class Player
	}
	public void keyReleased(KeyEvent e)
	{
		d.keyReleased(e);// this will call the function keyPressed in class Player
	}
}
