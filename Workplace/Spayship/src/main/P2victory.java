package main;

import javax.swing.ImageIcon;

	public class P2victory extends Sprite implements Pins {
		
		private final int P2VICTORY_Y = 230;
		private final int P2VICTORY_X = 100;
		private final String p2victory = "images/ufowins.png";
	
		public P2victory() {
			initBg();
		}

		private void initBg() {
			ImageIcon ii = new ImageIcon(p2victory);

	        setImage(ii.getImage());
	        setX(P2VICTORY_X);
	        setY(P2VICTORY_Y);
			
		}
	}

	
