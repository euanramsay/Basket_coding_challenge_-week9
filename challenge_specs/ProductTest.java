import challenge.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;
import java.util.ArrayList;

public class ProductTest{
  Product orange;
  Product pineapple;

  @Before 
  public void before() {
    orange = new Product("Orange", 0.30, false);
    pineapple = new Product("Pineapple", 1.00, true);
  }

  @Test
  public void canGetProductName(){
    assertEquals("Orange", orange.getName());
  }

  @Test
  public void canGetIfProductIsBogof(){
    assertEquals(true, pineapple.getIsBogof());
    assertEquals(false, orange.getIsBogof());
  }
  

}