
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Plane extends Position{
	private String planeImage = "/images/Picture1.png"; // pass the image in
	int speed = 2;

	public Plane(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getPlaneImage(), x, y, null);
	}
	
	public void update()
	{
		//x+=speed;
		 Random rand2 = new Random(); 
		    int n2 = 30 * rand2.nextInt(10) + 600;
		x -= speed;
		if(x == -150) // to make plane come out from the right again 
			x = n2;
		
	}
	public Image getPlaneImage()
	{
		ImageIcon i = new ImageIcon(getClass().getResource(planeImage));
		return i.getImage();
	}
	
}
