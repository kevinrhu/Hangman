/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import java.lang.*;
import java.util.*;
/*
 *
 * @author Pineapplelord
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words = {"cheese","ducks","bob"};
        int index = (int)(Math.random() * 3);
        String chosenWord = words[index];
        
        System.out.print("Your chosen word is: ");
        System.out.println(chosenWord);
        
        System.out.print("Please print your Letter:");
        char guess = 'a';
        
        char[] charArray = chosenWord.toCharArray();
        int wordLength = charArray.length;
        boolean[] array = new boolean[wordLenth];
        
        for (int i = 0; i < wordLength; i = i+1) {
            boolean found = guess == charArray[i];
        }
        
    }
    
}
