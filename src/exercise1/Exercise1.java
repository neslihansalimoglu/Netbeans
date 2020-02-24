/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.time.Clock;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Neslihan Salimoglu
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***This is the first exersice with Netbeans***");
        
        int a = 4;
        int b = 5;
        
        System.out.println();
        System.out.println("Equality: a==b " + (a==b));
        System.out.println("Equality: a!=b " + (a!=b));
        System.out.println("Equality: !(a==b)" + !(a==b));
        
        System.out.println();
        System.out.println("\nRelational: a<b " + (a<b));
        System.out.println("Relational: a<=b " +(a<=b));
        System.out.println("Relational: a>b " + (a>b));
        System.out.println("Relational: a>=b " + (a>=b));
        
        System.out.println("\nLogical: !(a<b) " + !(a<b));
        System.out.println("Logical: T && T " + (true && false));
        System.out.println("Logical: T && F " + (true && false));
        System.out.println("Logical: F && T " + (false && true));
        
        System.out.println("\nLogical: T || T " + (true || true));
        System.out.println("Logical: T || F " + (true || false));
        System.out.println("Logical: F || T " + (false ||true));
        
        System.out.println();
        if (a<b) {
            System.out.println("a is less then b");   
        }
        else{
            System.out.println("Outside the if ");
        }
        
        System.out.println("Conditional operator");
        String result;
        result = (a==b)? "TRUE":"FALSE";
        
        System.out.println("Is a equal b? " + (a==b));
        System.out.println("Is a equal b? " + result);
        
        /*The previous code is equivalent to the if/else
        if (a==b) {
            result ="Yes ofcourse it is TRUE";
        }
        else{
            result = "FALSE";
        }*/
    }
}

