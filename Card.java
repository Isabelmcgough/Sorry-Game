public class Card{

   public int value;
   
   public Card(int n){
      if(n < 6){
         value = n;
      }
      else if (n > 5 && n < 8 ){
         value = n + 1;
      }
      else if(n > 7){
         value = n + 2;
      }
   }
   
   public int getValue(){
      return value;
   }
   
   // public String aboutCard(){
//       if(value == 0){
//          System.out.println("Move any one pawn from Start to a square occupied by any opponent, sending that pawn back to its own Start.");
//       }
//       else if(value == 1){
//       }
//       else if(value == 2){
//       }
//       else if(value == 3){
//       }
//       else if(value == 4){
//       }
//       else if(value == 5){
//       }
//       else if(value == 7){
//       }
//       else if(value == 8){
//       }
//       else if(value == 10){
//       }
//       else if(value == 11){
//       }
//       else{
//       }
//   }
}