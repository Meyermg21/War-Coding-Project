//import statements

//Classes must be public to be used*
public class Hand
{
  //Instance variables (attributes) should be private
  private Card c1;
  private Card c2;
  private Card c3;
  private Card c4;
  
  //Constructors need to be public
  public Hand(Card c1, Card c2, Card c3)
  {
    this.c1 = c1;
    this.c2 = c2;
    this.c3 = c3;
  }
  
  //Methods can be public or private
  //we need a way to discard "old" cards
  public void setCard(Card c, int position)
  {
    if(position == 1)
    {
      c1 = c; //what happens to the old card? Garbage collected
    }
    else if(position == 2)
    {
      c2 = c;
    }
    else 
    {
      c3 = c;
    }
  }
  
  //toString method -> give all data as CSV
  public String toString()
  {
    String str = "Card 1: " + c1.toString() + "\nCard 2: " + c2.toString() + "\nCard 3: " + c3.toString();
    return str;
  }
  
  public Card getCard(int position)
  {
    if(position == 1)
    {
      return c1;
    }
    else if(position == 2)
    {
      return c2;
    }
    else if(position == 3)
    {
      return c3;
    }
    else
    {
      return c4;
    }
  }
  //Helper methods, which are used internally, are generally private
}