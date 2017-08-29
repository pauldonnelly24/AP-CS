/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.cs.quarter.pkg1;
import java.util.Scanner;
/**
 *
 * @author matthew.gonzalgo
 */
public class WhoAreYou {

public static void main (String[] args) {
String fullName, gender, title;
String m = "male";
String f = "female";
int age, height; 

Scanner in = new Scanner(System.in);

System.out.println("What is your gender? Enter either 'male' or 'female'");
gender = in.nextLine();
if (gender.equalsIgnoreCase(m) == true){
    title = "Mr.";
}else if(gender.equalsIgnoreCase(f) == true){
    title = "Mrs.";
}else{
    System.out.println("You either didn't enter 'male' or 'female correctly, or you somehow identify as a different gender...");
}

System.out.println("What is your full name?");
fullName = in.nextLine();

System.out.println("How old are you?");
age = in.nextInt();

System.out.println("How tall are you in inches?");
height = in.nextInt();

System.out.println("Hello " + title + " " fullName + "!");
System.out.println("You are a " + age + " year old " gender + " who is " + height + " inches tall!");
    //everything works without an error message except these last two lines
}
}
