package Program;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import InterFace.View;

public class program {

	public static BufferedImage image;
	static Graphics gp;
	
	public static void choose()
	{
		Random rd = new Random();
		String tmp = "/Users/kevin/Documents/workspace/choosefood/food/"+rd.nextInt(29) + ".jpg";
		File file = new File(tmp);
		System.out.println(tmp);
		try
		{
			image = ImageIO.read(file);
		}
		catch (FileNotFoundException ex)
		{
			Logger.getLogger(program.class.getName()).log(Level.SEVERE, null , ex);
		}
		catch(IOException ex)
		{
			Logger.getLogger(program.class.getName()).log(Level.SEVERE, null , ex);
		}
		
		gp = View.photo.getGraphics();
		Graphics2D g2d = (Graphics2D)gp;
		g2d.drawImage(image, 0, 0, null);
	}
}
