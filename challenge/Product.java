package challenge;

import java.util.Collections;

public class Product {
  private String name;
  private double cost;
  private boolean bogof;

  public Product(String name, double cost, boolean bogof){
    this.name = name;
    this.cost = cost;
    this.bogof = bogof;
  }

  public String getName() {
    return name;
  }

  public double getCost() {
    return cost;
  }

  public boolean getIsBogof() {
    return bogof;
  }


}