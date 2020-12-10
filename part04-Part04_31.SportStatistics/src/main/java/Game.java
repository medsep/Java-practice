/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class Game {
    
    private String homeTeam;
    private String opposingTeam;
    private int homeScore;
    private int opposingScore;
    
    public Game(String homeTeam, String opposingTeam, int homeScore, int opposingScore) {
    this.homeTeam = homeTeam;
    this.opposingTeam = opposingTeam;
    this.homeScore = homeScore;
    this.opposingScore = opposingScore;
}
   public String getHomeTeam(){
       return homeTeam;
   }
   
   public String getOpposingTeam(){
       return opposingTeam;
   }
   
   public boolean isWinner(String team){
       if (team.equals(homeTeam) && homeScore>opposingScore){
           return true;
       }
       
        if (team.equals(opposingScore) && opposingScore>homeScore){
           return true;
   }
        return false;
}
}
        
