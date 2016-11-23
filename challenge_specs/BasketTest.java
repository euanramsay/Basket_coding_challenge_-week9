import challenge.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;
import java.util.ArrayList;

public class BasketTest{
  Basket basket1;
  Basket basket2;
  Product orange;
  Product apple;
  Product banana1;
  Product banana2;
  Product banana3;
  Product pineapple1;
  Product pineapple2;
  Product vegBox;

  @Before 
  public void before() {
    basket1 = new Basket("Gonzo the Great", true);
    basket2 = new Basket("Rizzo the Rat", false);
    orange = new Product("Orange", 0.30, false);
    apple = new Product("Apple", 0.25, false);
    banana1 = new Product("Banana", 0.15, false);
    banana2 = new Product("Banana", 0.15, false);
    banana3 = new Product("Banana", 0.15, false);
    pineapple1 = new Product("Pineapple", 1.00, true);
    pineapple2 = new Product("Pineapple", 1.00, true);
    vegBox = new Product("Veg Box", 19.95, false);
    basket1.putProductInBasket(orange);
    basket1.putProductInBasket(apple);
  }

  @Test
  public void canGetCustomerName(){
    assertEquals("Gonzo the Great", basket1.getCustomerName());
  }

  @Test
  public void canGetIsCusomerLoyaltyCardHolder(){
    assertEquals(true, basket1.getCustomerLoyalyCardStatus());
  }

  @Test
  public void canGetNumberOfProdcutsInBasket(){
    assertEquals(2, basket1.getNumberOfProductsInBasket());
  }

  @Test
  public void canGetTotalCostOfProductsInBasket(){
    assertEquals(0.55, basket1.getTotalCost(), 0.2);
  }

  @Test
  public void canRemoveProductFromBasket(){
    basket1.removeProductFromBasket(orange);
    assertEquals(1, basket1.getNumberOfProductsInBasket());
  }

  @Test
  public void canEmptyShoppingBasketOfAllProdcuts(){
    basket1.emptyBasket();
    assertEquals(0, basket1.getNumberOfProductsInBasket());
  }

  @Test
  public void canApplyBogofDiscount(){
    basket1.putProductInBasket(banana1);
    basket1.putProductInBasket(banana2);
    basket1.putProductInBasket(pineapple1);
    basket1.putProductInBasket(pineapple2);
    basket1.applyBogofDiscount();
    assertEquals(1.85, basket1.getTotalCost(), 0.02);
  }

  @Test
  public void canOnlyApplyTenPercentDiscountIfUnderTwentyPounds(){
    basket1.putProductInBasket(banana1);
    basket1.putProductInBasket(banana2);
    basket1.putProductInBasket(banana3);
    basket1.applyBogofDiscount();
    basket1.applyTenPercentDiscount();
    assertEquals(1.00, basket1.getFinalCost(), 0.02);
  }

  @Test
  public void canOnlyApplyTenPercentDiscountIfOverTwentyPounds(){
    basket1.putProductInBasket(vegBox);
    basket1.applyBogofDiscount();
    basket1.applyTenPercentDiscount();
    assertEquals(18.45, basket1.getFinalCost(), 0.02);
  }

  @Test
  public void canOnlyApplyTwoPercentDiscountIfMember(){
    basket1.putProductInBasket(banana1);
    basket1.putProductInBasket(banana2);
    basket1.putProductInBasket(banana3);
    basket1.applyBogofDiscount();
    basket1.applyTenPercentDiscount();
    basket1.applyTwoPercentDiscount();
    assertEquals(0.98, basket1.getFinalCost(), 0.02);
  }

  @Test
  public void canApplyTwoPercentDiscountIfMember(){
    basket2.putProductInBasket(banana1);
    basket2.putProductInBasket(banana2);
    basket2.putProductInBasket(banana3);
    basket2.applyBogofDiscount();
    basket2.applyTenPercentDiscount();
    basket2.applyTwoPercentDiscount();
    assertEquals(0.45, basket2.getFinalCost(), 0.02);
  }





  

}