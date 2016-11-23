package challenge;

import java.util.Collections;

public class Product {
  private String name;
  private int cost;
  private boolean bogof;

  public Product(String name, int cost, boolean bogof){
    this.name = name;
    this.cost = cost;
    this.bogof = bogof;
  }

  public String getName() {
    return name;
  }

  public int getCost() {
    return cost;
  }

  public boolean getIsBogof() {
    return bogof;
  }


}