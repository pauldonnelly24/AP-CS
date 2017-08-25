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
public class Read2Fractions {
    
public static void main(String[] args) {
int a, b, c, d, addNumerator, addDenominator;
Scanner in = new Scanner(System.in);
System.out.println("enter the first numerator");
a = in.nextInt();

System.out.println("enter the second numerator");
c = in.nextInt();

addNumerator = a + c;

System.out.println("enter the first denomiator");
b = in.nextInt();

System.out.println("enter the second denominator");
d = in.nextInt();

addDenominator = b + d;

System.out.println(addNumerator + "/" + addDenominator);
}    
}
