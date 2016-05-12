import java.awt.*;
import java.io.*;
import java.util.*;

public class Sorry{
   public static void main(String[] args){
      //Board board = new Board();
      Board.getBoard();
      Player user = new Player("You", false); 
      Player comp1 = new Player("Team Blue", false);
      Player comp2 = new Player("Team Yellow", false);
      Player comp3 = new Player("Team Green", false);
      while(user.hasWon() == true){
         oneTurn(user);
         oneTurn(comp1);
         oneTurn(comp2);
         oneTurn(comp3);
      }
   
   }
   
   public static void oneTurn(Player player){
      getCard(player.getName());
      //int turn = 1;    
      // if(turn % 4 == 0){
//          getCard(user.getName());         
//       }
//       else if(turn % 4 == 1){
//          getCard(comp1.getName());
//       }
//       else if(turn % 4 == 2){
//          getCard(comp2.getName());
//       }
//       else{
//          getCard(comp3.getName());
//       }
      //turn++;
   }
   
   public static void getCard(String word){
      Random rand = new Random();  
      int  n = rand.nextInt(11);
      if(n == 0){
         System.out.println(word + " got a SORRY!");
      }
      else{
         Card card = new Card(n);
         if(card.getValue() == 8 || card.getValue() == 11){
            System.out.println(word + " got an " + card.getValue());
         }
         else{
            System.out.println(word + " got a " + card.getValue());
         }
      }
   }

}