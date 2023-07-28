/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @Modiifer Xiaoyi Zhang  991711956
 *           Meichao Zhao  991719472 
 */
public abstract class Game {

    private String name;//the title of the game
    private ArrayList<Player> players;// the players of the game
    
    public Game(){}

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

   /**
	 * Play the game. This might be one method or many method calls depending on your game.
	 */
	public abstract void notifyPlayers();

	/**
	 * When the game is over, use this method to declare and display a winning player.
	 */
	public abstract void declareWinner();

}//end class
