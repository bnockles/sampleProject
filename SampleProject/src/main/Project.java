/**
 * 
 */
package main;

import guiPractice8.GUIApplication;

/**
 * @author Nockles
 *
 */
public class Project extends GUIApplication {

	/**
	 * static fields
	 */
	public static Project game;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see guiPractice8.GUIApplication#initScreen()
	 */
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		game = new Project();
		Thread go = new Thread(game);
		go.start();
	}

}
