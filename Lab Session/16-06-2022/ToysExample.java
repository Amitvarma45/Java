
package Corejava;
import java.util.Scanner;
class ToysExample
{
	//creating Multidimentional String Array
	String[][] toys = new String [5][5];
	// Constructor
    ToysExample()
    {
    toys [0][0]="1";
    toys[0][1]="Ben Ten";

    toys [1][0]="2";
    toys [1][1] ="PJ Mask";

    toys [2][0]="3";
    toys [2][1]="Oggy";

    toys [3][0]="4";
    toys [3][1]="Shinchan";

    toys [4][0]="5";
    toys[4][1]="Motu Patlu";

    }
    //static getToy method
    public static String getToy(int price)
    {
        String toyname;      
        // Switch Cases
        switch(price)
        {
        	//price of toy in case
            case 149: 
                toyname = "Ben Ten";
                return toyname;
            
            case 449:
                toyname = "PJ Mask";
                return toyname;
                
            case 349:
                toyname = "Oggy";
                return toyname;
                
            case 239:
                toyname = "Shinchan";
                return toyname;
                
            case 629:
                toyname = "Motu Patlu";
                return toyname;
                
            default:
                toyname = "No Toys Available in this Range";
                return toyname;
        }
    }
    public static void main(String[] args)
    {
    	System.out.println("Enter the Prize of Toy : ");
    	//Creating Obj of Scanner class
        Scanner sc = new Scanner (System.in);    
        int price = sc.nextInt ();
        System.out.println(getToy(price));    
    }
}
