package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
	
		JFrame windown = new JFrame("Tetris");
		windown.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windown.setResizable(false);
		GamePanel gp = new GamePanel();
		windown.add(gp);
		windown.pack();
		
		windown.setLocationRelativeTo(null);
		windown.setVisible(true);
		gp.launchGame();
	}

}
