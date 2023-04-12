package the_real_stuff;
//Framework by Mr. Harwood

/*
 * Karim M.
 * April 01, 2023
 * Ocean map program that CORRECTLY generates oceans, lakes, and continents
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OceanMapStart
{
	public static void main(String[] args) {
		new OceanMapStart();
	}

	//Constants
	final static int GRID = 32; //size of grid or board
	final static int SQPXL = 26;  //how many pixels in a square
	final static int NUM_LAND = (GRID * GRID /2); //number of land tiles
	final static int LAND = 1;		//contsant for land tile
	final static int EMPTY = 0;		//constant for empty tile
	final static int LAKE = 33;		//any number can be used for LAKE and OCEAN
	final static int OCEAN = 89;
	final static Color COLOURBACK = Color.WHITE;	
	final static Color COLOUREMPTY = new Color(222,222,222);
	final static Color COLOURLAND = new Color(100,200,100);
	final static Color COLOURLAKE = new Color(100,100,255);
	final static Color COLOUROCEAN = new Color(10,10,130);
	DrawingPanel panel = new DrawingPanel();

	//Global variables	
	int[][] board = new int[GRID][GRID];

	OceanMapStart() {	//constructor
		initGame();
		createAndShowGUI();
	}


	void initGame() {		
		//clear board
		for (int i=0;i<GRID;i++) {
			for (int j=0;j<GRID;j++) {
				board[i][j]=EMPTY;
			}
		}

		//makeRandomMap();
		makeContinents();	//this doesn't exist yet. It is for Task #3.
	}

	void makeContinents() {
		
		//random numbers that are starting point for grid
		int i = (int) (Math.random() * GRID);
		int j = (int) (Math.random() * GRID);
		
		//initializes the current state of the while loop
		boolean done = false;
		
		//counts the number of landTiles
		int landTiles = 0;
		
		//sets the first random point of land
		board[i][j] = LAND;
		
		//starts the land counter
		landTiles++;
		while (!done) {
			
			//generates a random number
			double x = (Math.random());

			//for if the current tile is on the left/top border
			if (i == 0) i++;
			if (j == 0) j++;
			
			//for if the current tile is on the right/bottom border
			if (i == GRID - 1) i--;
			if (j == GRID - 1) j--;
			
			//everything else
			else {

				if (x < 0.25) i++;

				if (0.25 <= x && x < 0.5) i--;

				if (0.5 <= x && x < 0.75) j++;

				if (0.75 <= x) j--;

				//turns empty tiles into land when encountered
				if (board[i][j] == EMPTY) {
					board[i][j] = LAND;
					landTiles++;
					
					//shows current tile + number of tiles
					System.out.println(landTiles + "[" + i + "]" + "[" + j + "]");
				} else continue;
			}
			
			//exits the loop once there are 512 land tiles
			if (landTiles >= NUM_LAND) done = true;
		}
	}


	//Exactly half of the tiles are LAND and half are EMPTY, but they are all randomly placed.
	
	//ORIGINAL RANDOM MAP GENERATOR
	void makeRandomMap() {
		int i,j;
		boolean done = false;
		int landTiles = 0;
		while (!done) {
			i = (int)(Math.random() * GRID);
			j = (int)(Math.random() * GRID);
			int x = (int) (Math.random());

			if (board[i][j] == EMPTY) {
				board[i][j] = LAND;
				landTiles++;

				//SKILL ISSUE	
				//SKILL ISSUE	
				//SKILL ISSUE
				if (landTiles >= NUM_LAND) done=true;			
			}

		}	
	}

	//TASK 1: Fix the function "findLakes()" so that it colours all empty squares that are adjacent to this one.
	void findLakes(int x, int y) {

		panel.paintImmediately(0, 0, GRID*22, GRID*22);
		
		//makes the creation of lake/ocean tiles look cooler
		try { Thread.sleep(2); }
		catch (InterruptedException e) {}

		if (board[x][y] == EMPTY) {
			board[x][y] = LAKE;
			
			//checks if the squares next to it are empty
			if (x > 0 && board[x - 1][y] == EMPTY) findLakes(x - 1, y);
			if (y > 0 && board[x][y - 1] == EMPTY) findLakes(x, y - 1);

			if (x < GRID - 1 && board[x + 1][y] == EMPTY) findLakes(x + 1, y);
			if (y < GRID - 1 && board[x][y + 1] == EMPTY) findLakes(x, y + 1);

			//if coordinates reach border it sends it to the oceans method
			if (x == 0 || x == GRID - 1 || y == 0 || y == GRID - 1) findOceans(x, y);

		}
	}

	void findOceans(int x, int y) {
		
		//changes lakes to oceans if it reaches the border
		if (board[x][y] == LAKE || board[x][y] == EMPTY) {
			board[x][y] = OCEAN;
			
			//also changes empty/lake tiles to oceans when it reaches the border
			if (x > 0 && board[x - 1][y] != LAND) findOceans(x - 1, y);
			if (y > 0 && board[x][y - 1] != LAND) findOceans(x, y - 1);

			if (x < GRID - 1 && board[x + 1][y] != LAND) findOceans(x + 1, y);
			if (y < GRID - 1 && board[x][y + 1] != LAND) findOceans(x, y + 1);

			if (x == 0 || x == GRID - 1 || y == 0 || y == GRID - 1) return;
		}
	}

	void createAndShowGUI() {


		//JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Lakes, Oceans, Continents");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//Container content = frame.getContentPane(); //Content panes are never actually needed.
		// content.setLayout(new BorderLayout(2,2));	
		//content.add(panel, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.CENTER);
		//frame.setSize(SCRSIZE, SCRSIZE); //Not be needed since my JPanel has a preferred size
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo( null ); //must be after pack and setting size.
		frame.setVisible(true);

		//Once the panel is visible, initialize the graphics. (Is this before paintComponent is run?)
		panel.initGraphics();  //This is in a method so that resizing the screen will keep things working properly.

	}

	@SuppressWarnings("serial")
	class DrawingPanel extends JPanel	//inner class
	{		
		int jpanW, jpanH;
		int blockX, blockY;		

		DrawingPanel() {
			setBackground(COLOURBACK);
			//We can't do a lot of graphics initialization here in the constructor
			//because the panel size variables don't get initialized until the panel is displayed.
			this.setPreferredSize(new Dimension(GRID*22,GRID*22));
			this.addMouseListener(new MyMouseListener());			
		}

		//** Called by createGUI()
		void initGraphics() {
			jpanW = this.getSize().width;		
			jpanH = this.getSize().height;	
			blockX = (int)((jpanW/GRID)+0.5);
			blockY = (int)((jpanH/GRID)+0.5);
		}

		public void paintComponent(Graphics g) {

			//This colours in the background
			super.paintComponent(g);	

			//colour in squares
			for (int i = 0;i<GRID;i++) {
				for (int j = 0;j<GRID;j++) {
					switch(board[i][j]) {
					case EMPTY:
						g.setColor(COLOUREMPTY);
						break;
					case LAND:	
						g.setColor(COLOURLAND);
						break;
					case LAKE:		
						g.setColor(COLOURLAKE);
						break;
					case OCEAN:
						g.setColor(COLOUROCEAN);
						break;
					}
					//Create a 2pixel wide grid, by making the squares a little smaller than they really are, allowing the background to show through.
					g.fillRect(blockX*i+1, blockY*j+1, blockX-2, blockY-2);
				}
			}

			//			//Draw white grid
			//			g.setColor(Color.WHITE);
			//			for (int i=0;i<GRID;i++) {
			//				g.drawLine(blockX*i,0,blockX*i,jpanH);
			//				g.drawLine(0,blockY*i,jpanW,blockY*i);
			//			}

		}


		class MyMouseListener extends MouseAdapter	{	//inner class inside DrawingPanel
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				//calculate which square you clicked on
				int i = (int) x/blockX;
				int j = (int) y/blockY;

				//allow the right mouse button to toggle/cycle the terrain
				if (e.getButton() != MouseEvent.BUTTON1) {
					board[i][j] = board[i][j]==LAND ? EMPTY : LAND;
					repaint();
					return;
				}

				findLakes(i,j);								
				repaint();
			}		
		} //end of MyMouseListener class

	} //end of DrawingPanel class

}