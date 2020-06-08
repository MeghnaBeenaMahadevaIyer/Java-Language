/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchtask;
import java.util.*;

/**
 *
 * @author Megzieboo
 */
public class SwitchTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a single digit : ");
        int c = s.nextInt();
        switch (c)
        {
            case 0 : System.out.println("Zero, did you really just choose ZERO?!");
                     break;
            case 1 : System.out.println("ONEderfull!!!");
                     break;
            case 2 : System.out.println("2 be..or not 2 be!");
                     break;
            case 3 : System.out.println("Who says 3's a crowd?! Trios RULE!");
                     break;
            case 4 : System.out.println("May the FOURth be with you!");
                     break;
            case 5 : System.out.println("Hiiigh Five, Paal!");
                     break;
            case 6 : System.out.println("6..6..6..Yooou Satan!!");
                     break;
            case 7 : System.out.println("SEVEN!..wait..there's SEVEN?!");
                     break;
            case 8 : System.out.println("To infinity! and beyoond!!!");
                     break;
            case 9 : System.out.println("Well, 9 is an upside down 6 sooo..YOU UPSIDE DOWN SATAN!!!");
                     break;
            default : System.out.println("Did I not specifically say SINGLE DIGIT?!");
        }
                
        
    }
    
}
