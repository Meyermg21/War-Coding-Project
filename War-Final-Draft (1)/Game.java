import java.util.Scanner;
import java.util.Random;
import java.lang.Object.*;
import javax.lang.model.util.ElementScanner6;

public class Game
{
  //Instance Variables
  Deck deck;
  Scanner stringReader;
  Scanner intReader;
  Player p1;
  Player p2;
  int p1IsPlaying = 1;
  int p2IsPlaying = 1;
  Card c1  = new Card (1, "Spade");
  Card c2= new Card (1, "Spade");
  Card c3= new Card (1, "Spade");
  Card currentc1 = new Card (1, "Spade");
  Card currentc2 = new Card (1, "Spade");
  int p1score = 0;
  int p2score = 0;

  public Game()
  {
   deck = new Deck();
    stringReader = new Scanner(System.in);
    intReader = new Scanner(System.in);

    //Get Player 1 Info & Create Player 1 Hand
    System.out.print("Enter player name: ");
    String name = stringReader.nextLine();

    //Create Player1
    p1 = new Player(name, 1);


    //Get Player 2 Info & Create Player 2 Hand
    System.out.print("Enter player name: ");
    name = stringReader.nextLine();

  

    //Create Player2
    p2 = new Player(name, 2);
    //Start flipping cards;
  
    
  }
 public void play()
  {

while ((p1score != 26) || (p2score != 26))
{
 String name1 = p1.returnPlayerName();
String name2 = p2.returnPlayerName();

currentc1 = deck.getCard1();
currentc2 = deck.getCard2();

if(currentc1 == null)
{
  System.out.println("One player is out of cards. Determining winner...");
  if(p1score > p2score)
   {
     System.out.println(name1+" Wins!");
     break;
   }
   else
   {
     System.out.println(name2 + " Wins!");
     break;
   }
}

System.out.println(name1 + "'s" + " Card is a " + currentc1.getNumber() + " of " + currentc1.getSuit());
System.out.println(name2 + "'s " + " Card is a " + currentc2.getNumber() + " of " + currentc2.getSuit());

if(currentc1.getNumber() > currentc2.getNumber() )
{
p1score = p1score + 1;
 System.out.println(name1 + " has " + p1score + "wins");
 System.out.println(name2 + " has " + p2score + "wins");

}
else if (currentc1.getNumber()<currentc2.getNumber())
{
  p2score = p2score + 1;
  System.out.println(name1 + " has " + p1score + "wins");
 System.out.println(name2 + " has " + p2score + "wins");

}
else 
{
 if (p1score + p2score > 52)
 {
     System.out.println(name1 + " has " + p1score + "cards");
    System.out.println(name2 + " has " + p2score + "cards");  
    System.out.println("oops, ran out of cards");
 
   if(p1score > p2score)
   {
     System.out.println(name1+" Wins!");
     break;
   }
   else
   {
     System.out.println(name2 + " Wins!");
     break;
   }

   
}
else if(p1IsPlaying == 1)
    {
    System.out.println(name1 + "'s Turn!");
        currentc1 = tieChoice(1);
        System.out.println(name1 + "'s" + " Card is a " + currentc1.getNumber() + " of " + currentc1.getSuit());
    

    }

    //PLAYER 2
    if(p2IsPlaying == 1)
    {
      System.out.println(name2 + "'s Turn!");
      currentc2 =tieChoice(2);
      System.out.println(name1 + "'s" + " Card is a " + currentc2.getNumber() + " of " + currentc2.getSuit() );
  
    }
     if(currentc1.getNumber()>currentc2.getNumber())
     {
       System.out.println(name1 + " wins the tie. +1 point");
       p1score= p1score + 1;

     }
if (currentc1.getNumber()<currentc2.getNumber())
{
  System.out.println(name2 + " wins the tie. +1 point");
  p2score= p2score + 1;
}

}

}
String name1 = p1.returnPlayerName();
String name2 = p2.returnPlayerName();
if ((p1score == 26) || (p2score == 26))
  {
     System.out.println(name1 + " has " + p1score + "points");
    System.out.println(name2 + " has " + p2score + "points");
    if(p1score > p2score)
   {
     System.out.println(name1+" Wins!");
   }
   else if (p1score < p2score)
   {
     System.out.println(name2 + " Wins!");
   }
   else 
   {
      System.out.println("Yall Tie");
   }
  }

return;
  }
  private Card tieChoice(int player)
  {
    if(deck.getDeckSize1() < 4)
    {
      System.out.println("Not enough cards for tiebreaker");
      return deck.getCard1();
    }
    if(deck.getDeckSize2() < 4)
    {
      System.out.println("Not enough cards for tiebreaker");
      return deck.getCard2();
    }
    Random generator = new Random();
    Hand sand = new Hand(c1, c2, c3);
    if (player == 1)
    {
     sand = new Hand(deck.getCard1(), deck.getCard1(), deck.getCard1());
    }
    else
    {
     sand = new Hand(deck.getCard2(), deck.getCard2(), deck.getCard2());
    }
    System.out.println("Which card would you like to choose? \n\t1, 2 , 3");
    int choice = intReader.nextInt();
    if(choice == 1)
    {
      return sand.getCard(1);
    }
    else if(choice == 2)
    {
      return sand.getCard(2);
    }
    else if (choice == 3)
    {
      return sand.getCard(3);
    }
    else 
    {
      return sand.getCard(generator.nextInt(3) + 1);
    }
  }
}
