public class Person
{
  private String name;
  private AbstractStarSign starSign;

  public Person(String name, StarSign starSignName)
  {
    this.name = name;
    this.starSign = StarSignFactory.getStarSign(starSignName.toString());
  }

  public String getName()
  {
    return name;
  }

  public AbstractStarSign getStarSign()
  {
    return starSign;
  }

  public String toString()
  {
    return name + ", " + starSign;
  }
}