
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

// this class may be put in a seperate package
public class Drone extends Position{
	
	private String playerImage = "/images/Picture2.png"; // the images folder can not be in planeProject, but parallel with it under src
	int velocityX = 0;
	int velocityY = 0;

	public Drone(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
	}
	
	public void update() {
		x += velocityX;
		y += velocityY; // we may also make the drone move right left 
		
		//check border line
		if(y < 0)
			y = 0;
		if(y > 432)
			y = 432;
		if(x < 0)
			x = 0;
		if(x > 600)
			x = 600;
	}
	// all these keys functions wont work without keyListener
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_UP)
		{
			velocityY = -4;
		}else if(key == KeyEvent.VK_DOWN) {
			velocityY = 4;
		}else if(key == KeyEvent.VK_RIGHT) {
			velocityX = 4;
		}else if(key == KeyEvent.VK_LEFT) {
			velocityX = -4;
		}
	}
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();

		if(key == KeyEvent.VK_UP)
		{
			velocityY = 0;
		}else if(key == KeyEvent.VK_DOWN) {
			velocityY = 0;
		}else if(key == KeyEvent.VK_RIGHT) {
			velocityX = 0;
		}else if(key == KeyEvent.VK_LEFT) {
			velocityX = 0;
		}
	}
	
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), x, y, null);// or 0 for null
	}

	
	public Image getPlayerImage()
	{
		ImageIcon i = new ImageIcon(getClass().getResource(playerImage));
		return i.getImage();
		
	}
}
