public class BurgerBarCustomer implements Runnable
{
  private int burgersToEat;
  private String name;
  private BurgerBar burgerBar;

  public BurgerBarCustomer(String name, int burgersToEat, BurgerBar burgerBar)
  {
    this.name = name;
    this.burgersToEat = burgersToEat;
    this.burgerBar = burgerBar;
  }

  @Override public void run()
  {
    if(burgersToEat >= burgerBar.getNumberOfBurgers())
    {
      for (int i = 0; i < burgersToEat; i++)
      {
        System.out.println(name + " is eating burger");
        burgerBar.eatBurger(name);
        notifyAll();
       try
       {
         wait(5000);
       }
       catch (InterruptedException e)
       {
         e.printStackTrace();
       }
      }
      System.out.println(name + "finished eating");
      notifyAll();
    }
    else
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}
