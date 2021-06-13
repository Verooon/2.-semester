public class Reader implements Runnable
{
  private ReadWrite lock;
  private String name;

  public Reader(String name, ReadWrite lock, Thread threadR)
  {
    this.name = name;
    this.lock = lock;
  }

  private void beforeReading(int min, int max)
  {
    long time = (long) (Math.random () * (max - min) + min);
    try
    {
      Thread.sleep(time);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

  private void reading(int min, int max)
  {
    long time = (long) (Math.random () * (max - min) + min);
    try
    {
      Thread.sleep(time);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

  private void afterReading(int min, int max)
  {
    long time = (long) (Math.random () * (max - min) + min);
    try
    {
      Thread.sleep(time);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

  @Override public void run()
  {
    while (true)
    {
      beforeReading(1000, 2000);
      lock.acquireWrite();
      reading(500, 1000);
      lock.releaseWrite();
      afterReading(5000, 10000);
    }
  }
}
