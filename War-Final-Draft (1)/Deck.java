import java.util.Random;


public class Deck
{
  //[] indicates array, which can hold a collection of Card objects, more on that in a future unit
  private Card[] deck = new Card[52];
  private Card[] deck1 = new Card [27];
  private Card[] deck2 = new Card [27];
 
  
  private int deckSize = 52;
 private int deckSize1 = 27;
 private int deckSize2 = 27;
  private String[] suits = {"Heart", "Spade", "Diamond", "Club"};

  private Random generator = new Random();


  //Constructor builds std 52 card deck

  public Deck()
  {
    int cardNumber = 0;
    
    for(int i = 0; i<suits.length; i++)
    {
      for(int j = 1; j <= 13; j++)
      {
        Card c = new Card(j,suits[i]);
        
          deck[cardNumber] = c;
  
        cardNumber++;
      }
    }
    shuffle();
  for (int x = 1; x < 27; x++)
  {
    deck2[x] = getCard();
  }
for (int x = 1; x < 27; x++)
{
  deck1[x] = getCard();
}
}

//Public Methods


//Take card from "bottom" of deck
public Card getCard()
  {
    deckSize--;
    return deck[deckSize];
  }
  public Card getCard1()
  {
    
    deckSize1--;
    return deck1[decksize1+1];
  }
  public Card getCard2()
  {
    deckSize2--;
    return deck2[decksize2+1];
  }

//HELPER METHODS
public int getDeckSize() {
  return deckSize;
}
public int getDeckSize1()
{
  return deckSize1;
}
public int getDeckSize2()
{
  return deckSize2;
}




//Shuffles either deck
 private void shuffle()
  {
    for(int i = 0; i<deckSize; i++)
    {
      int randomNumber = generator.nextInt(deckSize);
      swap(i, randomNumber);
    }
  }
  private void shuffle1()
  {
    for(int i = 0; i<deckSize; i++)
    {
      int randomNumber = generator.nextInt(deckSize);
      swap1(i, randomNumber);
    }
  }
  private void shuffle2()
  {
    for(int i = 0; i<deckSize; i++)
    {
      int randomNumber = generator.nextInt(deckSize);
      swap2(i, randomNumber);
    }
  }

//Swaps two cards in the deck
 private void swap(int i, int j)
  {
    Card c = deck[i];
    deck[i] = deck[j];
    deck[j] = c;
  }
  private void swap1(int i, int j)
  {
    Card c = deck1[i];
    deck1[i] = deck1[j];
    deck1[j] = c;
  }
  private void swap2(int i, int j)
  {
    Card c = deck2[i];
    deck2[i] = deck2[j];
    deck2[j] = c;
  }
  
}