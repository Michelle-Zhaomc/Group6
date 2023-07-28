package ca.sheridancollege.project;
/**
 *
 * @author Xiaoyi Zhang  991711956
 *         Meichao Zhao  991719472  
 */
public class GofishCard extends Card{
    
     public GofishCard(){
        
    }
    
    public GofishCard(String suit, String rank){
        this.suit=suit;
        this.rank=rank;
    }
    
    @Override
    public String toString(){
        return suit+" "+rank;
    }  
}
