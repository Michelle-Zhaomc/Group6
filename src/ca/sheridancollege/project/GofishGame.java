package ca.sheridancollege.project;

/**
 *
  * @author Xiaoyi Zhang  991711956
 *          Meichao Zhao  991719472 
 */
public class GofishGame extends Game{
    GofishDeck gofishDeck;
    
    public GofishGame(){
    }
    
    public GofishGame(String name, GofishDeck gofishDeck){
        super(name);
        this.gofishDeck = gofishDeck;
    }
    
    public void addPlayer(int player, int GofishPlayer) {
		// TODO - implement GofishGame.addPlayer
		throw new UnsupportedOperationException();
	}
       
    @override
	public void notifyPlayers() {
		// TODO - implement GofishGame.notifyPlayers
		throw new UnsupportedOperationException();
	}

	public void declareWinner() {
		// TODO - implement GofishGame.declareWinner
		throw new UnsupportedOperationException();
	}
}
