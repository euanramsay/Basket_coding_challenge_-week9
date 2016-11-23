import challenge.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;
import java.util.ArrayList;

public class BasketTest{
  Basket basket;
  Product orange;
  Product apple;
  Product banana1;
  Product banana2;
  Product banana3;
  Product pineapple1;
  Product pineapple2;

  @Before 
  public void before() {
    basket = new Basket("Gonzo the Great", true);
    orange = new Product("Orange", 0.30, false);
    apple = new Product("Apple", 0.25, false);
    banana1 = new Product("Banana", 0.15, false);
    banana2 = new Product("Banana", 0.15, false);
    banana3 = new Product("Banana", 0.15, false);
    pineapple1 = new Product("Pineapple", 1.00, true);
    pineapple2 = new Product("Pineapple", 1.00, true);
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

  @Test
  public void canEmptyShoppingBasketOfAllProdcuts(){
    basket.emptyBasket();
    assertEquals(0, basket.getNumberOfProductsInBasket());
  }

  @Test
  public void canApplyBogofDiscount(){
    basket.putProductInBasket(banana1);
    basket.putProductInBasket(banana2);
    basket.putProductInBasket(pineapple1);
    basket.putProductInBasket(pineapple2);
    basket.applyBogofDiscount();
    assertEquals(1.85, basket.getTotalCost(), 0.02);
  }

  @Test
  public void canOnlyApplyTenPercentDiscountIfUnderTwentyPounds(){
    basket.putProductInBasket(banana1);
    basket.putProductInBasket(banana2);
    basket.putProductInBasket(banana3);
    basket.applyTenPercentDiscount();
    assertEquals(1.00, basket.getTotalCost(), 0.02);
  }



  

}