/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap.cs.quarter.pkg1;
import java.util.Scanner;
/**
 *
 * @author Matthew
 */
public class Read3Prices {

 public static void main(String[] args){
double price1, price2, price3, sum, average;

 Scanner in = new Scanner(System.in);
 System.out.println("enter the 1st price");
 price1 = in.nextDouble();
 System.out.println("enter the 2nd price");
 price2 = in.nextDouble();
 System.out.println("enter the 3rd price");
 price3 = in.nextDouble();
 sum = price1 + price2 + price3;
 average = sum/3;
 System.out.printf("$%.2f", average);
}
}
