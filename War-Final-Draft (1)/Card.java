//import statements

//Classes must be public to be used*
public class Card
{
  //Instance variables (attributes) should be private
  private int number;  //A = 1, J = 11, Q = 12, K = 13
  private String suit; //Heart, Spade, Diamond, Club
  private String color; //Black or Red
  
  //Constructors need to be public
  public Card(int number, String suit)
  {
    //Good place to check input validity
    //The parameter number is a local variable and only exists in this method
    //The key word this means it is the INSTANCE, not the LOCAL variable
    this.number = number; //setting the instance variable with the value of the local variable
    this.suit = suit;
    if(suit.equals("Heart") || suit.equals("Diamond"))
    {
      this.color = "Red";
    }
    else
    {
      this.color = "Black";
    }
  }
  
  //Methods can be public or private
  public int getNumber()
  {
    return number; //this.number is not needed, since no local variable of same name
  }
  public String getSuit()
  {
    return suit;
  }
  public String getColor()
  {
    return color;
  }
  public String toString()
  {
    return number + " " + suit;
  }
  //Helper methods, which are used internally, are generally private
}