package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 *
  * @author Xiaoyi Zhang  991711956
 *          Meichao Zhao  991719472 
 */
public class GofishPlayer extends Player{
    
   private ArrayList<GofishCard> hand;

   public GofishPlayer() {
		// TODO - implement GofishPlayer.GofishPlayer
	throw new UnsupportedOperationException();
   }

	/**
	 * 
	 * @param name
	 */
    public GofishPlayer(String name) {
		// TODO - implement GofishPlayer.GofishPlayer
	throw new UnsupportedOperationException();
    }

    public ArrayList<GofishCard> getHand() {
	return this.hand;
    }

	/**
	 * 
	 * @param hand
	 */
    public void setHand(ArrayList<GofishCard> hand) {
	this.hand = hand;
    }

    public void play() {
		// TODO - implement GofishPlayer.play
	throw new UnsupportedOperationException();
    }

    public boolean callFetch() {
		// TODO - implement GofishPlayer.callFetch
	throw new UnsupportedOperationException();
    }

    public boolean takeFetch() {
		// TODO - implement GofishPlayer.takeFetch
	throw new UnsupportedOperationException();
   }
}
