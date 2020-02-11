/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class loopGame {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num, guess;
        boolean done;
        
        num = (int) (Math.random() * 100);
        done = false;
        
        while (!done) {
            System.out.println("Enter an integer >= to 0 and < than 100: ");
            guess = input.nextInt();
            
            if (guess == num) {
                System.out.println("You guessed the number correctly ");
                done = true;
            } else if (guess < num) {
                System.out.println("Your guess is less \n try again ! ");
            } else {
                System.out.println("Your guess is higher \n try again ! ");
            }
        } 
    }

}
