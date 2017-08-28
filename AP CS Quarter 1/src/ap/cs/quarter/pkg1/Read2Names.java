/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quarter1;
import java.util.Scanner;
/**
 *
 * @author matthew.gonzalgo
 */
public class Read2Names {

public static void main (String[] args) {
    String name1, name2;
Scanner in = new Scanner(System.in);
System.out.println("What is your name?");
    name1 = in.nextLine();
System.out.println("What is your best friend's name?");
    name2 = in.nextLine();
System.out.println(name1.length());
System.out.println(name2.length()); 
if(name1.equalsIgnoreCase(name2)){
    System.out.println("You share a common name");
}else{
    System.out.println("Your names are different!");
}
   
}
}
