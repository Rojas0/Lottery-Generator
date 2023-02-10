//********************************************************************************
// PantherID:  [6228555]
// CLASS: COP 2210 – [2019]
// ASSIGNMENT # [#1]
// DATE: [9/18/19]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

package lotteryNumberGenerator;
import java.util.Random;
import javax.swing.JOptionPane;
public class lotteryNumberGenerator {


    public static void main(String[] args) {
        Random r = new Random();  
        Random x = new Random(); 
        int fNum1 = 1 + r.nextInt(36);
        int fNum2 = 1 + r.nextInt(36);
        int fNum3 = 1 + r.nextInt(36);
        int fNum4 = 1 + r.nextInt(36);
        int fNum5 = 1 + r.nextInt(36);
        int fNum6 = 1 + r.nextInt(36);
        
        int lNum1 = 1 + r.nextInt(53);
        int lNum2 = 1 + r.nextInt(53);
        int lNum3 = 1 + r.nextInt(53);
        int lNum4 = 1 + r.nextInt(53);
        int lNum5 = 1 + r.nextInt(53);
        int lNum6 = 1 + r.nextInt(53);
        
        
      JOptionPane.showMessageDialog(null, "Here are your winning numbers! \n" 
            + "Fantasy 5: " 
            + fNum1 + " " + fNum2 + " " 
            + fNum3 + " " + fNum4 + " " 
            + fNum5 + " " + fNum6 
            + "\nThe Lotto: " 
            + lNum1 + " " + lNum2 + " " 
            + lNum3 + " " + lNum4 + " " 
            + lNum5 + " " + lNum6);
      
      
        
    }
    
}
