import java.util.HashMap;
import java.util.Map;

public class StarSignFactory
{
  private static Map<String, AbstractStarSign > signs = new HashMap();

  public static AbstractStarSign getStarSign (String name)
  {
    AbstractStarSign item = signs.get(name);

    if (item == null)
    {
      item = new StarSign(name);
      signs.put(name, item);
    }
    return item;
  }
}
