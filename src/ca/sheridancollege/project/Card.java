/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * Modifier: Meichao Zhao  991719472  
 *           Xiaoyi Zhang  991711956  
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    protected String suit;
    protected String rank;
    
    public Card(){
      
    }
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    public String getSuit(){
        return this.suit;
    }
    
    public void setSuit(String suit){
        this.suit=suit;
    }
    
     public String getRank(){
        return this.rank;
    }
     
     public void setRank(String rank){
        this.rank=rank;
    }
     
    @Override
    public abstract String toString();

}
