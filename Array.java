/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;

/**
 *
 * @author Megzieboo
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a = new int [3][3];
        int[][] b = new int [3][3];
        int[][] sum = new int [3][3];
        int[][] prd = new int [3][3];
        int i,j,m;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 3x3 matrix : \n");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter another 3x3 matrix : \n");
        for(i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                b[i][j]=s.nextInt();
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The sum of the given two matrices : \n");
        for(i=0;i<3;++i)
        {
            for(j=0;j<3;++j)
            {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("The product of the given two matrices : \n");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                prd[i][j]=0;
                for(m=0; m<3; m++)
                {
                    prd[i][j]+=a[i][m]*b[m][j];
                }
                System.out.print(prd[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
    
}
