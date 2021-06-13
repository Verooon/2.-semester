import java.util.Random;

public class BurgerBarEmployee implements Runnable
{
  private String name;
  private BurgerBar burgerBar;

  public BurgerBarEmployee(String name, BurgerBar burgerBar)
  {
    this.name = name;
    this.burgerBar = burgerBar;
  }

  @Override public void run()
  {
    while (true)
    {
      if(burgerBar.getNumberOfBurgers() < 2)
      {
        int y = (int) (Math.random() * (15 - 3 + 1));
        for (int i=0; i<y; i++)
        {
          burgerBar.makeBurger(name);
          System.out.println(name +" made burger");
          notifyAll();
          try
          {
            wait(6000);
          }
          catch (InterruptedException e)
          {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
