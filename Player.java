public class Player{
   public String name;
   public boolean won;
   
   public Player(String name, boolean won){
      this.name = name;
      this.won = won;
   }
   
   public String getName(){
      return name;
   }
   
   public boolean hasWon(){
      return won;
   }
   
}