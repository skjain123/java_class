import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CharacterMoveExperiment implements KeyListener
{

	public double playerX = 0;
	public double playerY = 0;
	
	public boolean left = false;
	public boolean right = false;
	public boolean up = false;
	public boolean down = false;
	
	Panel panel = new Panel(playerX, playerY);
	
	JFrame frame = new JFrame("Character Move Experiment");
	//Container center = new Container();
	
	public CharacterMoveExperiment() 
	{
		frame.setSize(600,600);
		frame.addKeyListener(this);
		
		frame.add(panel, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CharacterMoveExperiment();
	}

	@Override
	public void keyTyped(KeyEvent event) {
		//sdf
	}

	@Override
	public void keyPressed(KeyEvent event) {
		char k = (char)event.getKeyCode();
		
		if (k == 'W' || event.getKeyCode() == 38) 
		{
			playerY += 1.10;
			playerY = Math.round(playerY * 100) / 100;
			System.out.println(playerX + "," + playerY);
		}
		if (k == 'A' || event.getKeyCode() == 37) 
		{
			playerX -= 1.10;
			playerY = Math.round(playerX * 100) / 100;
			System.out.println(playerX + "," + playerY);
		}
		if (k == 'S' || event.getKeyCode() == 40) 
		{
			playerY -= 1.10;
			playerY = Math.round(playerY * 100) / 100;
			System.out.println(playerX + "," + playerY);
		}
		if (k == 'D' || event.getKeyCode() == 39) 
		{
			playerX += 1.10;
			playerY = Math.round(playerX * 100) / 100;
			System.out.println(playerX + "," + playerY);
		}
		frame.repaint();
	}

	@Override
	public void keyReleased(KeyEvent event) {
		char k = (char)event.getKeyCode();
		
		if (k == 'W' || event.getKeyCode() == 38) 
		{
			up = false;
			frame.repaint();
		}
		if (k == 'A' || event.getKeyCode() == 37) 
		{
			right = false;
			frame.repaint();
		}
		if (k == 'S' || event.getKeyCode() == 40) 
		{
			down = false;
			frame.repaint();
		}
		if (k == 'D' || event.getKeyCode() == 39) 
		{
			left = false;
			frame.repaint();
		}
	}
}