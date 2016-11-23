package challenge;

import java.util.Collections;
import java.util.ArrayList;


public class Basket {
  private String customerName;
  private ArrayList<Product> customerBasket;

  public Basket(String customerName){
    this.customerName = customerName;
    this.customerBasket = new ArrayList<Product>();
  }

  public String getCustomerName() {
    return customerName;
  }

  public void putProductInBasket(Product product) {
    customerBasket.add(product);
  }

  public int getNumberOfProductsInBasket() {
    return customerBasket.size();
  }

  public int getTotalCost() {
    int totalCost = 0;
    for (Product item : customerBasket)
      totalCost = totalCost + item.getCost(); {
        return totalCost;
      }
    }

  }