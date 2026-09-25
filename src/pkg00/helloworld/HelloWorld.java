/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.helloworld;
import java.util.Scanner;

/**
 *
 * @author yhorvais
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ex2:
        System.out.println("Hello World by YH on github!");
        System.out.println("Ligne 2");
        
        Ex4*/
    Scanner sc = new Scanner(System.in);
    
        System.out.print("x : ");
        int x = sc.nextInt();
    
        System.out.print("y : ");
        int y = sc.nextInt();

        System.out.println("Avant l'echange : x = " + x + ", y = " +y );

        int z = 0;
        
        z = x;
        x = y;
        y = z;

        System.out.println("Apres l'echange : x = " + x + ", y = " + y);
           
    }
    
}