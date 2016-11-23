import challenge.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;
import java.util.ArrayList;

public class ProductTest{
  Product orange;
  Product apple;
  Product banana;
  Product pineapple;

  @Before 
  public void before() {
    orange = new Product("Orange", 0.30, false);
    apple = new Product("Apple", 0.25, false);
    banana = new Product("Banana", 0.15, false);
    pineapple = new Product("Pineapple", 1.00, true);
  }

  @Test
  public void canGetProductName(){
    assertEquals("Orange", orange.getName());
  }


  

}