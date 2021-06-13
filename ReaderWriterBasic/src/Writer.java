public class Writer implements Runnable
{
  private ReadWrite lock;
  private String name;

  public Writer(String name, ReadWrite lock)
  {
    this.name = name;
    this.lock = lock;
  }

  private void beforeWriting(int min, int max)
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

  private void writing(int min, int max)
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

  private void afterWriting(int min, int max)
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
        beforeWriting(1000, 2000);
        lock.acquireWrite();
        writing(500, 1000);
        lock.releaseWrite();
        afterWriting(5000, 10000);
     }
  }
}
