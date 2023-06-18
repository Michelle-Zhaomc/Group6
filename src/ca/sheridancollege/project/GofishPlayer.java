/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 *
  * @author Xiaoyi Zhang  991711956
 *          Meichao Zhao  991719472 
 */
public class GofishPlayer extends Player{
    
    private String role;
    private ArrayList<Card> cardsOnHand;// cards on each player's hand
    
    public GofishPlayer(String name){
        super(name);
        this.cardsOnHand= new ArrayList<>();
        //this.groupPlayers = new GofishPlayer[numOfPlayer()];
        //this.cardsGroup = new GroupOfCards(size);
    }
    
    /**/
    
    public void addPlayerCards(Card card){
            this.cardsOnHand.add(card);   
    }
    
    public void removePlayerCards(Card card){
            this.cardsOnHand.remove(card);
    }
    
    public ArrayList<Card> getPlayerCards(){
        return this.cardsOnHand;
    }
    
    public void setRole(String role){
        this.role=role;
    }
    
    public String getRole(){
        return this.role;
    }
    
    public int numCards(){
     return cardsOnHand.size();
    }
    
    public String maxCard(){
        String maxCard=null;
        int maxCount=0;
        
        for(int i =0; i<cardsOnHand.size(); i++){
            int count=0;
            for(int j=0; j<cardsOnHand.size(); j++){
                if(cardsOnHand.get(i).getCardRank().equals(cardsOnHand.get(j).getCardRank())){
                
                    count++;
                }
            }
            if (count>maxCount){
                maxCount=count;
                maxCard=cardsOnHand.get(i).getCardRank();
            }
        }
        
        return maxCard;
    }
    
    
    @Override
    public void play(){
        System.out.println("TBD");
    }
}
