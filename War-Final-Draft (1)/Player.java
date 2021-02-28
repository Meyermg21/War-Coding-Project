import java.util.Scanner;

public class Player
{
  //instance variables
  private Hand hand;
  private String name;
  private int playerNumber;

  //Constructor
  public Player(String playerName, int playerNumber)
  {
    this.hand = hand;  //this refers to instance variable
    name = playerName;
    this.playerNumber = playerNumber;
  }


  //Moving on to next player will be handled by dealer
  //Dealer will decide who wins, and give winnings


  //Methods
  

    //Takes card from the DEALER and puts it in hand (consider...who calls takeCard?)
    //Display players hand to console
    //Ask player which card to replace
    //Set that card
  public void takeCard(Card c)
  {
    Scanner reader = new Scanner(System.in);
    System.out.println(hand.toString());
    int input;

    do{
      System.out.print("Which card would you like to pick?  Enter number between 1 and 3: ");
      input = reader.nextInt();
    }while(input < 1 || input > 3);

    hand.setCard(c, input);
  } //end takeCard
  public void takeCardAgain(Card c)
  {
    Scanner reader = new Scanner(System.in);
    System.out.println(hand.toString());
    int input;

    do{
      System.out.print("Which other card would you like to pick?  Enter number of unpicked card between 1 and 3: ");
      input = reader.nextInt();
    }while(input < 1 || input > 3);

    hand.setCard(c, input);
  } //end takeCard

  public void setHand(Hand h)
  {
    hand = h;
  }

  //showHand prints the hand to console
  public void showHand()
  {
    System.out.println(hand.toString());
  }
  public String returnPlayerName()
  {
    return name;
  }
} //end class