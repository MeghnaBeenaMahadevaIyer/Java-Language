/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutes;
import java.util.*;

/**
 *
 * @author Megzieboo
 */
public class Minutes 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of minutes : ");
        
        int mins = s.nextInt();
        int yrs = mins/(60*24*365);
        int days = (mins/(60*24))%365;
        System.out.println("\n"+mins+" minutes is approximately "+yrs+" years and "+days+" days.");
    }
    
}
