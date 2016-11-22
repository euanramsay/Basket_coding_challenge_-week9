import challenge.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;
import java.util.ArrayList;

public class BasketTest{
  Basket basket;
  Product orange;
  Product apple;
  Product banana;
  Product pineapple;
  Discount bogof;
  Discount tenPercent;
  Discount loyaltyCard;

  @Before 
  public void before() {
    basket = new Basket("Gonzo the Great");
    orange = new Product("Orange", 30);
    apple = new Product("Apple", 25);
    banana = new Product("Banana", 15);
    pineapple = new Product("Pineapple", 100);
  }

  @Test
  public void hasCustomerName(){
    assertEquals("Gonzo the Great", basket.getCustomerName());
  }

  @Test
  public void canGetNumberOfProdcutsInBasket(){
    basket.putProductInBasket(orange);
    basket.putProductInBasket(apple);
    assertEquals(2, basket.getNumberOfProductsInBasket());
  }

  

}