package Synchronized;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest
{
  private ArrayList arrayList;
  @org.junit.jupiter.api.BeforeEach void setUp()
  {
    arrayList = new ArrayList();
  }

  @Test
  public void addElementIndexZero()
  {
    //When list is empty
    arrayList.add(0,"A");
    assertTrue(arrayList.contains("A"));

    //When list is empty
    arrayList.add(0,null);
    assertEquals(arrayList.get(0),null);
  }

  @Test public void isEmpty()
  {
    assertTrue(arrayList.isEmpty());
  }

  @Test public void isNotEmpty()
  {
    arrayList.add("A");
    assertTrue(!arrayList.isEmpty());
  }

  @Test public void containsZero()
  {
    assertEquals(false, arrayList.contains(0));
  }

  @Test public void containsOne()
  {
    arrayList.add(1);
    assertEquals(true, arrayList.contains(1));
  }
}
