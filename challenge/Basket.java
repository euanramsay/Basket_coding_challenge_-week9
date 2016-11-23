package challenge;

import java.util.Collections;
import java.util.ArrayList;


public class Basket {
  private String customerName;
  private boolean loyaltyCard;
  private ArrayList<Product> customerBasket;

  public Basket(String customerName, boolean loyaltyCard){
    this.customerName = customerName;
    this.loyaltyCard = loyaltyCard;
    this.customerBasket = new ArrayList<Product>();
  }

  public String getCustomerName() {
    return customerName;
  }

  public boolean getCustomerLoyalyCardStatus() {
    return loyaltyCard;
  }

  public void putProductInBasket(Product product) {
    customerBasket.add(product);
  }

  public void removeProductFromBasket(Product product) {
    for (Product item : customerBasket)
      if (product.equals(item)) {
        customerBasket.remove(product);
      }
  }

  public int getNumberOfProductsInBasket() {
    return customerBasket.size();
  }

  public double getTotalCost() {
    double totalCost = 0.0;
    for (Product item : customerBasket)
      totalCost = totalCost + item.getCost(); {
        return totalCost;
      }
    }

  public void removeAllProductsFromBasket() {
    customerBasket.clear();
  }

  }