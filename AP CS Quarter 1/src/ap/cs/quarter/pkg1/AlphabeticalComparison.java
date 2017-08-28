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
public class AlphabeticalComparison {
    
public static void main(String[] args){
        String name1, name2;
        int namevalue;
Scanner in = new Scanner(System.in);
System.out.println("What is your name?");
    name1 = in.nextLine();
System.out.println("What is your best friend's name?");
    name2 = in.nextLine();
if(name1.compareTo(name2) < 0) {
    System.out.println("Comparison result: " + name1 + " comes before " + name2);
}else if(name1.compareTo(name2) < 0){
    System.out.println("Comparison result: " + name2 + " comes before " + name1);
}else{
    System.out.println("They are the same name!");
}
}
}
