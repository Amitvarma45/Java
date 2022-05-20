package Corejava;

import java.util.Scanner;

public class SingleDuser {

	 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
  int len; //length of Array
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Array length");
  len=sc.nextInt();
  int a[]=new int[len];
  System.out.println("Enter: "+len+"Elements To Store In Array\n");
    for(int i=0;i<len;i++) {
        a[i]=sc.nextInt();
    }
System.out.println("Elememt In Array Are: \n");
for(int i=0;i<len;i++) {
    
    System.out.print(a[i]+" ");
}
}
}
