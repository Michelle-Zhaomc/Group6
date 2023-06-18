/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
  * @author Xiaoyi Zhang  991711956
 *          Meichao Zhao  991719472 
 */
public class GroupOfGofishPlayer {
    
    public static final int FISRSTHAND =5;
    private GroupOfCards cardsGroup;
    private Player[] groupPlayers;
    private int numPlayers;
    
    public GroupOfGofishPlayer(){}
    
    public GroupOfGofishPlayer(GroupOfCards cardsGroup, int numPlayers){
         this.cardsGroup = cardsGroup;
         this.numPlayers = numPlayers;
         this.groupPlayers = new Player[numPlayers];
    }

}
