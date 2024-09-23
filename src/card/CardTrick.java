/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Fatoumata Sampil 991762197
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand=new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of your card (1 to 13): ");
        int userValue=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the suit of your card (0-3 where 0=Hearts,"
                + "1=Diamonds,"+ "2=clubs,"+ "3=Spades)");
        String userSuit=scanner.next();
        Card userCard=new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // and search magicHand here
        boolean findCard=false;
        for(Card c : magicHand){
            if (c.getValue()==userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit()))
            {
                findCard=true;
                break;
            }
            
            
        }
        if (findCard){
            System.out.println("Your card is in the magic hand");
        }
        else{
        System.out.println("Your card is not in the magic hand");
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    }
    
}
