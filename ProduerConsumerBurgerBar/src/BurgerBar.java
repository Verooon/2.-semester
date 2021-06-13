public class BurgerBar
{
  private int numberOfBurgers;
  private  int maxNumberOfBurgers;

  public BurgerBar(int maxNumberOfBurgers)
  {
    this.maxNumberOfBurgers =maxNumberOfBurgers;
    numberOfBurgers = 0;
  }

  public void makeBurger(String employeeName)
  {
    if(numberOfBurgers < maxNumberOfBurgers)
     numberOfBurgers++;
    else
      System.out.println("No place for more burgers");
  }

  public void eatBurger(String who)
  {
    if(numberOfBurgers != 0)
     numberOfBurgers--;
    else
      System.out.println("No more burgers, please wait");
  }

  public int getNumberOfBurgers()
  {
    return numberOfBurgers;
  }
}
