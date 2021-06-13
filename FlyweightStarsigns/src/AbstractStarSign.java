public abstract class AbstractStarSign
{
  private String name;
  private DateInterval interval;

  //Error:(11, 3) java: constructor AbstractStarSign in class ->
  // AbstractStarSign cannot be applied to given types;
  //required: java.lang.String
  //found: no arguments
  //reason: actual and formal argument lists differ in length

  public AbstractStarSign(String name)
  {
    this.name=name;
    this.interval = getInterval();
  }

  public abstract String getName();

  public abstract DateInterval getInterval();

  public abstract String toString();

}
