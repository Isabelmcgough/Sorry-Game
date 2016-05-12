import java.awt.Color;
import javax.swing.*;

public class Board extends JFrame{
   private static Board board = new Board();
   private Board(){
      new JFrame("SORRY!");
      setSize(800,800);
      JLabel background = new JLabel(new ImageIcon("board.jpg"));
      add(background);
      background.setLayout(null);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setVisible(true);      
   }
   
   public static Board getBoard(){
      //I edited this thing! :)
      return board;
   }

}