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
    basket = new Basket("Gonzo the Great", true);
    orange = new Product("Orange", 0.30, false);
    apple = new Product("Apple", 0.25, false);
    banana = new Product("Banana", 0.15, false);
    pineapple = new Product("Pineapple", 1.00, true);
    basket.putProductInBasket(orange);
    basket.putProductInBasket(apple);
  }

  @Test
  public void canGetCustomerName(){
    assertEquals("Gonzo the Great", basket.getCustomerName());
  }

  @Test
  public void canGetIsCusomerLoyaltyCardHolder(){
    assertEquals(true, basket.getCustomerLoyalyCardStatus());
  }

  @Test
  public void canGetNumberOfProdcutsInBasket(){
    assertEquals(2, basket.getNumberOfProductsInBasket());
  }

  @Test
  public void canGetTotalCostOfProductsInBasket(){
    assertEquals(0.55, basket.getTotalCost(), 0.2);
  }

  @Test
  public void canRemoveProductFromBasket(){
    basket.removeProductFromBasket(orange);
    assertEquals(1, basket.getNumberOfProductsInBasket());
  }

  

}